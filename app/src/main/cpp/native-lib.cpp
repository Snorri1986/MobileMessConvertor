#include <jni.h>
#include <string>
#include <iostream>

//extern "C" JNIEXPORT double JNICALL

/*Java_com_snorri_mobilemessconvertor_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject this ) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}*/

/* WHEATERS CONVERTION */

// fahrenheit -> celcius
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_showCelcius(JNIEnv *env, jobject instance,
                                                      jdouble grad_val)
{

    const int conv_val = 32;
    const double dim_val_f_to_c = 0.55;
    double celcius = 0.0;
    celcius = (grad_val - conv_val) * dim_val_f_to_c; // temporary without round
    return celcius;

}

// celcius -> fahrenheit
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_showFaringeith(JNIEnv *env, jobject instance,
                                                         jdouble grad_val)
{

    double faringeith = 0.0;
    const double dim_val_c_to_f = 1.8;
    const int conv_val = 32;
    faringeith = grad_val*dim_val_c_to_f + conv_val; // temporary without round
    return faringeith;

}

// kelvin -> celcius
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_showCelciusFromKelvin(JNIEnv *env, jobject instance,
                                                                jdouble grad_val)
{
    const double final_zero = -273.15;
    if (grad_val == 0) return final_zero;
    const double kelvin_const = 273.15;  // C = K - 273;
    double grad_in_celcius = 0.0;
    grad_in_celcius = grad_val - kelvin_const; // temporary without round
    return grad_in_celcius;
}

/* END WHEATERS CONVERTIONS */