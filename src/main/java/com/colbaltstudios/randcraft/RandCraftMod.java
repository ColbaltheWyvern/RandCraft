package com.colbaltstudios.randcraft;

import com.colbaltstudios.randcraft.block.RandBlocks;
import com.colbaltstudios.randcraft.block.RandFluids;
import com.colbaltstudios.randcraft.events.RandEvents;
import com.colbaltstudios.randcraft.item.RandItems;
import com.colbaltstudios.randcraft.util.Config;
import com.colbaltstudios.randcraft.util.RandRegistration;
import com.colbaltstudios.randcraft.util.setup.ClientProxy;
import com.colbaltstudios.randcraft.util.setup.IProxy;
import com.colbaltstudios.randcraft.util.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandCraftMod.MOD_ID)
public class RandCraftMod
{
    public static final String MOD_ID = "randcraft";

    public static final ItemGroup RandCraft = new ItemGroup("randCraft") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RandBlocks.RAND_ORE.get());
        }
    };

    public static IProxy proxy;

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public RandCraftMod() {

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);

        RandRegistration.register();
        RandItems.register();
        RandBlocks.register();
        RandFluids.register();

        MinecraftForge.EVENT_BUS.register(new RandEvents());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

        proxy.register();

        Config.loadConfigFile(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("randcraft-client.toml").toString());
        Config.loadConfigFile(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("randcraft-server.toml").toString());
    }

}
