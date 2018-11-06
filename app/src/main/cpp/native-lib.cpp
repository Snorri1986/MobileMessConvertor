#include <jni.h>
#include <string>
#include <iostream>
#include <cmath>

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
    celcius = round((grad_val - conv_val) * dim_val_f_to_c);
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
    faringeith = grad_val*dim_val_c_to_f + conv_val;
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
    grad_in_celcius = grad_val - kelvin_const;
    return grad_in_celcius;
}

/* END WHEATERS CONVERTIONS */

/* OTHER US MESSERMENTS */

//land mile -> km
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_landMiletoKm(JNIEnv *env, jobject instance,
                                                       jdouble value) {
    const double land_mile = 1.60934;
    double inKmfromLandMile = 0.0;
    inKmfromLandMile = value * land_mile;
    return inKmfromLandMile;

}

// km -> land mile
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_kmToLandMile(JNIEnv *env, jobject instance,
                                                       jdouble value) {

    const double land_mile = 1.60934;
    double inLandMile = 0.0;
    inLandMile = value / land_mile;
    return inLandMile;

}

// sea miles -> km
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_seaMilestoKm(JNIEnv *env, jobject instance,
                                                       jdouble value) {

    const double sea_mile = 1.852;
    double inKmfromSeaMiles = 0.0;
    inKmfromSeaMiles = value * sea_mile;
    return inKmfromSeaMiles;

}

// km -> sea miles
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_kmToSeaMiles(JNIEnv *env, jobject instance,
                                                       jdouble value) {

    const double sea_mile = 1.852;
    double inSeaMiles = 0.0;
    inSeaMiles = value / sea_mile;
    return inSeaMiles;

}

// inch -> sm
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_inchToSm(JNIEnv *env, jobject instance, jdouble value) {

    const double inch = 2.54;
    double inSmfromInch = 0.0;
    inSmfromInch = value * inch;
    return inSmfromInch;

}

// sm ->inch
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_smToInch(JNIEnv *env, jobject instance, jdouble value) {

    const double inch = 2.54;
    double inInchFromSm = 0.0;
    inInchFromSm = value / inch;
    return inInchFromSm;

}

// ft -> meter
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_ftToMeter(JNIEnv *env, jobject instance, jdouble value) {

    const double ft = 0.3048;
    double inMeterFromFt = 0.0;
    inMeterFromFt = value * ft;
    return inMeterFromFt;

}

// meter -> ft
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_meterToFt(JNIEnv *env, jobject instance, jdouble value) {

    const double ft = 0.3048;
    double inFtFromMeter = 0.0;
    inFtFromMeter = value / ft;
    return inFtFromMeter;

}

// gallon -> litr
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_gallToLitr(JNIEnv *env, jobject instance, jdouble value) {

    const double gallon = 3.78541;
    double inLitrfromGall = 0.0;
    inLitrfromGall = value * gallon;
    return inLitrfromGall;

}

// litr -> gallon
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_litrToGall(JNIEnv *env, jobject instance, jdouble value) {

    const double gallon = 3.78541;
    double inGallfromLitr = 0.0;
    inGallfromLitr = value / gallon;
    return inGallfromLitr;

}

// yard -> meter
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_yardToMeter(JNIEnv *env, jobject instance,
                                                      jdouble value) {

        const double yard = 0.9144;
        double inMeterFromYard = 0.0;
        inMeterFromYard = value * yard;
        return inMeterFromYard;

}

// meter -> yard
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_snorri_mobilemessconvertor_MyCpp_meterToYard(JNIEnv *env, jobject instance,
                                                      jdouble value) {

    const double yard = 0.9144;
    double inYardFromMeter = 0.0;
    inYardFromMeter = value / yard;
    return inYardFromMeter;

}