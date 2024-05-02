package net.asestefan.proxy;

import net.asestefan.api.ClockworkLib;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

/**
 * @Author = ASEStefan
 */
@Mod.EventBusSubscriber(modid = ClockworkLib.MODID, value = Dist.CLIENT)
public class ProxyInterface<T extends Object> {
    public void playWorldSound(@Nullable T soundEmitter, byte type) {

    }

}
