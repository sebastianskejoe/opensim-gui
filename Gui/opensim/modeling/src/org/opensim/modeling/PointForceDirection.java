/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointForceDirection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PointForceDirection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointForceDirection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PointForceDirection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PointForceDirection(Vec3 point, PhysicalFrame frame, Vec3 direction, double scale) {
    this(opensimSimulationJNI.new_PointForceDirection__SWIG_0(Vec3.getCPtr(point), point, PhysicalFrame.getCPtr(frame), frame, Vec3.getCPtr(direction), direction, scale), true);
  }

  public PointForceDirection(Vec3 point, PhysicalFrame frame, Vec3 direction) {
    this(opensimSimulationJNI.new_PointForceDirection__SWIG_1(Vec3.getCPtr(point), point, PhysicalFrame.getCPtr(frame), frame, Vec3.getCPtr(direction), direction), true);
  }

  public Vec3 point() {
    return new Vec3(opensimSimulationJNI.PointForceDirection_point(swigCPtr, this), true);
  }

  public PhysicalFrame frame() {
    return new PhysicalFrame(opensimSimulationJNI.PointForceDirection_frame(swigCPtr, this), false);
  }

  public Vec3 direction() {
    return new Vec3(opensimSimulationJNI.PointForceDirection_direction(swigCPtr, this), true);
  }

  public double scale() {
    return opensimSimulationJNI.PointForceDirection_scale(swigCPtr, this);
  }

  public void addToDirection(Vec3 newDirection) {
    opensimSimulationJNI.PointForceDirection_addToDirection(swigCPtr, this, Vec3.getCPtr(newDirection), newDirection);
  }

}
