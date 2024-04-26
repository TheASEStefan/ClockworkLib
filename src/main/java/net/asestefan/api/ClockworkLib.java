package net.asestefan.api;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.asestefan.screenshake.ScreenShakeEvent;
import net.asestefan.screenshake.ScreenShakeRegistry;
import net.asestefan.screenshake.ScreenShakeRenderer;
import org.slf4j.Logger;

/*
@Author = ASEStefan
 */

@Mod(ClockworkLib.MODID)
public class ClockworkLib {
    public static final String MODID = "clockwork";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ClockworkLib() {

        /*
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RottedConfig.DATAGEN_SPEC ,"clockworkdata.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RottedConfig.SERVER_SPEC ,"clockworkconfig.toml");
        RottedConfig.loadConfig(RottedConfig.SERVER_SPEC,
                FMLPaths.CONFIGDIR.get().resolve("clockworkconfig.toml").toString());

         */

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext context = ModLoadingContext.get();
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::commonSetup);

        // Remember to call this
        ScreenShakeRegistry.register(modEventBus);


    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

            // Remember to call this as well
            MinecraftForge.EVENT_BUS.register(new ScreenShakeEvent());
            EntityRenderers.register(ScreenShakeRegistry.SCREEN_SHAKE.get(), ScreenShakeRenderer::new);

        }
    }


    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}