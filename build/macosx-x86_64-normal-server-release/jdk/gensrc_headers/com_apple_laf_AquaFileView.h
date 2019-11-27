/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_apple_laf_AquaFileView */

#ifndef _Included_com_apple_laf_AquaFileView
#define _Included_com_apple_laf_AquaFileView
#ifdef __cplusplus
extern "C" {
#endif
#undef com_apple_laf_AquaFileView_DEBUG
#define com_apple_laf_AquaFileView_DEBUG 0L
#undef com_apple_laf_AquaFileView_UNINITALIZED_LS_INFO
#define com_apple_laf_AquaFileView_UNINITALIZED_LS_INFO -1L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsPlainFile
#define com_apple_laf_AquaFileView_kLSItemInfoIsPlainFile 1L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsPackage
#define com_apple_laf_AquaFileView_kLSItemInfoIsPackage 2L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsApplication
#define com_apple_laf_AquaFileView_kLSItemInfoIsApplication 4L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsContainer
#define com_apple_laf_AquaFileView_kLSItemInfoIsContainer 8L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsAliasFile
#define com_apple_laf_AquaFileView_kLSItemInfoIsAliasFile 16L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsSymlink
#define com_apple_laf_AquaFileView_kLSItemInfoIsSymlink 32L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsInvisible
#define com_apple_laf_AquaFileView_kLSItemInfoIsInvisible 64L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsNativeApp
#define com_apple_laf_AquaFileView_kLSItemInfoIsNativeApp 128L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsClassicApp
#define com_apple_laf_AquaFileView_kLSItemInfoIsClassicApp 256L
#undef com_apple_laf_AquaFileView_kLSItemInfoAppPrefersNative
#define com_apple_laf_AquaFileView_kLSItemInfoAppPrefersNative 512L
#undef com_apple_laf_AquaFileView_kLSItemInfoAppPrefersClassic
#define com_apple_laf_AquaFileView_kLSItemInfoAppPrefersClassic 1024L
#undef com_apple_laf_AquaFileView_kLSItemInfoAppIsScriptable
#define com_apple_laf_AquaFileView_kLSItemInfoAppIsScriptable 2048L
#undef com_apple_laf_AquaFileView_kLSItemInfoIsVolume
#define com_apple_laf_AquaFileView_kLSItemInfoIsVolume 4096L
#undef com_apple_laf_AquaFileView_kLSItemInfoExtensionIsHidden
#define com_apple_laf_AquaFileView_kLSItemInfoExtensionIsHidden 1048576L
/*
 * Class:     com_apple_laf_AquaFileView
 * Method:    getNativePathToSharedJDKBundle
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_apple_laf_AquaFileView_getNativePathToSharedJDKBundle
  (JNIEnv *, jclass);

/*
 * Class:     com_apple_laf_AquaFileView
 * Method:    getNativeMachineName
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_apple_laf_AquaFileView_getNativeMachineName
  (JNIEnv *, jclass);

/*
 * Class:     com_apple_laf_AquaFileView
 * Method:    getNativeDisplayName
 * Signature: ([BZ)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_apple_laf_AquaFileView_getNativeDisplayName
  (JNIEnv *, jclass, jbyteArray, jboolean);

/*
 * Class:     com_apple_laf_AquaFileView
 * Method:    getNativeLSInfo
 * Signature: ([BZ)I
 */
JNIEXPORT jint JNICALL Java_com_apple_laf_AquaFileView_getNativeLSInfo
  (JNIEnv *, jclass, jbyteArray, jboolean);

/*
 * Class:     com_apple_laf_AquaFileView
 * Method:    getNativePathForResolvedAlias
 * Signature: ([BZ)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_apple_laf_AquaFileView_getNativePathForResolvedAlias
  (JNIEnv *, jclass, jbyteArray, jboolean);

#ifdef __cplusplus
}
#endif
#endif
