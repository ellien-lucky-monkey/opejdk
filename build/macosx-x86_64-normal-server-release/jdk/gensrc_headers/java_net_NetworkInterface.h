/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class java_net_NetworkInterface */

#ifndef _Included_java_net_NetworkInterface
#define _Included_java_net_NetworkInterface
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     java_net_NetworkInterface
 * Method:    getAll
 * Signature: ()[Ljava/net/NetworkInterface;
 */
JNIEXPORT jobjectArray JNICALL Java_java_net_NetworkInterface_getAll
  (JNIEnv *, jclass);

/*
 * Class:     java_net_NetworkInterface
 * Method:    getByName0
 * Signature: (Ljava/lang/String;)Ljava/net/NetworkInterface;
 */
JNIEXPORT jobject JNICALL Java_java_net_NetworkInterface_getByName0
  (JNIEnv *, jclass, jstring);

/*
 * Class:     java_net_NetworkInterface
 * Method:    getByIndex0
 * Signature: (I)Ljava/net/NetworkInterface;
 */
JNIEXPORT jobject JNICALL Java_java_net_NetworkInterface_getByIndex0
  (JNIEnv *, jclass, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    getByInetAddress0
 * Signature: (Ljava/net/InetAddress;)Ljava/net/NetworkInterface;
 */
JNIEXPORT jobject JNICALL Java_java_net_NetworkInterface_getByInetAddress0
  (JNIEnv *, jclass, jobject);

/*
 * Class:     java_net_NetworkInterface
 * Method:    isUp0
 * Signature: (Ljava/lang/String;I)Z
 */
JNIEXPORT jboolean JNICALL Java_java_net_NetworkInterface_isUp0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    isLoopback0
 * Signature: (Ljava/lang/String;I)Z
 */
JNIEXPORT jboolean JNICALL Java_java_net_NetworkInterface_isLoopback0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    supportsMulticast0
 * Signature: (Ljava/lang/String;I)Z
 */
JNIEXPORT jboolean JNICALL Java_java_net_NetworkInterface_supportsMulticast0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    isP2P0
 * Signature: (Ljava/lang/String;I)Z
 */
JNIEXPORT jboolean JNICALL Java_java_net_NetworkInterface_isP2P0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    getMacAddr0
 * Signature: ([BLjava/lang/String;I)[B
 */
JNIEXPORT jbyteArray JNICALL Java_java_net_NetworkInterface_getMacAddr0
  (JNIEnv *, jclass, jbyteArray, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    getMTU0
 * Signature: (Ljava/lang/String;I)I
 */
JNIEXPORT jint JNICALL Java_java_net_NetworkInterface_getMTU0
  (JNIEnv *, jclass, jstring, jint);

/*
 * Class:     java_net_NetworkInterface
 * Method:    init
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_java_net_NetworkInterface_init
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
