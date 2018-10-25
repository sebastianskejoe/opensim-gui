/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Joint extends ModelComponent {
  private transient long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Joint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Joint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Joint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Joint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinates(Joint source) {
    opensimSimulationJNI.Joint_copyProperty_coordinates(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Coordinate get_coordinates(int i) {
    return new Coordinate(opensimSimulationJNI.Joint_get_coordinates(swigCPtr, this, i), false);
  }

  public Coordinate upd_coordinates(int i) {
    return new Coordinate(opensimSimulationJNI.Joint_upd_coordinates(swigCPtr, this, i), false);
  }

  public void set_coordinates(int i, Coordinate value) {
    opensimSimulationJNI.Joint_set_coordinates(swigCPtr, this, i, Coordinate.getCPtr(value), value);
  }

  public int append_coordinates(Coordinate value) {
    return opensimSimulationJNI.Joint_append_coordinates(swigCPtr, this, Coordinate.getCPtr(value), value);
  }

  public void constructProperty_coordinates() {
    opensimSimulationJNI.Joint_constructProperty_coordinates(swigCPtr, this);
  }

  public void copyProperty_frames(Joint source) {
    opensimSimulationJNI.Joint_copyProperty_frames(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public PhysicalOffsetFrame get_frames(int i) {
    return new PhysicalOffsetFrame(opensimSimulationJNI.Joint_get_frames(swigCPtr, this, i), false);
  }

  public PhysicalOffsetFrame upd_frames(int i) {
    return new PhysicalOffsetFrame(opensimSimulationJNI.Joint_upd_frames(swigCPtr, this, i), false);
  }

  public void set_frames(int i, PhysicalOffsetFrame value) {
    opensimSimulationJNI.Joint_set_frames(swigCPtr, this, i, PhysicalOffsetFrame.getCPtr(value), value);
  }

  public int append_frames(PhysicalOffsetFrame value) {
    return opensimSimulationJNI.Joint_append_frames(swigCPtr, this, PhysicalOffsetFrame.getCPtr(value), value);
  }

  public void constructProperty_frames() {
    opensimSimulationJNI.Joint_constructProperty_frames(swigCPtr, this);
  }

  public void setPropertyIndex_socket_parent_frame(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.Joint_PropertyIndex_socket_parent_frame_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_parent_frame() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.Joint_PropertyIndex_socket_parent_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_parent_frame(OpenSimObject object) {
    opensimSimulationJNI.Joint_connectSocket_parent_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_child_frame(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.Joint_PropertyIndex_socket_child_frame_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_child_frame() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.Joint_PropertyIndex_socket_child_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_child_frame(OpenSimObject object) {
    opensimSimulationJNI.Joint_connectSocket_child_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void set_has_output_power(boolean value) {
    opensimSimulationJNI.Joint__has_output_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_power() {
    return opensimSimulationJNI.Joint__has_output_power_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_parent(boolean value) {
    opensimSimulationJNI.Joint__has_output_reaction_on_parent_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_parent() {
    return opensimSimulationJNI.Joint__has_output_reaction_on_parent_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_child(boolean value) {
    opensimSimulationJNI.Joint__has_output_reaction_on_child_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_child() {
    return opensimSimulationJNI.Joint__has_output_reaction_on_child_get(swigCPtr, this);
  }

  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimSimulationJNI.Joint_getChildFrame(swigCPtr, this), false);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.Joint_getParentFrame(swigCPtr, this), false);
  }

  public Coordinate getCoordinate() {
    return new Coordinate(opensimSimulationJNI.Joint_getCoordinate(swigCPtr, this), false);
  }

  public Coordinate updCoordinate() {
    return new Coordinate(opensimSimulationJNI.Joint_updCoordinate(swigCPtr, this), false);
  }

  public int numCoordinates() {
    return opensimSimulationJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimSimulationJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public void addFrame(PhysicalOffsetFrame frame) {
    opensimSimulationJNI.Joint_addFrame(swigCPtr, this, PhysicalOffsetFrame.getCPtr(frame), frame);
  }

  public SpatialVec calcEquivalentSpatialForce(State state, Vector mobilityForces) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public SpatialVec calcReactionOnParentExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcReactionOnParentExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public SpatialVec calcReactionOnChildExpressedInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.Joint_calcReactionOnChildExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double calcPower(State s) {
    return opensimSimulationJNI.Joint_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

}
