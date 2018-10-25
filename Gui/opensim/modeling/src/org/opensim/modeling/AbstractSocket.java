/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractSocket {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public AbstractSocket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractSocket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_AbstractSocket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AbstractSocket clone() {
    long cPtr = opensimCommonJNI.AbstractSocket_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractSocket(cPtr, true);
  }

  public String getName() {
    return opensimCommonJNI.AbstractSocket_getName(swigCPtr, this);
  }

  public Stage getConnectAtStage() {
    return new Stage(opensimCommonJNI.AbstractSocket_getConnectAtStage(swigCPtr, this), true);
  }

  public boolean isListSocket() {
    return opensimCommonJNI.AbstractSocket_isListSocket(swigCPtr, this);
  }

  public long getNumConnectees() {
    return opensimCommonJNI.AbstractSocket_getNumConnectees(swigCPtr, this);
  }

  public boolean isConnected() {
    return opensimCommonJNI.AbstractSocket_isConnected(swigCPtr, this);
  }

  public String getConnecteeTypeName() {
    return opensimCommonJNI.AbstractSocket_getConnecteeTypeName(swigCPtr, this);
  }

  public OpenSimObject getConnecteeAsObject() {
    return new OpenSimObject(opensimCommonJNI.AbstractSocket_getConnecteeAsObject(swigCPtr, this), false);
  }

  public void connect(OpenSimObject connectee) {
    opensimCommonJNI.AbstractSocket_connect(swigCPtr, this, OpenSimObject.getCPtr(connectee), connectee);
  }

  public void finalizeConnection(Component root) {
    opensimCommonJNI.AbstractSocket_finalizeConnection(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void disconnect() {
    opensimCommonJNI.AbstractSocket_disconnect(swigCPtr, this);
  }

  public void setConnecteePath(String name) {
    opensimCommonJNI.AbstractSocket_setConnecteePath__SWIG_0(swigCPtr, this, name);
  }

  public void setConnecteePath(String name, long ix) {
    opensimCommonJNI.AbstractSocket_setConnecteePath__SWIG_1(swigCPtr, this, name, ix);
  }

  public String getConnecteePath() {
    return opensimCommonJNI.AbstractSocket_getConnecteePath__SWIG_0(swigCPtr, this);
  }

  public String getConnecteePath(long ix) {
    return opensimCommonJNI.AbstractSocket_getConnecteePath__SWIG_1(swigCPtr, this, ix);
  }

  public void appendConnecteePath(String name) {
    opensimCommonJNI.AbstractSocket_appendConnecteePath(swigCPtr, this, name);
  }

  public void clearConnecteePath() {
    opensimCommonJNI.AbstractSocket_clearConnecteePath(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimCommonJNI.AbstractSocket_getOwner(swigCPtr, this), false);
  }

}
