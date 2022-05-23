package com.colbaltstudios.randcraft.util.setup;

import com.colbaltstudios.randcraft.RandCraftMod;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RandCraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ServerProxy implements IProxy {

    @Override
    public void register() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Cannot be run on Server!");
    }
}
