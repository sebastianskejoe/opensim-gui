/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetOfPathPoints extends OpenSimObject {
  private transient long swigCPtr;

  public SetOfPathPoints(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetOfPathPoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetOfPathPoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetOfPathPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetOfPathPoints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetOfPathPoints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetOfPathPoints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetOfPathPoints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetOfPathPoints_getClassName();
  }

  public SetOfPathPoints clone() {
    long cPtr = opensimSimulationJNI.SetOfPathPoints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetOfPathPoints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetOfPathPoints_getConcreteClassName(swigCPtr, this);
  }

  public SetOfPathPoints() {
    this(opensimSimulationJNI.new_SetOfPathPoints__SWIG_0(), true);
  }

  public SetOfPathPoints(String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimSimulationJNI.new_SetOfPathPoints__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetOfPathPoints(String aFileName) throws java.io.IOException {
    this(opensimSimulationJNI.new_SetOfPathPoints__SWIG_2(aFileName), true);
  }

  public SetOfPathPoints(SetOfPathPoints aSet) {
    this(opensimSimulationJNI.new_SetOfPathPoints__SWIG_3(SetOfPathPoints.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetOfPathPoints_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetOfPathPoints_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetOfPathPoints_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetOfPathPoints_getSize(swigCPtr, this);
  }

  public int getIndex(AbstractPathPoint aObject, int aStartIndex) {
    return opensimSimulationJNI.SetOfPathPoints_getIndex__SWIG_0(swigCPtr, this, AbstractPathPoint.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_getIndex__SWIG_1(swigCPtr, this, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetOfPathPoints_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetOfPathPoints_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetOfPathPoints_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_adoptAndAppend(swigCPtr, this, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_cloneAndAppend(swigCPtr, this, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_insert(swigCPtr, this, aIndex, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetOfPathPoints_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_remove__SWIG_1(swigCPtr, this, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetOfPathPoints_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, AbstractPathPoint aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetOfPathPoints_set__SWIG_0(swigCPtr, this, aIndex, AbstractPathPoint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, AbstractPathPoint aObject) {
    return opensimSimulationJNI.SetOfPathPoints_set__SWIG_1(swigCPtr, this, aIndex, AbstractPathPoint.getCPtr(aObject), aObject);
  }

  public AbstractPathPoint get(int aIndex) {
    return new AbstractPathPoint(opensimSimulationJNI.SetOfPathPoints_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public AbstractPathPoint get(String aName) {
    return new AbstractPathPoint(opensimSimulationJNI.SetOfPathPoints_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetOfPathPoints_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetOfPathPoints_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetOfPathPoints_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetOfPathPoints_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetOfPathPoints_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetOfPathPoints_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetOfPathPoints_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetOfPathPoints_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetOfPathPoints_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetOfPathPoints_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
