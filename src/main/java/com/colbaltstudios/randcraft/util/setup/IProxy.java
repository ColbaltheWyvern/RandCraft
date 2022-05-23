package com.colbaltstudios.randcraft.util.setup;

import net.minecraft.world.World;

public interface IProxy {

    void register();

    World getClientWorld();

}
