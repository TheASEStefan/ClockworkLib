package net.asestefan.sound;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

/**
 * @Author = ASEStefan
 * @param <T>
 */
public interface AnimationSound<T extends LivingEntity> {
    default void animSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch) {
        level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch);
    }
}
