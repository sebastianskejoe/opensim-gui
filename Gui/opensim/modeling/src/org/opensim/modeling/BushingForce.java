/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BushingForce extends TwoFrameLinkerForce {
  private transient long swigCPtr;

  public BushingForce(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.BushingForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BushingForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_BushingForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BushingForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.BushingForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BushingForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.BushingForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.BushingForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.BushingForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BushingForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.BushingForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_rotational_stiffness(BushingForce source) {
    opensimSimulationJNI.BushingForce_copyProperty_rotational_stiffness(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public Vec3 get_rotational_stiffness(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_get_rotational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_rotational_stiffness(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_rotational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_stiffness(int i, Vec3 value) {
    opensimSimulationJNI.BushingForce_set_rotational_stiffness__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_rotational_stiffness(Vec3 value) {
    return opensimSimulationJNI.BushingForce_append_rotational_stiffness(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_rotational_stiffness(Vec3 initValue) {
    opensimSimulationJNI.BushingForce_constructProperty_rotational_stiffness(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_rotational_stiffness() {
    return new Vec3(opensimSimulationJNI.BushingForce_get_rotational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_rotational_stiffness() {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_rotational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_stiffness(Vec3 value) {
    opensimSimulationJNI.BushingForce_set_rotational_stiffness__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_translational_stiffness(BushingForce source) {
    opensimSimulationJNI.BushingForce_copyProperty_translational_stiffness(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public Vec3 get_translational_stiffness(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_get_translational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_translational_stiffness(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_translational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_stiffness(int i, Vec3 value) {
    opensimSimulationJNI.BushingForce_set_translational_stiffness__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_translational_stiffness(Vec3 value) {
    return opensimSimulationJNI.BushingForce_append_translational_stiffness(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_translational_stiffness(Vec3 initValue) {
    opensimSimulationJNI.BushingForce_constructProperty_translational_stiffness(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_translational_stiffness() {
    return new Vec3(opensimSimulationJNI.BushingForce_get_translational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_translational_stiffness() {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_translational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_stiffness(Vec3 value) {
    opensimSimulationJNI.BushingForce_set_translational_stiffness__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_rotational_damping(BushingForce source) {
    opensimSimulationJNI.BushingForce_copyProperty_rotational_damping(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public Vec3 get_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_get_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_damping(int i, Vec3 value) {
    opensimSimulationJNI.BushingForce_set_rotational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_rotational_damping(Vec3 value) {
    return opensimSimulationJNI.BushingForce_append_rotational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_rotational_damping(Vec3 initValue) {
    opensimSimulationJNI.BushingForce_constructProperty_rotational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_rotational_damping() {
    return new Vec3(opensimSimulationJNI.BushingForce_get_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_rotational_damping() {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_damping(Vec3 value) {
    opensimSimulationJNI.BushingForce_set_rotational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_translational_damping(BushingForce source) {
    opensimSimulationJNI.BushingForce_copyProperty_translational_damping(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public Vec3 get_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_get_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_damping(int i, Vec3 value) {
    opensimSimulationJNI.BushingForce_set_translational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_translational_damping(Vec3 value) {
    return opensimSimulationJNI.BushingForce_append_translational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_translational_damping(Vec3 initValue) {
    opensimSimulationJNI.BushingForce_constructProperty_translational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_translational_damping() {
    return new Vec3(opensimSimulationJNI.BushingForce_get_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_translational_damping() {
    return new Vec3(opensimSimulationJNI.BushingForce_upd_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_damping(Vec3 value) {
    opensimSimulationJNI.BushingForce_set_translational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public BushingForce() {
    this(opensimSimulationJNI.new_BushingForce__SWIG_0(), true);
  }

  public BushingForce(String name, PhysicalFrame frame1, PhysicalFrame frame2) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_1(name, PhysicalFrame.getCPtr(frame1), frame1, PhysicalFrame.getCPtr(frame2), frame2), true);
  }

  public BushingForce(String name, String frame1Name, String frame2Name) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_2(name, frame1Name, frame2Name), true);
  }

  public BushingForce(String name, PhysicalFrame frame1, PhysicalFrame frame2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_3(name, PhysicalFrame.getCPtr(frame1), frame1, PhysicalFrame.getCPtr(frame2), frame2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public BushingForce(String name, String frame1Name, String frame2Name, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_4(name, frame1Name, frame2Name, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public BushingForce(String name, PhysicalFrame frame1, Transform transformInFrame1, PhysicalFrame frame2, Transform transformInFrame2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_5(name, PhysicalFrame.getCPtr(frame1), frame1, Transform.getCPtr(transformInFrame1), transformInFrame1, PhysicalFrame.getCPtr(frame2), frame2, Transform.getCPtr(transformInFrame2), transformInFrame2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public BushingForce(String name, String frame1Name, Transform transformInFrame1, String frame2Name, Transform transformInFrame2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_6(name, frame1Name, Transform.getCPtr(transformInFrame1), transformInFrame1, frame2Name, Transform.getCPtr(transformInFrame2), transformInFrame2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public BushingForce(String name, String frame1Name, Vec3 locationInFrame1, Vec3 orientationInFrame1, String frame2Name, Vec3 locationInFrame2, Vec3 orientationInFrame2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_BushingForce__SWIG_7(name, frame1Name, Vec3.getCPtr(locationInFrame1), locationInFrame1, Vec3.getCPtr(orientationInFrame1), orientationInFrame1, frame2Name, Vec3.getCPtr(locationInFrame2), locationInFrame2, Vec3.getCPtr(orientationInFrame2), orientationInFrame2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public double computePotentialEnergy(State s) {
    return opensimSimulationJNI.BushingForce_computePotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.BushingForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.BushingForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
