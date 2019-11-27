/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_awt_CGraphicsEnvironment */

#ifndef _Included_sun_awt_CGraphicsEnvironment
#define _Included_sun_awt_CGraphicsEnvironment
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     sun_awt_CGraphicsEnvironment
 * Method:    initCocoa
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_sun_awt_CGraphicsEnvironment_initCocoa
  (JNIEnv *, jclass);

/*
 * Class:     sun_awt_CGraphicsEnvironment
 * Method:    getDisplayIDs
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_sun_awt_CGraphicsEnvironment_getDisplayIDs
  (JNIEnv *, jclass);

/*
 * Class:     sun_awt_CGraphicsEnvironment
 * Method:    getMainDisplayID
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_sun_awt_CGraphicsEnvironment_getMainDisplayID
  (JNIEnv *, jclass);

/*
 * Class:     sun_awt_CGraphicsEnvironment
 * Method:    registerDisplayReconfiguration
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_sun_awt_CGraphicsEnvironment_registerDisplayReconfiguration
  (JNIEnv *, jobject);

/*
 * Class:     sun_awt_CGraphicsEnvironment
 * Method:    deregisterDisplayReconfiguration
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_sun_awt_CGraphicsEnvironment_deregisterDisplayReconfiguration
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
