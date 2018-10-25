/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractChannel {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public AbstractChannel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractChannel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_AbstractChannel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getChannelName() {
    return opensimCommonJNI.AbstractChannel_getChannelName(swigCPtr, this);
  }

  public String getTypeName() {
    return opensimCommonJNI.AbstractChannel_getTypeName(swigCPtr, this);
  }

  public String getName() {
    return opensimCommonJNI.AbstractChannel_getName(swigCPtr, this);
  }

  public String getPathName() {
    return opensimCommonJNI.AbstractChannel_getPathName(swigCPtr, this);
  }

}
