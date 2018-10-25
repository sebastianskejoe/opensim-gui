/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractPathPoint extends Point {
  private transient long swigCPtr;

  public AbstractPathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.AbstractPathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractPathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_AbstractPathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AbstractPathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.AbstractPathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AbstractPathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.AbstractPathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.AbstractPathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.AbstractPathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractPathPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.AbstractPathPoint_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_socket_parent_frame(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.AbstractPathPoint_PropertyIndex_socket_parent_frame_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_parent_frame() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.AbstractPathPoint_PropertyIndex_socket_parent_frame_get(swigCPtr, this), true);
  }

  public void connectSocket_parent_frame(OpenSimObject object) {
    opensimSimulationJNI.AbstractPathPoint_connectSocket_parent_frame(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public Vec3 getLocation(State s) {
    return new Vec3(opensimSimulationJNI.AbstractPathPoint_getLocation(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.AbstractPathPoint_getParentFrame(swigCPtr, this), false);
  }

  public void setParentFrame(PhysicalFrame aFrame) {
    opensimSimulationJNI.AbstractPathPoint_setParentFrame(swigCPtr, this, PhysicalFrame.getCPtr(aFrame), aFrame);
  }

  public PhysicalFrame getBody() {
    return new PhysicalFrame(opensimSimulationJNI.AbstractPathPoint_getBody(swigCPtr, this), false);
  }

  public void setBody(PhysicalFrame body) {
    opensimSimulationJNI.AbstractPathPoint_setBody(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

  public String getBodyName() {
    return opensimSimulationJNI.AbstractPathPoint_getBodyName(swigCPtr, this);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimSimulationJNI.AbstractPathPoint_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public boolean isActive(State s) {
    return opensimSimulationJNI.AbstractPathPoint_isActive(swigCPtr, this, State.getCPtr(s), s);
  }

  public Vec3 getdPointdQ(State s) {
    return new Vec3(opensimSimulationJNI.AbstractPathPoint_getdPointdQ(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public static void deletePathPoint(AbstractPathPoint aPoint) {
    opensimSimulationJNI.AbstractPathPoint_deletePathPoint(AbstractPathPoint.getCPtr(aPoint), aPoint);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimSimulationJNI.AbstractPathPoint_updateFromXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

}
