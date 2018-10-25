/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Decorations extends DecorativeGeometry {
  private transient long swigCPtr;

  public Decorations(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.Decorations_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Decorations obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_Decorations(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Decorations() {
    this(opensimSimbodyJNI.new_Decorations__SWIG_0(), true);
  }

  public Decorations(DecorativeGeometry decoration) {
    this(opensimSimbodyJNI.new_Decorations__SWIG_1(DecorativeGeometry.getCPtr(decoration), decoration), true);
  }

  public Decorations addDecoration(DecorativeGeometry decoration) {
    return new Decorations(opensimSimbodyJNI.Decorations_addDecoration__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(decoration), decoration), false);
  }

  public Decorations addDecoration(Transform placement, DecorativeGeometry decoration) {
    return new Decorations(opensimSimbodyJNI.Decorations_addDecoration__SWIG_1(swigCPtr, this, Transform.getCPtr(placement), placement, DecorativeGeometry.getCPtr(decoration), decoration), false);
  }

  public int getNumDecorations() {
    return opensimSimbodyJNI.Decorations_getNumDecorations(swigCPtr, this);
  }

  public DecorativeGeometry getDecoration(int i) {
    return new DecorativeGeometry(opensimSimbodyJNI.Decorations_getDecoration(swigCPtr, this, i), false);
  }

  public Decorations setBodyId(int b) {
    return new Decorations(opensimSimbodyJNI.Decorations_setBodyId(swigCPtr, this, b), false);
  }

  public Decorations setIndexOnBody(int x) {
    return new Decorations(opensimSimbodyJNI.Decorations_setIndexOnBody(swigCPtr, this, x), false);
  }

  public Decorations setUserRef(SWIGTYPE_p_void p) {
    return new Decorations(opensimSimbodyJNI.Decorations_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public Decorations setTransform(Transform X_BD) {
    return new Decorations(opensimSimbodyJNI.Decorations_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public Decorations setResolution(double r) {
    return new Decorations(opensimSimbodyJNI.Decorations_setResolution(swigCPtr, this, r), false);
  }

  public Decorations setScaleFactors(Vec3 s) {
    return new Decorations(opensimSimbodyJNI.Decorations_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public Decorations setColor(Vec3 rgb) {
    return new Decorations(opensimSimbodyJNI.Decorations_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public Decorations setOpacity(double o) {
    return new Decorations(opensimSimbodyJNI.Decorations_setOpacity(swigCPtr, this, o), false);
  }

  public Decorations setLineThickness(double t) {
    return new Decorations(opensimSimbodyJNI.Decorations_setLineThickness(swigCPtr, this, t), false);
  }

  public Decorations setRepresentation(DecorativeGeometry.Representation r) {
    return new Decorations(opensimSimbodyJNI.Decorations_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

}
