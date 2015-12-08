/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Ellipsoid extends AnalyticGeometry {
  private transient long swigCPtr;

  public Ellipsoid(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Ellipsoid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ellipsoid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Ellipsoid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Ellipsoid safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Ellipsoid_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Ellipsoid(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Ellipsoid_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Ellipsoid_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Ellipsoid_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Ellipsoid(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Ellipsoid_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_radii(Ellipsoid source) {
    opensimModelJNI.Ellipsoid_copyProperty_radii(swigCPtr, this, Ellipsoid.getCPtr(source), source);
  }

  public Vec3 get_radii(int i) {
    return new Vec3(opensimModelJNI.Ellipsoid_get_radii__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_radii(int i) {
    return new Vec3(opensimModelJNI.Ellipsoid_upd_radii__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_radii(int i, Vec3 value) {
    opensimModelJNI.Ellipsoid_set_radii__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_radii(Vec3 value) {
    return opensimModelJNI.Ellipsoid_append_radii(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_radii(Vec3 initValue) {
    opensimModelJNI.Ellipsoid_constructProperty_radii(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_radii() {
    return new Vec3(opensimModelJNI.Ellipsoid_get_radii__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_radii() {
    return new Vec3(opensimModelJNI.Ellipsoid_upd_radii__SWIG_1(swigCPtr, this), false);
  }

  public void set_radii(Vec3 value) {
    opensimModelJNI.Ellipsoid_set_radii__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public Ellipsoid() {
    this(opensimModelJNI.new_Ellipsoid__SWIG_0(), true);
  }

  public Ellipsoid(double radius1, double radius2, double radius3) {
    this(opensimModelJNI.new_Ellipsoid__SWIG_1(radius1, radius2, radius3), true);
  }

  public void setEllipsoidParams(double radius1, double radius2, double radius3) {
    opensimModelJNI.Ellipsoid_setEllipsoidParams(swigCPtr, this, radius1, radius2, radius3);
  }

}
