#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL
Java_miguel_freitas_kotlingoat_medium_UseOfNativeLanguage_00024Companion_getStringFromJNI(JNIEnv *env, jobject thiz) {
    return (*env)->NewStringUTF(env, "Hello from JNI");
}

JNIEXPORT jstring JNICALL
Java_miguel_freitas_kotlingoat_medium_UseOfNativeLanguage_00024Companion_getPasswordFromJNI(
        JNIEnv *env, jobject thiz) {
    jstring password = "myPassword"; // Harcoded Password
    return (*env)->NewStringUTF(env, password);
}

JNIEXPORT jstring JNICALL
Java_miguel_freitas_kotlingoat_medium_UseOfNativeLanguage_00024Companion_getKeyFromJNI(
        JNIEnv *env, jobject thiz) {
    jstring key = "myKey"; // Harcoded Key
    return (*env)->NewStringUTF(env, key);
}

JNIEXPORT jstring JNICALL
Java_miguel_freitas_kotlingoat_medium_UseOfNativeLanguage_00024Companion_getFromJNI(
        JNIEnv *env, jobject thiz) {
    jstring secret = "mySecret"; // Harcoded Key
    return (*env)->NewStringUTF(env, secret);
}