#include <string.h>
#include <jni.h>
#include <android/log.h>

#define LOG_TAG "your-log-tag"

JNIEXPORT jstring JNICALL
Java_miguel_freitas_kotlingoat_medium_UseOfNativeLanguage_00024Companion_getStringFromJNI(
        JNIEnv *env, jobject thiz) {
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

JNIEXPORT void JNICALL
Java_miguel_freitas_kotlingoat_medium_PrivacyViolation_00024Companion_printPassword(JNIEnv *env,
                                                                                    jobject thiz,
                                                                                    jstring password) {
    __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, "Need to print : %s",
                        (char *) password); //Privacy Violation
    __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, "Need to print : %s",
                        password); //Privacy Violation
    __android_log_vprint(ANDROID_LOG_ERROR, LOG_TAG, "Need to print : %s",
                         (char *) password); //Privacy Violation
    __android_log_vprint(ANDROID_LOG_ERROR, LOG_TAG, "Need to print : %s",
                         password); //Privacy Violation
    __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, password); //Privacy Violation
    __android_log_write(ANDROID_LOG_ERROR, password, password); //Privacy Violation
    __android_log_write(ANDROID_LOG_ERROR, LOG_TAG, (char *) password); //Privacy Violation
}