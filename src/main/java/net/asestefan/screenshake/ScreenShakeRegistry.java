package net.asestefan.screenshake;

import net.asestefan.hitbox.Hitbox;
import net.asestefan.hitbox.SpecialHitbox;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.asestefan.api.ClockworkLib;

/*
@Author = ASEStefan
 */
public class ScreenShakeRegistry {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ClockworkLib.MODID);

    // Example on how to add a custom hitbox.
    public static final SpecialHitbox SCREEN_SHAKE_HITBOX = new SpecialHitbox(1.0F, 1.0F, true, Integer.MAX_VALUE, ClockworkLib.MODID + ":screen_shake");
    public static final RegistryObject<EntityType<ScreenShakeUtils>> SCREEN_SHAKE = ENTITY_TYPES.register("screen_shake", () -> EntityType.Builder.<ScreenShakeUtils>of(ScreenShakeUtils::new, MobCategory.MISC)
            .noSummon()
            .sized(SCREEN_SHAKE_HITBOX.getWidth(), SCREEN_SHAKE_HITBOX.getHeight())
            .setUpdateInterval(SCREEN_SHAKE_HITBOX.getUpdateInterval())
            .build(SCREEN_SHAKE_HITBOX.getBuild()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
