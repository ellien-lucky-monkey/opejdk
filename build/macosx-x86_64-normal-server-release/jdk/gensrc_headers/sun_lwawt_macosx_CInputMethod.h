/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_lwawt_macosx_CInputMethod */

#ifndef _Included_sun_lwawt_macosx_CInputMethod
#define _Included_sun_lwawt_macosx_CInputMethod
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_lwawt_macosx_CInputMethod_kCaretPosition
#define sun_lwawt_macosx_CInputMethod_kCaretPosition 0L
#undef sun_lwawt_macosx_CInputMethod_kRawText
#define sun_lwawt_macosx_CInputMethod_kRawText 1L
#undef sun_lwawt_macosx_CInputMethod_kSelectedRawText
#define sun_lwawt_macosx_CInputMethod_kSelectedRawText 2L
#undef sun_lwawt_macosx_CInputMethod_kConvertedText
#define sun_lwawt_macosx_CInputMethod_kConvertedText 3L
#undef sun_lwawt_macosx_CInputMethod_kSelectedConvertedText
#define sun_lwawt_macosx_CInputMethod_kSelectedConvertedText 4L
/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    nativeNotifyPeer
 * Signature: (JLsun/lwawt/macosx/CInputMethod;)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CInputMethod_nativeNotifyPeer
  (JNIEnv *, jobject, jlong, jobject);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    nativeEndComposition
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CInputMethod_nativeEndComposition
  (JNIEnv *, jobject, jlong);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    nativeHandleEvent
 * Signature: (Lsun/lwawt/LWComponentPeer;Ljava/awt/AWTEvent;)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CInputMethod_nativeHandleEvent
  (JNIEnv *, jobject, jobject, jobject);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    getNativeLocale
 * Signature: ()Ljava/util/Locale;
 */
JNIEXPORT jobject JNICALL Java_sun_lwawt_macosx_CInputMethod_getNativeLocale
  (JNIEnv *, jclass);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    setNativeLocale
 * Signature: (Ljava/lang/String;Z)Z
 */
JNIEXPORT jboolean JNICALL Java_sun_lwawt_macosx_CInputMethod_setNativeLocale
  (JNIEnv *, jclass, jstring, jboolean);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    nativeGetCurrentInputMethodInfo
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sun_lwawt_macosx_CInputMethod_nativeGetCurrentInputMethodInfo
  (JNIEnv *, jclass);

/*
 * Class:     sun_lwawt_macosx_CInputMethod
 * Method:    nativeInit
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CInputMethod_nativeInit
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
