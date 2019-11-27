/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_lwawt_macosx_CDragSourceContextPeer */

#ifndef _Included_sun_lwawt_macosx_CDragSourceContextPeer
#define _Included_sun_lwawt_macosx_CDragSourceContextPeer
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_ENTER
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_ENTER 1L
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_MOTION
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_MOTION 2L
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_CHANGED
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_CHANGED 3L
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_EXIT
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_EXIT 4L
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_FINISH
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_FINISH 5L
#undef sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_MOUSE_MOVED
#define sun_lwawt_macosx_CDragSourceContextPeer_DISPATCH_MOUSE_MOVED 6L
/*
 * Class:     sun_lwawt_macosx_CDragSourceContextPeer
 * Method:    createNativeDragSource
 * Signature: (Ljava/awt/Component;JLjava/awt/datatransfer/Transferable;Ljava/awt/event/InputEvent;IIIIJLsun/lwawt/macosx/CImage;III[JLjava/util/Map;)J
 */
JNIEXPORT jlong JNICALL Java_sun_lwawt_macosx_CDragSourceContextPeer_createNativeDragSource
  (JNIEnv *, jobject, jobject, jlong, jobject, jobject, jint, jint, jint, jint, jlong, jobject, jint, jint, jint, jlongArray, jobject);

/*
 * Class:     sun_lwawt_macosx_CDragSourceContextPeer
 * Method:    doDragging
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CDragSourceContextPeer_doDragging
  (JNIEnv *, jobject, jlong);

/*
 * Class:     sun_lwawt_macosx_CDragSourceContextPeer
 * Method:    releaseNativeDragSource
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_sun_lwawt_macosx_CDragSourceContextPeer_releaseNativeDragSource
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
