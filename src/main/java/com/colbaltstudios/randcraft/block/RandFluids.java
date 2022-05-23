package com.colbaltstudios.randcraft.block;

import com.colbaltstudios.randcraft.RandCraftMod;
import com.colbaltstudios.randcraft.item.RandItems;
import com.colbaltstudios.randcraft.util.RandRegistration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

public class RandFluids {

    public static ResourceLocation TERRAWATER_STILL_RL = new ResourceLocation(RandCraftMod.MOD_ID,
            "block/terrawater_still");

    public static ResourceLocation TERRAWATER_FLOWING_RL = new ResourceLocation(RandCraftMod.MOD_ID,
            "block/terrawater_flowing");

    public static ResourceLocation TERRAWATER_OVERLAY_RL = new ResourceLocation(RandCraftMod.MOD_ID,
            "block/terrawater_overlay");


    public static final RegistryObject<FlowingFluid> TERRAWATER_FLUID
            = RandRegistration.FLUIDS.register("terrawater_fluid",
            () -> new ForgeFlowingFluid.Source(RandFluids.TERRAWATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TERRAWATER_FLOWING
            = RandRegistration.FLUIDS.register("terrawater_flowing",
            () -> new ForgeFlowingFluid.Flowing(RandFluids.TERRAWATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties TERRAWATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> TERRAWATER_FLUID.get(), () -> TERRAWATER_FLOWING.get(),
            FluidAttributes.builder(TERRAWATER_STILL_RL, TERRAWATER_FLOWING_RL)
                    .luminosity(2)
                    .sound(SoundEvents.ITEM_BUCKET_FILL_FISH, SoundEvents.ITEM_BUCKET_EMPTY_FISH)
                    .sound(SoundEvents.BLOCK_WATER_AMBIENT)
                    .density(3)
                    .overlay(TERRAWATER_OVERLAY_RL))
                    .canMultiply()
                    .block(() -> RandFluids.TERRAWATER_BLOCK.get()).bucket(() -> RandItems.TERRAWATER_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> TERRAWATER_BLOCK =
            RandRegistration.BLOCKS.register("terrawater",
                    () -> new FlowingFluidBlock(() -> RandFluids.TERRAWATER_FLUID.get(),
                            AbstractBlock.Properties.create(Material.WATER)
                            .doesNotBlockMovement().hardnessAndResistance(100f).noDrops()));

    public static void register() { }

}
