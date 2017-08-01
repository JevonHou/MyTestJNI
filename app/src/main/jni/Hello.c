#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jint JNICALL Java_com_nicai_mytestjni_HelloJNI_add(JNIEnv* env, jobject obj, jint i, jint j) {
  return i+j;
  }

