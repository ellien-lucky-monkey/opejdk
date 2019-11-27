/* AUTOMATICALLY GENERATED FILE - DO NOT EDIT */

#ifndef TRACEFILES_JFREVENTIDS_HPP
#define TRACEFILES_JFREVENTIDS_HPP

#include "utilities/macros.hpp"

#if INCLUDE_TRACE

#include "trace/traceDataTypes.hpp"

/**
 * Enum of the event types in the JVM
 */
enum TraceEventId {
  _traceeventbase = (NUM_RESERVED_EVENTS-1), // Make sure we start at right index.
  
  // Events -> enum entry
  TraceThreadStartEvent,
  TraceThreadEndEvent,
  TraceThreadSleepEvent,
  TraceThreadParkEvent,
  TraceJavaMonitorEnterEvent,
  TraceJavaMonitorWaitEvent,
  TraceClassLoadEvent,
  TraceClassUnloadEvent,
  TraceGCHeapSummaryEvent,
  TraceMetaspaceSummaryEvent,
  TracePSHeapSummaryEvent,
  TraceGCGarbageCollectionEvent,
  TraceGCParallelOldEvent,
  TraceGCYoungGarbageCollectionEvent,
  TraceGCOldGarbageCollectionEvent,
  TraceGCG1GarbageCollectionEvent,
  TraceEvacuationInfoEvent,
  TraceGCReferenceStatisticsEvent,
  TraceObjectCountAfterGCEvent,
  TracePromotionFailedEvent,
  TraceEvacuationFailedEvent,
  TraceConcurrentModeFailureEvent,
  TraceGCPhasePauseEvent,
  TraceGCPhasePauseLevel1Event,
  TraceGCPhasePauseLevel2Event,
  TraceGCPhasePauseLevel3Event,
  TraceCompilationEvent,
  TraceCompilerPhaseEvent,
  TraceCompilerFailureEvent,
  TraceSweepCodeCacheEvent,
  TraceCodeCacheFullEvent,
  TraceExecuteVMOperationEvent,
  TraceAllocObjectInNewTLABEvent,
  TraceAllocObjectOutsideTLABEvent,

  MaxTraceEventId
};

/**
 * Struct types in the JVM
 */
enum TraceStructId {
  TraceThreadStruct,
  TraceVMThreadStruct,
  TraceJavaThreadStruct,
  TraceThreadGroupStruct,
  TraceStackTraceStruct,
  TraceClassStruct,
  TraceMethodStruct,
  TraceUTFConstantStruct,
  TraceThreadStateStruct,
  TraceFrameTypeStruct,
  TraceStackFrameStruct,
  TraceGCNameStruct,
  TraceGCCauseStruct,
  TraceGCWhenStruct,
  TraceG1YCTypeStruct,
  TraceReferenceTypeStruct,
  TraceNARROW_OOP_MODEStruct,
  TraceVMOperationTypeStruct,
  TraceCompilerPhaseTypeStruct,
  TraceThreadStartStruct,
  TraceThreadEndStruct,
  TraceThreadSleepStruct,
  TraceThreadParkStruct,
  TraceJavaMonitorEnterStruct,
  TraceJavaMonitorWaitStruct,
  TraceClassLoadStruct,
  TraceClassUnloadStruct,
  TraceVirtualSpaceStruct,
  TraceObjectSpaceStruct,
  TraceGCHeapSummaryStruct,
  TraceMetaspaceSizesStruct,
  TraceMetaspaceSummaryStruct,
  TracePSHeapSummaryStruct,
  TraceGCGarbageCollectionStruct,
  TraceGCParallelOldStruct,
  TraceGCYoungGarbageCollectionStruct,
  TraceGCOldGarbageCollectionStruct,
  TraceGCG1GarbageCollectionStruct,
  TraceEvacuationInfoStruct,
  TraceGCReferenceStatisticsStruct,
  TraceCopyFailedStruct,
  TraceObjectCountAfterGCStruct,
  TracePromotionFailedStruct,
  TraceEvacuationFailedStruct,
  TraceConcurrentModeFailureStruct,
  TraceGCPhasePauseStruct,
  TraceGCPhasePauseLevel1Struct,
  TraceGCPhasePauseLevel2Struct,
  TraceGCPhasePauseLevel3Struct,
  TraceCompilationStruct,
  TraceCompilerPhaseStruct,
  TraceCompilerFailureStruct,
  TraceSweepCodeCacheStruct,
  TraceCodeCacheFullStruct,
  TraceExecuteVMOperationStruct,
  TraceAllocObjectInNewTLABStruct,
  TraceAllocObjectOutsideTLABStruct,

  MaxTraceStructId
};

typedef enum TraceEventId  TraceEventId;
typedef enum TraceStructId TraceStructId;

#endif
#endif
