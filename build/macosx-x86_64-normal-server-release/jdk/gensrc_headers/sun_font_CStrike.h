/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_font_CStrike */

#ifndef _Included_sun_font_CStrike
#define _Included_sun_font_CStrike
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     sun_font_CStrike
 * Method:    createNativeStrikePtr
 * Signature: (J[D[DII)J
 */
JNIEXPORT jlong JNICALL Java_sun_font_CStrike_createNativeStrikePtr
  (JNIEnv *, jclass, jlong, jdoubleArray, jdoubleArray, jint, jint);

/*
 * Class:     sun_font_CStrike
 * Method:    disposeNativeStrikePtr
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_sun_font_CStrike_disposeNativeStrikePtr
  (JNIEnv *, jclass, jlong);

/*
 * Class:     sun_font_CStrike
 * Method:    getFontMetrics
 * Signature: (J)Lsun/font/StrikeMetrics;
 */
JNIEXPORT jobject JNICALL Java_sun_font_CStrike_getFontMetrics
  (JNIEnv *, jclass, jlong);

/*
 * Class:     sun_font_CStrike
 * Method:    getGlyphImagePtrsNative
 * Signature: (J[J[II)V
 */
JNIEXPORT void JNICALL Java_sun_font_CStrike_getGlyphImagePtrsNative
  (JNIEnv *, jclass, jlong, jlongArray, jintArray, jint);

/*
 * Class:     sun_font_CStrike
 * Method:    getNativeGlyphAdvance
 * Signature: (JI)F
 */
JNIEXPORT jfloat JNICALL Java_sun_font_CStrike_getNativeGlyphAdvance
  (JNIEnv *, jclass, jlong, jint);

/*
 * Class:     sun_font_CStrike
 * Method:    getNativeGlyphOutline
 * Signature: (JIDD)Ljava/awt/geom/GeneralPath;
 */
JNIEXPORT jobject JNICALL Java_sun_font_CStrike_getNativeGlyphOutline
  (JNIEnv *, jclass, jlong, jint, jdouble, jdouble);

/*
 * Class:     sun_font_CStrike
 * Method:    getNativeGlyphImageBounds
 * Signature: (JILjava/awt/geom/Rectangle2D/Float;DD)V
 */
JNIEXPORT void JNICALL Java_sun_font_CStrike_getNativeGlyphImageBounds
  (JNIEnv *, jclass, jlong, jint, jobject, jdouble, jdouble);

#ifdef __cplusplus
}
#endif
#endif
