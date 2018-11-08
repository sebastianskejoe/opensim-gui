/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentNotFoundOnSpecifiedPath extends ComponentNotFound {
  private transient long swigCPtr;

  public ComponentNotFoundOnSpecifiedPath(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ComponentNotFoundOnSpecifiedPath_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentNotFoundOnSpecifiedPath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentNotFoundOnSpecifiedPath(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ComponentNotFoundOnSpecifiedPath(String file, long line, String func, String toFindName, String toFindClassName, String thisName) {
    this(opensimCommonJNI.new_ComponentNotFoundOnSpecifiedPath(file, line, func, toFindName, toFindClassName, thisName), true);
  }

}
