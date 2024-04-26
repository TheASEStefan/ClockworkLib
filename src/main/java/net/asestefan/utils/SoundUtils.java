package net.asestefan.utils;

import net.minecraft.util.RandomSource;

/*
@Author = ASEStefan
 */
public interface SoundUtils {
    default float getVolume() {
        return 1.0F;
    }

    default float getPitch(RandomSource random) {
        return (random.nextFloat() - random.nextFloat()) * 0.2F + 0.8F;
    }

    default float getSoundBoost(RandomSource random) {
        float f = this.getVolume();
        return f += random.nextFloat() * 0.05;
    }

    default float lerpedSound(float pStart, float pEnd) {
        float pDelta = this.getVolume() * 0.1F;
        return pStart + pDelta * (pEnd - pStart);
    }

    default float getNoise(float pStart, float pEnd, RandomSource random) {
        float pitchStart = (float) (this.getPitch(random) * 0.05F * MathUtils.rint(MathUtils.pow((double) MathUtils.PI, 2)));
        float volumeStart = (float) (this.getVolume() * 0.05F * MathUtils.rint(MathUtils.pow((double) MathUtils.E, 3)));

        return pitchStart + volumeStart - (pStart * pEnd);
    }
}
