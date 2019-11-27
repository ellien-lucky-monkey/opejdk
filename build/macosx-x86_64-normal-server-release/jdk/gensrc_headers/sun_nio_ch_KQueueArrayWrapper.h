/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_nio_ch_KQueueArrayWrapper */

#ifndef _Included_sun_nio_ch_KQueueArrayWrapper
#define _Included_sun_nio_ch_KQueueArrayWrapper
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_nio_ch_KQueueArrayWrapper_POLLIN
#define sun_nio_ch_KQueueArrayWrapper_POLLIN 1L
#undef sun_nio_ch_KQueueArrayWrapper_POLLOUT
#define sun_nio_ch_KQueueArrayWrapper_POLLOUT 4L
#undef sun_nio_ch_KQueueArrayWrapper_NUM_KEVENTS
#define sun_nio_ch_KQueueArrayWrapper_NUM_KEVENTS 128L
/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    init
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_sun_nio_ch_KQueueArrayWrapper_init
  (JNIEnv *, jobject);

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    initStructSizes
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_sun_nio_ch_KQueueArrayWrapper_initStructSizes
  (JNIEnv *, jclass);

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    register0
 * Signature: (IIII)V
 */
JNIEXPORT void JNICALL Java_sun_nio_ch_KQueueArrayWrapper_register0
  (JNIEnv *, jobject, jint, jint, jint, jint);

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    kevent0
 * Signature: (IJIJ)I
 */
JNIEXPORT jint JNICALL Java_sun_nio_ch_KQueueArrayWrapper_kevent0
  (JNIEnv *, jobject, jint, jlong, jint, jlong);

/*
 * Class:     sun_nio_ch_KQueueArrayWrapper
 * Method:    interrupt
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_sun_nio_ch_KQueueArrayWrapper_interrupt
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
