/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapSphereObst extends WrapObject {
  private transient long swigCPtr;

  public WrapSphereObst(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WrapSphereObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapSphereObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_WrapSphereObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapSphereObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WrapSphereObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WrapSphereObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WrapSphereObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WrapSphereObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapSphereObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WrapSphereObst_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_radius(WrapSphereObst source) {
    opensimSimulationJNI.WrapSphereObst_copyProperty_radius(swigCPtr, this, WrapSphereObst.getCPtr(source), source);
  }

  public double get_radius(int i) {
    return opensimSimulationJNI.WrapSphereObst_get_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapSphereObst_upd_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_radius(int i, double value) {
    opensimSimulationJNI.WrapSphereObst_set_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_radius(double value) {
    return opensimSimulationJNI.WrapSphereObst_append_radius(swigCPtr, this, value);
  }

  public void constructProperty_radius(double initValue) {
    opensimSimulationJNI.WrapSphereObst_constructProperty_radius(swigCPtr, this, initValue);
  }

  public double get_radius() {
    return opensimSimulationJNI.WrapSphereObst_get_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapSphereObst_upd_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_radius(double value) {
    opensimSimulationJNI.WrapSphereObst_set_radius__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_length(WrapSphereObst source) {
    opensimSimulationJNI.WrapSphereObst_copyProperty_length(swigCPtr, this, WrapSphereObst.getCPtr(source), source);
  }

  public double get_length(int i) {
    return opensimSimulationJNI.WrapSphereObst_get_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapSphereObst_upd_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_length(int i, double value) {
    opensimSimulationJNI.WrapSphereObst_set_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_length(double value) {
    return opensimSimulationJNI.WrapSphereObst_append_length(swigCPtr, this, value);
  }

  public void constructProperty_length(double initValue) {
    opensimSimulationJNI.WrapSphereObst_constructProperty_length(swigCPtr, this, initValue);
  }

  public double get_length() {
    return opensimSimulationJNI.WrapSphereObst_get_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.WrapSphereObst_upd_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_length(double value) {
    opensimSimulationJNI.WrapSphereObst_set_length__SWIG_1(swigCPtr, this, value);
  }

  public WrapSphereObst() {
    this(opensimSimulationJNI.new_WrapSphereObst(), true);
  }

  public double getRadius() {
    return opensimSimulationJNI.WrapSphereObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimSimulationJNI.WrapSphereObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimSimulationJNI.WrapSphereObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimSimulationJNI.WrapSphereObst_setLength(swigCPtr, this, aLength);
  }

  public String getWrapTypeName() {
    return opensimSimulationJNI.WrapSphereObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimSimulationJNI.WrapSphereObst_getDimensionsString(swigCPtr, this);
  }

}
