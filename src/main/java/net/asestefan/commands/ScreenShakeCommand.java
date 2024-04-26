package net.asestefan.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.asestefan.screenshake.ScreenShakeUtils;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

/*
@Author = ASEStefan
 */
public class ScreenShakeCommand {
    public static void register(CommandDispatcher<CommandSourceStack> commandDispatcher) {
        commandDispatcher.register(Commands.literal("screen").requires((permission) -> {
            return permission.hasPermission(3);
        }).then(Commands.literal("shake").executes((context -> ScreenShakeCommand.showScreenShake(context.getSource())))));
    }

    public static int showScreenShake(CommandSourceStack source) {
        ScreenShakeUtils.ScreenShake(source.getLevel(), source.getPosition(), 100, 0.45f, 25, 16);

        return 0;
    }
}
