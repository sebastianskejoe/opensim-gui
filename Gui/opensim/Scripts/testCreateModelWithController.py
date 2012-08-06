# ----------------------------------------------------------------------- #
# The OpenSim API is a toolkit for musculoskeletal modeling and           #
# simulation. See http://opensim.stanford.edu and the NOTICE file         #
# for more information. OpenSim is developed at Stanford University       #
# and supported by the US National Institutes of Health (U54 GM072970,    #
# R24 HD065690) and by DARPA through the Warrior Web program.             #
#                                                                         #   
# Copyright (c) 2005-2012 Stanford University and the Authors             #
#                                                                         #   
# Licensed under the Apache License, Version 2.0 (the "License");         #
# you may not use this file except in compliance with the License.        #
# You may obtain a copy of the License at                                 #
# http://www.apache.org/licenses/LICENSE-2.0.                             #
#                                                                         # 
# Unless required by applicable law or agreed to in writing, software     #
# distributed under the License is distributed on an "AS IS" BASIS,       #
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or         #
# implied. See the License for the specific language governing            #
# permissions and limitations under the License.                          #
# ----------------------------------------------------------------------- #

import javax.swing as swing
import org.opensim.modeling as modeling

modeling.OpenSimObject.setDebugLevel(3)
osimModel = modeling.Model()
osimModel.setName("tugOfWar")

# GROUND BODY

# Get a reference to the model's ground body
ground = osimModel.getGroundBody()

# Add display geometry to the ground to visualize in the GUI
ground.addDisplayGeometry("ground.vtp")
ground.addDisplayGeometry("anchor1.vtp")
ground.addDisplayGeometry("anchor2.vtp")

# BLOCK BODY
osimModel.print("tug_of_war01.osim")

block = modeling.Body()
block.setName("Block");
block.setMass(20)
block.addDisplayGeometry("block.vtp")
#FreeJoint(String name, Body parent, double[] locationInParent, double[] orientationInParent, Body body, double[] locationInBody, double[] orientationInBody, boolean reverse) {
zeroVec = [0, 0, 0]
jnt = modeling.FreeJoint("blockToGround", ground, zeroVec, zeroVec, block, zeroVec, zeroVec, 0)
jointCoordinateSet = jnt.getCoordinateSet();
jointCoordinateSet.get(0).setRange([-1.5, 1.5])
jointCoordinateSet.get(1).setRange([-1.5, 1.5])
jointCoordinateSet.get(2).setRange([-1.5, 1.5])
jointCoordinateSet.get(3).setRange([-1, 1])
jointCoordinateSet.get(4).setRange([-1, 1])
jointCoordinateSet.get(5).setRange([-1, 1])

osimModel.addBody(block);

osimModel.print("tug_of_war02.osim")

maxIsometricForce = 1000.0
optimalFiberLength = 0.1
tendonSlackLength = 0.2
pennationAngle = 0.0

# Create new muscles
muscle1 = modeling.Thelen2003Muscle()
muscle1.setName("muscle1")
muscle1.setMaxIsometricForce(maxIsometricForce)
muscle1.setOptimalFiberLength(optimalFiberLength)
muscle1.setTendonSlackLength(tendonSlackLength);
muscle1.setPennationAngleAtOptimalFiberLength(pennationAngle)

# Path for muscle 1
muscle1.addNewPathPoint("muscle1-point1", ground, modeling.ArrayDouble.createVec3([0.0,0.05,-0.35]))
muscle1.addNewPathPoint("muscle1-point2", block, modeling.ArrayDouble.createVec3([0.0,0.0,-0.05]))
# Add muscle1 to model as Force
osimModel.addForce(muscle1);

# Repeat for Muscle 2
muscle2 = modeling.Thelen2003Muscle()
muscle2.setName("muscle2")
muscle2.setMaxIsometricForce(maxIsometricForce)
muscle2.setOptimalFiberLength(optimalFiberLength)
muscle2.setTendonSlackLength(tendonSlackLength)
muscle2.setPennationAngleAtOptimalFiberLength(pennationAngle)
# Path for muscle 2
muscle2.addNewPathPoint("muscle2-point1", ground, modeling.ArrayDouble.createVec3([0.0,0.05,0.35]))
muscle2.addNewPathPoint("muscle2-point2", block, modeling.ArrayDouble.createVec3([0.0,0.0,0.05]))

# Add the second muscle to the model
osimModel.addForce(muscle2);

osimModel.print("tug_of_war_muscles.osim")

#Set up Controller
initialTime = 0.0
finalTime = 4.0

muscleController = modeling.PrescribedController()
muscleController.setActuators(osimModel.updActuators())
# Define linear functions for the control values for the two muscles
slopeAndIntercept1=modeling.ArrayDouble(0.0, 2)
slopeAndIntercept2=modeling.ArrayDouble(0.0, 2)
# muscle1 control has slope of -1 starting 1 at t = 0
slopeAndIntercept1.setitem(0, -1.0/(finalTime-initialTime))
slopeAndIntercept1.setitem(1,  1.0)
# muscle2 control has slope of 1 starting 0.05 at t = 0
slopeAndIntercept2.setitem(0, 1.0/(finalTime-initialTime))
slopeAndIntercept2.setitem(1,  0.05)

# Set the indiviudal muscle control functions for the prescribed muscle controller
muscleController.prescribeControlForActuator("muscle1", modeling.LinearFunction(slopeAndIntercept1))
muscleController.prescribeControlForActuator("muscle2", modeling.LinearFunction(slopeAndIntercept2))

# Add the control set controller to the model
osimModel.addController(muscleController)


# Define the default states for the two muscles
# Activation
muscle1.setDefaultActivation(slopeAndIntercept1.getitem(1))
muscle2.setDefaultActivation(slopeAndIntercept2.getitem(1))
# Fiber length
muscle2.setDefaultFiberLength(0.1)
muscle1.setDefaultFiberLength(0.1)

osimModel.print("tug_of_war_muscles_controller.osim")

