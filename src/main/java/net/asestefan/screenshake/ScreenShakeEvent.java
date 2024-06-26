package net.asestefan.screenshake;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/*
@Author = ASEStefan
 */
public class ScreenShakeEvent {
    @SubscribeEvent
    public void onCameraSetup(ViewportEvent.ComputeCameraAngles event) {
        Player player = Minecraft.getInstance().player;
        float delta = Minecraft.getInstance().getFrameTime();
        float ticksExistedDelta = player.tickCount + delta;
        if (player != null) {

            float shakeAmplitude = 0;
            for (ScreenShakeUtils ScreenShake : player.level.getEntitiesOfClass(ScreenShakeUtils.class, player.getBoundingBox().inflate(20, 20, 20))) {
                if (ScreenShake.distanceTo(player) < ScreenShake.getRadius()) {
                    shakeAmplitude += ScreenShake.getShakeAmount(player, delta);
                }
                if (shakeAmplitude > 1.0f) shakeAmplitude = 1.0f;
                event.setPitch((float) (event.getPitch() + shakeAmplitude * Math.cos(ticksExistedDelta * 3 + 2) * 25));
                event.setYaw((float) (event.getYaw() + shakeAmplitude * Math.cos(ticksExistedDelta * 5 + 1) * 25));
                event.setRoll((float) (event.getRoll() + shakeAmplitude * Math.cos(ticksExistedDelta * 4) * 25));
            }
        }
    }
}
