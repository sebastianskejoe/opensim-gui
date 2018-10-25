/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IKTaskSet extends SetIKTasks {
  private transient long swigCPtr;

  public IKTaskSet(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.IKTaskSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IKTaskSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_IKTaskSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IKTaskSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IKTaskSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IKTaskSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.IKTaskSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.IKTaskSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.IKTaskSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IKTaskSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.IKTaskSet_getConcreteClassName(swigCPtr, this);
  }

  public IKTaskSet() {
    this(opensimActuatorsAnalysesToolsJNI.new_IKTaskSet__SWIG_0(), true);
  }

  public IKTaskSet(IKTaskSet aIKTaskSet) {
    this(opensimActuatorsAnalysesToolsJNI.new_IKTaskSet__SWIG_1(IKTaskSet.getCPtr(aIKTaskSet), aIKTaskSet), true);
  }

  public IKTaskSet(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_IKTaskSet__SWIG_2(aFileName), true);
  }

  public void createMarkerWeightSet(SetMarkerWeights aWeights) {
    opensimActuatorsAnalysesToolsJNI.IKTaskSet_createMarkerWeightSet(swigCPtr, this, SetMarkerWeights.getCPtr(aWeights), aWeights);
  }

}
