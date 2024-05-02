package net.asestefan.sound;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

import javax.swing.text.html.parser.Entity;

/**
 * @Author = ASEStefan
 * @param <T>
 */
public interface SyncSound<T extends LivingEntity> {
    default void animSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch) {
        level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch);
    }

    default void eventSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch) {
        level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch);
    }

    default void itemSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch) {
        level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch);
    }

    default void keyframeSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch) {
        level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch);
    }

    default void localSound(T livingEntity, Level level, SoundEvent soundEvent, SoundSource source, float volume, float pitch, boolean delay) {
        level.playLocalSound(livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), soundEvent, source, volume, pitch, delay);
    }
}
