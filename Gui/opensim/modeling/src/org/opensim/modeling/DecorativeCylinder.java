/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeCylinder extends DecorativeGeometry {
  private transient long swigCPtr;

  public DecorativeCylinder(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.DecorativeCylinder_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeCylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_DecorativeCylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeCylinder(double radius, double halfHeight) {
    this(opensimSimbodyJNI.new_DecorativeCylinder__SWIG_0(radius, halfHeight), true);
  }

  public DecorativeCylinder(double radius) {
    this(opensimSimbodyJNI.new_DecorativeCylinder__SWIG_1(radius), true);
  }

  public DecorativeCylinder() {
    this(opensimSimbodyJNI.new_DecorativeCylinder__SWIG_2(), true);
  }

  public DecorativeCylinder setRadius(double arg0) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setRadius(swigCPtr, this, arg0), false);
  }

  public DecorativeCylinder setHalfHeight(double arg0) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setHalfHeight(swigCPtr, this, arg0), false);
  }

  public double getRadius() {
    return opensimSimbodyJNI.DecorativeCylinder_getRadius(swigCPtr, this);
  }

  public double getHalfHeight() {
    return opensimSimbodyJNI.DecorativeCylinder_getHalfHeight(swigCPtr, this);
  }

  public DecorativeCylinder setBodyId(int b) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeCylinder setIndexOnBody(int x) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeCylinder setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeCylinder setTransform(Transform X_BD) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeCylinder setResolution(double r) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeCylinder setScaleFactors(Vec3 s) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeCylinder setColor(Vec3 rgb) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeCylinder setOpacity(double o) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeCylinder setLineThickness(double t) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeCylinder setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeCylinder(opensimSimbodyJNI.DecorativeCylinder_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

  public DecorativeCylinder clone() {
    long cPtr = opensimSimbodyJNI.DecorativeCylinder_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeCylinder(cPtr, false);
  }

}
