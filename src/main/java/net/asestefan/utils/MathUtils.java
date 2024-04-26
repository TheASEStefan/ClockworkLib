package net.asestefan.utils;

/*
@Author = ASEStefan
 */

import net.minecraft.Util;

public class MathUtils {

    public static final float PI = (float) Math.PI;
    public static final float E = (float) Math.E;
    public static final int APPROX_PI = (int) Math.round(PI);
    public static final int APPROX_E = (int) Math.round(E);
    private static final float[] SIN = Util.make(new float[65536], (floats) -> {
        for(int i = 0; i < floats.length; ++i) {
            floats[i] = (float) Math.sin((double) i * Math.PI * 2.0D / 65536.0D);
        }

    });

    public static boolean equalsApprox(float a, float b){
        float diff = Math.abs(b - a);
        float tolerance = 0.1f/100 * b;
        return diff < tolerance;
    }

    public static double arcdouble(float lim) {
        return (double) 1 / lim;
    }
    public static double arcfloat(double size) {
        return (float) 1 / size;
    }


    // It doesn't represent the normal logarithm.
    public static float randLog(float base, float exponent) {
        return pow(base, exponent) / (base * base) * (exponent * exponent) - (exponent * base);
    }

    // It doesn't represent the normal logarithm.
    public static float randLg(float base, float exponent) {
        return pow(base, exponent) % 10 / (base * base) / 10 * (exponent * exponent) / 10 - (exponent * base) % 10;
    }

    public static float sqrt(float pValue) {
        return (float) Math.sqrt((double) pValue);
    }
    public static float pow(double a, double b) {
        return (float) StrictMath.pow(a, b);
    }
    public static double rint(double a) {
        return StrictMath.rint(a);
    }
    public static float sin(float pValue) {
        return SIN [ (int) (pValue * 10430.378F) & '\uffff'];
    }
    public static float cos(float pValue) {
        return SIN [ (int) (pValue * 10430.378F + 16384.0F) & '\uffff'];
    }
    public static float tg(float pValue) {
        return sin(pValue) / cos(pValue);
    }
    public static float ctg(float pValue) {
        return cos(pValue) / sin(pValue);
    }

    public static int clampedInt(int pValue, int pMin, int pMax) {
        return Math.min(Math.max(pValue, pMin), pMax);
    }
    public static float clampedFloat(float pValue, float pMin, float pMax) {
        return pValue < pMin ? pMin : Math.min(pValue, pMax);
    }
    public static double clampedDouble(double pValue, double pMin, double pMax) {
        return pValue < pMin ? pMin : Math.min(pValue, pMax);
    }
    public static float clampedLerp(float pStart, float pEnd, float pDelta) {
        if (pDelta < 0.0F) {
            return pStart;
        } else {
            return pDelta > 1.0F ? pEnd : lerp(pDelta, pStart, pEnd);
        }
    }

    public static float wrapLerpDegree(float pValue) {
        float f = pValue % 360.0F;
        if (f >= 180.0F) {
            f -= 360.0F;
        }

        if (f < -180.0F) {
            f += 360.0F;
        }

        return f;
    }
    public static float lerp(float pDelta, float pStart, float pEnd) {
        return pStart + pDelta * (pEnd - pStart);
    }
    public static float lerpRotate(float pDelta, float pStart, float pEnd) {
        return pStart + pDelta * wrapLerpDegree(pEnd - pStart);
    }
    public static float lerpReverse(float pDelta, float pStart, float pEnd) {
        return (pDelta - pStart) / (pEnd - pStart);
    }
    public static float lerpedTan(float pDelta, float pStart, float pEnd) {
        return (sin(pEnd) / cos(pEnd)) - (sin(pStart) / cos(pStart)) + ((sin(pDelta) / cos(pDelta)) / 4);
    }
    public static float lerpedCot(float pDelta, float pStart, float pEnd) {
        return (cos(pEnd) / sin(pEnd)) - (cos(pStart) / sin(pStart)) + ((cos(pDelta) / sin(pDelta)) / 4);
    }


}
