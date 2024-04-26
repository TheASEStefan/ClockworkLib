package net.asestefan.utils;

import net.minecraft.util.RandomSource;

/*
@Author = ASEStefan
 */
public class ParticleUtils {
    public static double getDownwardsSmallSpread(RandomSource random) {
        return -(random.nextDouble() - 0.5D) * 0.05D;
    }
    public static double getDownwardsMediumSpread(RandomSource random) {
        return -(random.nextDouble() - 0.5D) * 0.1D;
    }
    public static double getDownwardsLargeSpread(RandomSource random) {
        return -(random.nextDouble() - 0.5D) * 0.15D;
    }
    public static double getUpwardsSmallSpread(RandomSource random) {
        return getDownwardsSmallSpread(random) * (-1);
    }
    public static double getUpwardsMediumSpread(RandomSource random) {
        return getDownwardsMediumSpread(random) * (-1);
    }
    public static double getUpwardsLargeSpread(RandomSource random) {
        return getDownwardsLargeSpread(random) * (-1);
    }

    /*
    @Disclaimer = Variables used for the generation of a sphere made up of particles, whereas the "t" value represents the total speed / velocity.
                  Not recommended for usage.
     */

    public static double xSphereSpeed(double t) {
        return MathUtils.sin((float) (t / 10 * MathUtils.PI));
    }

    public static double ySphereSpeed(double t) {
        return MathUtils.sin((float) ((t % 10) * MathUtils.PI)) * MathUtils.cos((float) (t / 10 * MathUtils.PI));
    }

    public static double zSphereSpeed(double t) {
        return MathUtils.cos((float) ((t % 10) * MathUtils.PI)) * MathUtils.cos((float) (t / 10 * MathUtils.PI));
    }
}
