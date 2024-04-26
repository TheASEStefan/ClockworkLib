package net.asestefan.utils;

/*
@Author = Robert Penner (Functions)
 */
public interface EasingUtils {

    /**
     * The basic function for EasingUtils.
     * @param t the time (either frames or in seconds/milliseconds)
     * @param b the beginning value
     * @param c the value changed
     * @param d the duration time
     * @return the eased value
     */
    public float ease(float t, float b, float c, float d);

    /**
     * Simple linear tweening - no EasingUtils.
     */
    public static final EasingUtils LINEAR = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*t/d + b;
        }
    };

    ///////////// QUADRATIC EasingUtils: t^2 ///////////////////

    /**
     * Quadratic EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils QUAD_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*(t/=d)*t + b;
        }
    };

    /**
     * Quadratic EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils QUAD_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return -c *(t/=d)*(t-2) + b;
        }
    };

    /**
     * Quadratic EasingUtils in/out - acceleration until halfway, then deceleration
     */
    public static final EasingUtils QUAD_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d/2) < 1) return c/2*t*t + b;
            return -c/2 * ((--t)*(t-2) - 1) + b;
        }
    };


    ///////////// CUBIC EasingUtils: t^3 ///////////////////////

    /**
     * Cubic EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils CUBIC_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*(t/=d)*t*t + b;
        }
    };

    /**
     * Cubic EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils CUBIC_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*((t=t/d-1)*t*t + 1) + b;
        }
    };

    /**
     * Cubic EasingUtils in/out - acceleration until halfway, then deceleration.
     */
    public static final EasingUtils CUBIC_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d/2) < 1) return c/2*t*t*t + b;
            return c/2*((t-=2)*t*t + 2) + b;
        }
    };

    ///////////// QUARTIC EasingUtils: t^4 /////////////////////

    /**
     * Quartic EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils QUARTIC_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*(t/=d)*t*t*t + b;
        }
    };

    /**
     * Quartic EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils QUARTIC_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return -c * ((t=t/d-1)*t*t*t - 1) + b;
        }
    };

    /**
     * Quartic EasingUtils in/out - acceleration until halfway, then deceleration.
     */
    public static final EasingUtils QUARTIC_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d/2) < 1) return c/2*t*t*t*t + b;
            return -c/2 * ((t-=2)*t*t*t - 2) + b;
        }
    };

    ///////////// QUINTIC EasingUtils: t^5  ////////////////////

    /**
     * Quintic EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils QUINTIC_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*(t/=d)*t*t*t*t + b;
        }
    };

    /**
     * Quintic EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils QUINTIC_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c*((t=t/d-1)*t*t*t*t + 1) + b;
        }
    };

    /**
     * Quintic EasingUtils in/out - acceleration until halfway, then deceleration.
     */
    public static final EasingUtils QUINTIC_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d/2) < 1) return c/2*t*t*t*t*t + b;
            return c/2*((t-=2)*t*t*t*t + 2) + b;
        }
    };



    ///////////// SINUSOIDAL EasingUtils: sin(t) ///////////////

    /**
     * Sinusoidal EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils SINE_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return -c * MathUtils.cos((float) (t/d * (Math.PI/2))) + c + b;
        }
    };

    /**
     * Sinusoidal EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils SINE_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c * MathUtils.sin((float) (t/d * (Math.PI/2))) + b;
        }
    };

    /**
     * Sinusoidal EasingUtils in/out - accelerating until halfway, then decelerating.
     */
    public static final EasingUtils SINE_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return -c/2 * ((float) MathUtils.cos((float) (Math.PI*t/d)) - 1) + b;
        }
    };

    ///////////// EXPONENTIAL EasingUtils: 2^t /////////////////

    /**
     * Exponential EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils EXPO_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return (t==0) ? b : c * (float)Math.pow(2, 10 * (t/d - 1)) + b;
        }
    };

    /**
     * Exponential EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils EXPO_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return (t==d) ? b+c : c * (-(float)Math.pow(2, -10 * t/d) + 1) + b;
        }
    };

    /**
     * Exponential EasingUtils in/out - accelerating until halfway, then decelerating.
     */
    public static final EasingUtils EXPO_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if (t==0) return b;
            if (t==d) return b+c;
            if ((t/=d/2) < 1) return c/2 * (float)Math.pow(2, 10 * (t - 1)) + b;
            return c/2 * (-(float)Math.pow(2, -10 * --t) + 2) + b;
        }
    };


    /////////// CIRCULAR EasingUtils: sqrt(1-t^2) //////////////

    /**
     * Circular EasingUtils in - accelerating from zero velocity.
     */
    public static final EasingUtils CIRC_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return -c * ((float)Math.sqrt(1 - (t/=d)*t) - 1) + b;
        }
    };

    /**
     * Circular EasingUtils out - decelerating to zero velocity.
     */
    public static final EasingUtils CIRC_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c * (float)Math.sqrt(1 - (t=t/d-1)*t) + b;
        }
    };

    /**
     * Circular EasingUtils in/out - acceleration until halfway, then deceleration.
     */
    public static final EasingUtils CIRC_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d/2) < 1) return -c/2 * ((float)Math.sqrt(1 - t*t) - 1) + b;
            return c/2 * ((float)Math.sqrt(1 - (t-=2)*t) + 1) + b;
        }
    };

    /////////// ELASTIC EasingUtils: exponentially decaying sine wave  //////////////

    /**
     * A base class for elastic EasingUtilss.
     */
    public static abstract class Elastic implements EasingUtils {
        private float amplitude;
        private float period;

        /**
         * Creates a new Elastic EasingUtils with the specified settings.
         * @param amplitude the amplitude for the elastic function
         * @param period the period for the elastic function
         */
        public Elastic(float amplitude, float period) {
            this.amplitude = amplitude;
            this.period = period;
        }

        /**
         * Creates a new Elastic EasingUtils with default settings (-1f, 0f).
         */
        public Elastic() {
            this(-1f, 0f);
        }

        /**
         * Returns the period.
         * @return the period for this EasingUtils
         */
        public float getPeriod() {
            return period;
        }

        /**
         * Sets the period to the given value.
         * @param period the new period
         */
        public void setPeriod(float period) {
            this.period = period;
        }

        /**
         * Returns the amplitude.
         * @return the amplitude for this EasingUtils
         */
        public float getAmplitude() {
            return amplitude;
        }

        /**
         * Sets the amplitude to the given value.
         * @param amplitude the new amplitude
         */
        public void setAmplitude(float amplitude) {
            this.amplitude = amplitude;
        }
    }

    /** An EasingUtilsIn instance using the default values. */
    public static final EasingUtils.Elastic ELASTIC_IN = new EasingUtils.ElasticIn();

    /** An Elastic EasingUtils used for ElasticIn functions. */
    public static class ElasticIn extends Elastic {
        public ElasticIn(float amplitude, float period) {
            super(amplitude, period);
        }
        public ElasticIn() {
            super();
        }

        public float ease(float t, float b, float c, float d) {
            float a = getAmplitude();
            float p = getPeriod();
            if (t==0) return b;  if ((t/=d)==1) return b+c;  if (p==0) p=d*.3f;
            float s = 0;
            if (a < Math.abs(c)) { a=c; s=p/4; }
            else s = p/(float)(2*Math.PI) * (float)Math.asin(c/a);
            return -(a*(float)Math.pow(2,10*(t-=1)) * (float)Math.sin( (t*d-s)*(2*Math.PI)/p )) + b;
        }
    }

    /** An ElasticOut instance using the default values. */
    public static final EasingUtils.Elastic ELASTIC_OUT = new EasingUtils.ElasticOut();

    /** An Elastic EasingUtils used for ElasticOut functions. */
    public static class ElasticOut extends Elastic {
        public ElasticOut(float amplitude, float period) {
            super(amplitude, period);
        }
        public ElasticOut() {
            super();
        }

        public float ease(float t, float b, float c, float d) {
            float a = getAmplitude();
            float p = getPeriod();
            if (t==0) return b;  if ((t/=d)==1) return b+c;  if (p==0) p=d*.3f;
            float s = 0;
            if (a < Math.abs(c)) { a=c; s=p/4; }
            else s = p/(float)(2*Math.PI) * (float)Math.asin(c/a);
            return a*(float)Math.pow(2,-10*t) * (float) MathUtils.sin((float) ((t*d-s)*(2*Math.PI)/p)) + c + b;
        }
    }

    /** An ElasticInOut instance using the default values. */
    public static final EasingUtils.Elastic ELASTIC_IN_OUT = new EasingUtils.ElasticInOut();

    /** An Elastic EasingUtils used for ElasticInOut functions. */
    public static class ElasticInOut extends Elastic {
        public ElasticInOut(float amplitude, float period) {
            super(amplitude, period);
        }
        public ElasticInOut() {
            super();
        }

        public float ease(float t, float b, float c, float d) {
            float a = getAmplitude();
            float p = getPeriod();
            if (t==0) return b;  if ((t/=d/2)==2) return b+c;  if (p==0) p=d*(.3f*1.5f);
            float s = 0;
            if (a < Math.abs(c)) { a=c; s=p/4f; }
            else s = p/(float)(2*Math.PI) * (float)Math.asin(c/a);
            if (t < 1) return -.5f*(a*(float)Math.pow(2,10*(t-=1)) * (float) MathUtils.sin( (t*d-s)*(2*MathUtils.PI)/p )) + b;
            return a*(float)Math.pow(2,-10*(t-=1)) * (float) MathUtils.sin((float) ((t*d-s)*(2*MathUtils.PI)/p))*.5f + c + b;
        }
    }

    /////////// BACK EasingUtils: overshooting cubic EasingUtils: (s+1)*t^3 - s*t^2  //////////////

    /** A base class for Back EasingUtilss. */
    public static abstract class Back implements EasingUtils {
        /** The default overshoot is 10% (1.70158). */
        public static final float DEFAULT_OVERSHOOT = 1.70158f;

        private float overshoot;

        /** Creates a new Back instance with the default overshoot (1.70158). */
        public Back() { this(DEFAULT_OVERSHOOT); }

        /**
         * Creates a new Back instance with the specified overshoot.
         * @param overshoot the amount to overshoot by -- higher number
         *          means more overshoot and an overshoot of 0 results in
         *          cubic EasingUtils with no overshoot
         */
        public Back(float overshoot) { this.overshoot = overshoot; }

        /**
         * Sets the overshoot to the given value. 
         * @param overshoot the new overshoot
         */
        public void setOvershoot(float overshoot) { this.overshoot = overshoot; }

        /**
         * Returns the overshoot for this EasingUtils.
         * @return this EasingUtils's overshoot
         */
        public float getOvershoot() { return overshoot; }
    }

    /** An instance of BackIn using the default overshoot. */
    public static final EasingUtils.Back BACK_IN = new EasingUtils.BackIn();

    /** Back EasingUtils in - backtracking slightly, then reversing direction and moving to target. */
    public static class BackIn extends Back {
        public BackIn() { super(); }
        public BackIn(float overshoot) { super(overshoot); }

        public float ease(float t, float b, float c, float d) {
            float s = getOvershoot();
            return c*(t/=d)*t*((s+1)*t - s) + b;
        }
    };

    /** An instance of BackOut using the default overshoot. */
    public static final EasingUtils.Back BACK_OUT = new EasingUtils.BackOut();

    /** Back EasingUtils out - moving towards target, overshooting it slightly, then reversing and coming back to target. */
    public static class BackOut extends Back {
        public BackOut() { super(); }
        public BackOut(float overshoot) { super(overshoot); }

        public float ease(float t, float b, float c, float d) {
            float s = getOvershoot();
            return c*((t=t/d-1)*t*((s+1)*t + s) + 1) + b;
        }
    }

    /** An instance of BackInOut using the default overshoot. */
    public static final EasingUtils.Back BACK_IN_OUT = new EasingUtils.BackInOut();

    /**
     * Back EasingUtils in/out - backtracking slightly, then reversing direction and moving to target,
     * then overshooting target, reversing, and finally coming back to target.
     */
    public static class BackInOut extends Back {
        public BackInOut() { super(); }
        public BackInOut(float overshoot) { super(overshoot); }

        public float ease(float t, float b, float c, float d) {
            float s = getOvershoot();
            if ((t/=d/2) < 1) return c/2*(t*t*(((s*=(1.525))+1)*t - s)) + b;
            return c/2*((t-=2)*t*(((s*=(1.525))+1)*t + s) + 2) + b;
        }
    }

    /////////// BOUNCE EasingUtils: exponentially decaying parabolic bounce  //////////////

    /** Bounce EasingUtils in. */
    public static final EasingUtils BOUNCE_IN = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            return c - EasingUtils.BOUNCE_OUT.ease(d-t, 0, c, d) + b;
        }
    };

    /** Bounce EasingUtils out. */
    public static final EasingUtils BOUNCE_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if ((t/=d) < (1/2.75f)) {
                return c*(7.5625f*t*t) + b;
            } else if (t < (2/2.75f)) {
                return c*(7.5625f*(t-=(1.5f/2.75f))*t + .75f) + b;
            } else if (t < (2.5f/2.75f)) {
                return c*(7.5625f*(t-=(2.25f/2.75f))*t + .9375f) + b;
            } else {
                return c*(7.5625f*(t-=(2.625f/2.75f))*t + .984375f) + b;
            }
        }
    };

    /** Bounce EasingUtils in/out. */
    public static final EasingUtils BOUNCE_IN_OUT = new EasingUtils() {
        public float ease(float t, float b, float c, float d) {
            if (t < d/2) return EasingUtils.BOUNCE_IN.ease(t*2, 0, c, d) * .5f + b;
            return EasingUtils.BOUNCE_OUT.ease(t*2-d, 0, c, d) * .5f + c*.5f + b;
        }
    };
}
