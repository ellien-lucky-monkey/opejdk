/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_security_ec_ECKeyPairGenerator */

#ifndef _Included_sun_security_ec_ECKeyPairGenerator
#define _Included_sun_security_ec_ECKeyPairGenerator
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_security_ec_ECKeyPairGenerator_KEY_SIZE_MIN
#define sun_security_ec_ECKeyPairGenerator_KEY_SIZE_MIN 112L
#undef sun_security_ec_ECKeyPairGenerator_KEY_SIZE_MAX
#define sun_security_ec_ECKeyPairGenerator_KEY_SIZE_MAX 571L
#undef sun_security_ec_ECKeyPairGenerator_KEY_SIZE_DEFAULT
#define sun_security_ec_ECKeyPairGenerator_KEY_SIZE_DEFAULT 256L
/*
 * Class:     sun_security_ec_ECKeyPairGenerator
 * Method:    generateECKeyPair
 * Signature: (I[B[B)[J
 */
JNIEXPORT jlongArray JNICALL Java_sun_security_ec_ECKeyPairGenerator_generateECKeyPair
  (JNIEnv *, jclass, jint, jbyteArray, jbyteArray);

/*
 * Class:     sun_security_ec_ECKeyPairGenerator
 * Method:    getEncodedBytes
 * Signature: (J)[B
 */
JNIEXPORT jbyteArray JNICALL Java_sun_security_ec_ECKeyPairGenerator_getEncodedBytes
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
