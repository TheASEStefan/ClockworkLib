package net.asestefan.utils;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

/*
@Author = ASEStefan
 */
public class BlockSoundUtils {

    // private final SoundEvent breakSound;
    // private final SoundEvent stepSound;
    // private final SoundEvent placeSound;
    // private final SoundEvent hitSound;
    // private final SoundEvent fallSound;

    /*
    Each sound represents the certain block triggers in order, the first is the break, the second is the step and so on...
     */

    private static final float volume = 1.0F;
    private static final float pitch = 1.05F;
    private float lerpingSound = MathUtils.lerp(volume * pitch, volume + 0, volume + MathUtils.PI * 2);
    public static final SoundType EMPTY = new SoundType(volume, pitch, SoundEvents.EMPTY, SoundEvents.EMPTY, SoundEvents.EMPTY, SoundEvents.EMPTY, SoundEvents.EMPTY);


}
