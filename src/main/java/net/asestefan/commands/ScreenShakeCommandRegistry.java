package net.asestefan.commands;

import net.asestefan.api.ClockworkLib;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/*
@Author = ASEStefan
 */
@Mod.EventBusSubscriber(modid = ClockworkLib.MODID)
public class ScreenShakeCommandRegistry {
    @SubscribeEvent
    public static void Command(RegisterCommandsEvent event) {
        ScreenShakeCommand.register(event.getDispatcher());
    }
}
