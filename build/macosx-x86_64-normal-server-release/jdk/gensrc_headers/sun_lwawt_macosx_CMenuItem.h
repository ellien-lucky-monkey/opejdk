/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_lwawt_macosx_CMenuItem */

#ifndef _Included_sun_lwawt_macosx_CMenuItem
#define _Included_sun_lwawt_macosx_CMenuItem
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     sun_lwawt_macosx_CMenuItem
 * Method:    nativeCreate
 * Signature: (JZ)J
 */
JNIEXPORT jlong JNICALL Java_sun_lwawt_macosx_CMenuItem_nativeCreate
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     sun_lwawt_macosx_CMenuItem
 * Method:    nativeSetLabel
 * Signature: (JLjava/lang/String;CII)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CMenuItem_nativeSetLabel
  (JNIEnv *, jobject, jlong, jstring, jchar, jint, jint);

/*
 * Class:     sun_lwawt_macosx_CMenuItem
 * Method:    nativeSetImage
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CMenuItem_nativeSetImage
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     sun_lwawt_macosx_CMenuItem
 * Method:    nativeSetTooltip
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CMenuItem_nativeSetTooltip
  (JNIEnv *, jobject, jlong, jstring);

/*
 * Class:     sun_lwawt_macosx_CMenuItem
 * Method:    nativeSetEnabled
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CMenuItem_nativeSetEnabled
  (JNIEnv *, jobject, jlong, jboolean);

#ifdef __cplusplus
}
#endif
#endif