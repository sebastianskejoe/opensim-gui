/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class State {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public State(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(State obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_State(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public State() {
    this(opensimModelJNI.new_State__SWIG_0(), true);
  }

  public void clear() {
    opensimModelJNI.State_clear(swigCPtr, this);
  }

  public void setNumSubsystems(int i) {
    opensimModelJNI.State_setNumSubsystems(swigCPtr, this, i);
  }

  public void initializeSubsystem(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_String name, SWIGTYPE_p_String version) {
    opensimModelJNI.State_initializeSubsystem(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_String.getCPtr(name), SWIGTYPE_p_String.getCPtr(version));
  }

  public State(State arg0) {
    this(opensimModelJNI.new_State__SWIG_1(State.getCPtr(arg0), arg0), true);
  }

  public SWIGTYPE_p_SubsystemIndex addSubsystem(SWIGTYPE_p_String name, SWIGTYPE_p_String version) {
    return new SWIGTYPE_p_SubsystemIndex(opensimModelJNI.State_addSubsystem(swigCPtr, this, SWIGTYPE_p_String.getCPtr(name), SWIGTYPE_p_String.getCPtr(version)), true);
  }

  public int getNumSubsystems() {
    return opensimModelJNI.State_getNumSubsystems(swigCPtr, this);
  }

  public SWIGTYPE_p_String getSubsystemName(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_String(opensimModelJNI.State_getSubsystemName(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public SWIGTYPE_p_String getSubsystemVersion(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_String(opensimModelJNI.State_getSubsystemVersion(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Stage getSubsystemStage(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Stage(opensimModelJNI.State_getSubsystemStage(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Stage getSystemStage() {
    return new Stage(opensimModelJNI.State_getSystemStage(swigCPtr, this), false);
  }

  public void invalidateAll(Stage arg0) {
    opensimModelJNI.State_invalidateAll(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public void invalidateAllCacheAtOrAbove(Stage arg0) {
    opensimModelJNI.State_invalidateAllCacheAtOrAbove(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public void advanceSubsystemToStage(SWIGTYPE_p_SubsystemIndex arg0, Stage arg1) {
    opensimModelJNI.State_advanceSubsystemToStage(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(arg1), arg1);
  }

  public void advanceSystemToStage(Stage arg0) {
    opensimModelJNI.State_advanceSystemToStage(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public int getSystemTopologyStageVersion() {
    return opensimModelJNI.State_getSystemTopologyStageVersion(swigCPtr, this);
  }

  public SWIGTYPE_p_QIndex allocateQ(SWIGTYPE_p_SubsystemIndex arg0, Vector qInit) {
    return new SWIGTYPE_p_QIndex(opensimModelJNI.State_allocateQ(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Vector.getCPtr(qInit), qInit), true);
  }

  public SWIGTYPE_p_UIndex allocateU(SWIGTYPE_p_SubsystemIndex arg0, Vector uInit) {
    return new SWIGTYPE_p_UIndex(opensimModelJNI.State_allocateU(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Vector.getCPtr(uInit), uInit), true);
  }

  public SWIGTYPE_p_ZIndex allocateZ(SWIGTYPE_p_SubsystemIndex arg0, Vector zInit) {
    return new SWIGTYPE_p_ZIndex(opensimModelJNI.State_allocateZ(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Vector.getCPtr(zInit), zInit), true);
  }

  public SWIGTYPE_p_QErrIndex allocateQErr(SWIGTYPE_p_SubsystemIndex arg0, int nqerr) {
    return new SWIGTYPE_p_QErrIndex(opensimModelJNI.State_allocateQErr(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), nqerr), true);
  }

  public SWIGTYPE_p_UErrIndex allocateUErr(SWIGTYPE_p_SubsystemIndex arg0, int nuerr) {
    return new SWIGTYPE_p_UErrIndex(opensimModelJNI.State_allocateUErr(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), nuerr), true);
  }

  public SWIGTYPE_p_UDotErrIndex allocateUDotErr(SWIGTYPE_p_SubsystemIndex arg0, int nudoterr) {
    return new SWIGTYPE_p_UDotErrIndex(opensimModelJNI.State_allocateUDotErr(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), nudoterr), true);
  }

  public SWIGTYPE_p_EventTriggerByStageIndex allocateEventTrigger(SWIGTYPE_p_SubsystemIndex arg0, Stage stage, int nevent) {
    return new SWIGTYPE_p_EventTriggerByStageIndex(opensimModelJNI.State_allocateEventTrigger(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(stage), stage, nevent), true);
  }

  public SWIGTYPE_p_DiscreteVariableIndex allocateDiscreteVariable(SWIGTYPE_p_SubsystemIndex arg0, Stage invalidates, SWIGTYPE_p_AbstractValue arg2) {
    return new SWIGTYPE_p_DiscreteVariableIndex(opensimModelJNI.State_allocateDiscreteVariable(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(invalidates), invalidates, SWIGTYPE_p_AbstractValue.getCPtr(arg2)), true);
  }

  public SWIGTYPE_p_DiscreteVariableIndex allocateAutoUpdateDiscreteVariable(SWIGTYPE_p_SubsystemIndex arg0, Stage invalidates, SWIGTYPE_p_AbstractValue arg2, Stage updateDependsOn) {
    return new SWIGTYPE_p_DiscreteVariableIndex(opensimModelJNI.State_allocateAutoUpdateDiscreteVariable(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(invalidates), invalidates, SWIGTYPE_p_AbstractValue.getCPtr(arg2), Stage.getCPtr(updateDependsOn), updateDependsOn), true);
  }

  public SWIGTYPE_p_CacheEntryIndex getDiscreteVarUpdateIndex(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new SWIGTYPE_p_CacheEntryIndex(opensimModelJNI.State_getDiscreteVarUpdateIndex(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), true);
  }

  public Stage getDiscreteVarAllocationStage(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new Stage(opensimModelJNI.State_getDiscreteVarAllocationStage(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), true);
  }

  public Stage getDiscreteVarInvalidatesStage(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new Stage(opensimModelJNI.State_getDiscreteVarInvalidatesStage(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), true);
  }

  public SWIGTYPE_p_AbstractValue getDiscreteVariable(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_getDiscreteVariable(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), false);
  }

  public double getDiscreteVarLastUpdateTime(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return opensimModelJNI.State_getDiscreteVarLastUpdateTime(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1));
  }

  public SWIGTYPE_p_AbstractValue getDiscreteVarUpdateValue(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_getDiscreteVarUpdateValue(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), false);
  }

  public SWIGTYPE_p_AbstractValue updDiscreteVarUpdateValue(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_updDiscreteVarUpdateValue(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), false);
  }

  public boolean isDiscreteVarUpdateValueRealized(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return opensimModelJNI.State_isDiscreteVarUpdateValueRealized(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1));
  }

  public void markDiscreteVarUpdateValueRealized(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    opensimModelJNI.State_markDiscreteVarUpdateValueRealized(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1));
  }

  public SWIGTYPE_p_AbstractValue updDiscreteVariable(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_updDiscreteVariable(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1)), false);
  }

  public void setDiscreteVariable(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_DiscreteVariableIndex arg1, SWIGTYPE_p_AbstractValue arg2) {
    opensimModelJNI.State_setDiscreteVariable(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_DiscreteVariableIndex.getCPtr(arg1), SWIGTYPE_p_AbstractValue.getCPtr(arg2));
  }

  public SWIGTYPE_p_CacheEntryIndex allocateCacheEntry(SWIGTYPE_p_SubsystemIndex arg0, Stage earliest, Stage latest, SWIGTYPE_p_AbstractValue arg3) {
    return new SWIGTYPE_p_CacheEntryIndex(opensimModelJNI.State_allocateCacheEntry__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(earliest), earliest, Stage.getCPtr(latest), latest, SWIGTYPE_p_AbstractValue.getCPtr(arg3)), true);
  }

  public SWIGTYPE_p_CacheEntryIndex allocateCacheEntry(SWIGTYPE_p_SubsystemIndex sx, Stage g, SWIGTYPE_p_AbstractValue v) {
    return new SWIGTYPE_p_CacheEntryIndex(opensimModelJNI.State_allocateCacheEntry__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(sx), Stage.getCPtr(g), g, SWIGTYPE_p_AbstractValue.getCPtr(v)), true);
  }

  public SWIGTYPE_p_CacheEntryIndex allocateLazyCacheEntry(SWIGTYPE_p_SubsystemIndex sx, Stage earliest, SWIGTYPE_p_AbstractValue v) {
    return new SWIGTYPE_p_CacheEntryIndex(opensimModelJNI.State_allocateLazyCacheEntry(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(sx), Stage.getCPtr(earliest), earliest, SWIGTYPE_p_AbstractValue.getCPtr(v)), true);
  }

  public Stage getCacheEntryAllocationStage(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    return new Stage(opensimModelJNI.State_getCacheEntryAllocationStage(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1)), true);
  }

  public SWIGTYPE_p_AbstractValue getCacheEntry(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_getCacheEntry(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1)), false);
  }

  public SWIGTYPE_p_AbstractValue updCacheEntry(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    return new SWIGTYPE_p_AbstractValue(opensimModelJNI.State_updCacheEntry(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1)), false);
  }

  public boolean isCacheValueRealized(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    return opensimModelJNI.State_isCacheValueRealized(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1));
  }

  public void markCacheValueRealized(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    opensimModelJNI.State_markCacheValueRealized(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1));
  }

  public void markCacheValueNotRealized(SWIGTYPE_p_SubsystemIndex arg0, SWIGTYPE_p_CacheEntryIndex arg1) {
    opensimModelJNI.State_markCacheValueNotRealized(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), SWIGTYPE_p_CacheEntryIndex.getCPtr(arg1));
  }

  public int getNY() {
    return opensimModelJNI.State_getNY(swigCPtr, this);
  }

  public int getNQ() {
    return opensimModelJNI.State_getNQ__SWIG_0(swigCPtr, this);
  }

  public SWIGTYPE_p_SystemYIndex getQStart() {
    return new SWIGTYPE_p_SystemYIndex(opensimModelJNI.State_getQStart__SWIG_0(swigCPtr, this), true);
  }

  public int getNU() {
    return opensimModelJNI.State_getNU__SWIG_0(swigCPtr, this);
  }

  public SWIGTYPE_p_SystemYIndex getUStart() {
    return new SWIGTYPE_p_SystemYIndex(opensimModelJNI.State_getUStart__SWIG_0(swigCPtr, this), true);
  }

  public int getNZ() {
    return opensimModelJNI.State_getNZ__SWIG_0(swigCPtr, this);
  }

  public SWIGTYPE_p_SystemYIndex getZStart() {
    return new SWIGTYPE_p_SystemYIndex(opensimModelJNI.State_getZStart__SWIG_0(swigCPtr, this), true);
  }

  public int getNYErr() {
    return opensimModelJNI.State_getNYErr(swigCPtr, this);
  }

  public int getNQErr() {
    return opensimModelJNI.State_getNQErr__SWIG_0(swigCPtr, this);
  }

  public SWIGTYPE_p_SystemYErrIndex getQErrStart() {
    return new SWIGTYPE_p_SystemYErrIndex(opensimModelJNI.State_getQErrStart__SWIG_0(swigCPtr, this), true);
  }

  public int getNUErr() {
    return opensimModelJNI.State_getNUErr__SWIG_0(swigCPtr, this);
  }

  public SWIGTYPE_p_SystemYErrIndex getUErrStart() {
    return new SWIGTYPE_p_SystemYErrIndex(opensimModelJNI.State_getUErrStart__SWIG_0(swigCPtr, this), true);
  }

  public int getNUDotErr() {
    return opensimModelJNI.State_getNUDotErr__SWIG_0(swigCPtr, this);
  }

  public int getNMultipliers() {
    return opensimModelJNI.State_getNMultipliers__SWIG_0(swigCPtr, this);
  }

  public int getNEventTriggers() {
    return opensimModelJNI.State_getNEventTriggers(swigCPtr, this);
  }

  public int getNEventTriggersByStage(Stage arg0) {
    return opensimModelJNI.State_getNEventTriggersByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public SWIGTYPE_p_SystemEventTriggerIndex getEventTriggerStartByStage(Stage arg0) {
    return new SWIGTYPE_p_SystemEventTriggerIndex(opensimModelJNI.State_getEventTriggerStartByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0), true);
  }

  public SWIGTYPE_p_SystemQIndex getQStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemQIndex(opensimModelJNI.State_getQStart__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNQ(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNQ__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemUIndex getUStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemUIndex(opensimModelJNI.State_getUStart__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNU(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNU__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemZIndex getZStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemZIndex(opensimModelJNI.State_getZStart__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNZ(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNZ__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemQErrIndex getQErrStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemQErrIndex(opensimModelJNI.State_getQErrStart__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNQErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNQErr__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemUErrIndex getUErrStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemUErrIndex(opensimModelJNI.State_getUErrStart__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNUErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNUErr__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemUDotErrIndex getUDotErrStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemUDotErrIndex(opensimModelJNI.State_getUDotErrStart(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNUDotErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNUDotErr__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemMultiplierIndex getMultipliersStart(SWIGTYPE_p_SubsystemIndex arg0) {
    return new SWIGTYPE_p_SystemMultiplierIndex(opensimModelJNI.State_getMultipliersStart(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), true);
  }

  public int getNMultipliers(SWIGTYPE_p_SubsystemIndex arg0) {
    return opensimModelJNI.State_getNMultipliers__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0));
  }

  public SWIGTYPE_p_SystemEventTriggerByStageIndex getEventTriggerStartByStage(SWIGTYPE_p_SubsystemIndex arg0, Stage arg1) {
    return new SWIGTYPE_p_SystemEventTriggerByStageIndex(opensimModelJNI.State_getEventTriggerStartByStage__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(arg1), arg1), true);
  }

  public int getNEventTriggersByStage(SWIGTYPE_p_SubsystemIndex arg0, Stage arg1) {
    return opensimModelJNI.State_getNEventTriggersByStage__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(arg1), arg1);
  }

  public Vector getEventTriggers() {
    return new Vector(opensimModelJNI.State_getEventTriggers(swigCPtr, this), false);
  }

  public Vector getEventTriggersByStage(Stage arg0) {
    return new Vector(opensimModelJNI.State_getEventTriggersByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0), false);
  }

  public Vector getEventTriggersByStage(SWIGTYPE_p_SubsystemIndex arg0, Stage arg1) {
    return new Vector(opensimModelJNI.State_getEventTriggersByStage__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(arg1), arg1), false);
  }

  public Vector updEventTriggers() {
    return new Vector(opensimModelJNI.State_updEventTriggers(swigCPtr, this), false);
  }

  public Vector updEventTriggersByStage(Stage arg0) {
    return new Vector(opensimModelJNI.State_updEventTriggersByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0), false);
  }

  public Vector updEventTriggersByStage(SWIGTYPE_p_SubsystemIndex arg0, Stage arg1) {
    return new Vector(opensimModelJNI.State_updEventTriggersByStage__SWIG_1(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0), Stage.getCPtr(arg1), arg1), false);
  }

  public Vector getQ(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getQ__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getU(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getU__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getZ(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getZ__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getUWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getUWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getZWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getZWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updQ(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updQ__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updU(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updU__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updZ(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updZ__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updUWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updUWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updZWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updZWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getQDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getQDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getUDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getUDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getZDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getZDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getQDotDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getQDotDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updQDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updQDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updUDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updUDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updZDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updZDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updQDotDot(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updQDotDot__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getQErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getQErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getUErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getUErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getUDotErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getUDotErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getMultipliers(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getMultipliers__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getQErrWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getQErrWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector getUErrWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_getUErrWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updQErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updQErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updUErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updUErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updUDotErr(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updUDotErr__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updMultipliers(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updMultipliers__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updQErrWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updQErrWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public Vector updUErrWeights(SWIGTYPE_p_SubsystemIndex arg0) {
    return new Vector(opensimModelJNI.State_updUErrWeights__SWIG_0(swigCPtr, this, SWIGTYPE_p_SubsystemIndex.getCPtr(arg0)), false);
  }

  public double getTime() {
    return opensimModelJNI.State_getTime(swigCPtr, this);
  }

  public Vector getY() {
    return new Vector(opensimModelJNI.State_getY(swigCPtr, this), false);
  }

  public Vector getQ() {
    return new Vector(opensimModelJNI.State_getQ__SWIG_1(swigCPtr, this), false);
  }

  public Vector getU() {
    return new Vector(opensimModelJNI.State_getU__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZ() {
    return new Vector(opensimModelJNI.State_getZ__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUWeights() {
    return new Vector(opensimModelJNI.State_getUWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZWeights() {
    return new Vector(opensimModelJNI.State_getZWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUWeights() {
    return new Vector(opensimModelJNI.State_updUWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZWeights() {
    return new Vector(opensimModelJNI.State_updZWeights__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_double updTime() {
    return new SWIGTYPE_p_double(opensimModelJNI.State_updTime(swigCPtr, this), false);
  }

  public Vector updY() {
    return new Vector(opensimModelJNI.State_updY(swigCPtr, this), false);
  }

  public void setTime(double t) {
    opensimModelJNI.State_setTime(swigCPtr, this, t);
  }

  public void setY(Vector y) {
    opensimModelJNI.State_setY(swigCPtr, this, Vector.getCPtr(y), y);
  }

  public Vector updQ() {
    return new Vector(opensimModelJNI.State_updQ__SWIG_1(swigCPtr, this), false);
  }

  public Vector updU() {
    return new Vector(opensimModelJNI.State_updU__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZ() {
    return new Vector(opensimModelJNI.State_updZ__SWIG_1(swigCPtr, this), false);
  }

  public void setQ(Vector q) {
    opensimModelJNI.State_setQ(swigCPtr, this, Vector.getCPtr(q), q);
  }

  public void setU(Vector u) {
    opensimModelJNI.State_setU(swigCPtr, this, Vector.getCPtr(u), u);
  }

  public void setZ(Vector z) {
    opensimModelJNI.State_setZ(swigCPtr, this, Vector.getCPtr(z), z);
  }

  public Vector getYDot() {
    return new Vector(opensimModelJNI.State_getYDot(swigCPtr, this), false);
  }

  public Vector getQDot() {
    return new Vector(opensimModelJNI.State_getQDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZDot() {
    return new Vector(opensimModelJNI.State_getZDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUDot() {
    return new Vector(opensimModelJNI.State_getUDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getQDotDot() {
    return new Vector(opensimModelJNI.State_getQDotDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updYDot() {
    return new Vector(opensimModelJNI.State_updYDot(swigCPtr, this), false);
  }

  public Vector updQDot() {
    return new Vector(opensimModelJNI.State_updQDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZDot() {
    return new Vector(opensimModelJNI.State_updZDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUDot() {
    return new Vector(opensimModelJNI.State_updUDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updQDotDot() {
    return new Vector(opensimModelJNI.State_updQDotDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getYErr() {
    return new Vector(opensimModelJNI.State_getYErr(swigCPtr, this), false);
  }

  public Vector getQErr() {
    return new Vector(opensimModelJNI.State_getQErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUErr() {
    return new Vector(opensimModelJNI.State_getUErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUDotErr() {
    return new Vector(opensimModelJNI.State_getUDotErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getMultipliers() {
    return new Vector(opensimModelJNI.State_getMultipliers__SWIG_1(swigCPtr, this), false);
  }

  public Vector getQErrWeights() {
    return new Vector(opensimModelJNI.State_getQErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUErrWeights() {
    return new Vector(opensimModelJNI.State_getUErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updQErrWeights() {
    return new Vector(opensimModelJNI.State_updQErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUErrWeights() {
    return new Vector(opensimModelJNI.State_updUErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updYErr() {
    return new Vector(opensimModelJNI.State_updYErr(swigCPtr, this), false);
  }

  public Vector updQErr() {
    return new Vector(opensimModelJNI.State_updQErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUErr() {
    return new Vector(opensimModelJNI.State_updUErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUDotErr() {
    return new Vector(opensimModelJNI.State_updUDotErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updMultipliers() {
    return new Vector(opensimModelJNI.State_updMultipliers__SWIG_1(swigCPtr, this), false);
  }

  public void getSystemStageVersions(SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t versions) {
    opensimModelJNI.State_getSystemStageVersions(swigCPtr, this, SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t.getCPtr(versions));
  }

  public Stage getLowestSystemStageDifference(SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t prevVersions) {
    return new Stage(opensimModelJNI.State_getLowestSystemStageDifference(swigCPtr, this, SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t.getCPtr(prevVersions)), true);
  }

  public void setSystemTopologyStageVersion(int topoVersion) {
    opensimModelJNI.State_setSystemTopologyStageVersion(swigCPtr, this, topoVersion);
  }

  public void autoUpdateDiscreteVariables() {
    opensimModelJNI.State_autoUpdateDiscreteVariables(swigCPtr, this);
  }

  public SWIGTYPE_p_String cacheToString() {
    return new SWIGTYPE_p_String(opensimModelJNI.State_cacheToString(swigCPtr, this), true);
  }

}
