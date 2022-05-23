package com.colbaltstudios.randcraft.block;

import com.colbaltstudios.randcraft.RandCraftMod;
import com.colbaltstudios.randcraft.util.RandRegistration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.awt.*;
import java.util.function.Supplier;

public class RandBlocks {

    /* RUBY */

    //RUBY BLOCK
    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RAND ORE
    public static final RegistryObject<Block> RAND_ORE = register("rand_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).
                    hardnessAndResistance(3f, 3f).sound(SoundType.STONE).
                    harvestLevel(2).harvestTool(ToolType.PICKAXE)));

    //RUBY STAIRS
    public static final RegistryObject<Block> RUBY_STAIRS = register("ruby_stairs",
            () -> new StairsBlock(() -> RandBlocks.RUBY_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create (Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RUBY FENCE
    public static final RegistryObject<Block> RUBY_FENCE = register("ruby_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RUBY FENCE GATE
    public static final RegistryObject<Block> RUBY_FENCE_GATE = register("ruby_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RUBY PRESSURE PLATE
    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = register("ruby_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RUBY SLAB
    public static final RegistryObject<Block> RUBY_SLAB = register("ruby_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //RUBY BUTTON
    public static final RegistryObject<Block> RUBY_BUTTON = register("ruby_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    /* COPPER */

    //COPPER BLOCK
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER STAIRS
    public static final RegistryObject<Block> COPPER_STAIRS = register("copper_stairs",
            () -> new StairsBlock(() -> RandBlocks.COPPER_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create (Material.IRON).
                            hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER FENCE
    public static final RegistryObject<Block> COPPER_FENCE = register("copper_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER FENCE GATE
    public static final RegistryObject<Block> COPPER_FENCE_GATE = register("copper_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER PRESSURE PLATE
    public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = register("copper_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.create(Material.IRON).
                            hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER SLAB
    public static final RegistryObject<Block> COPPER_SLAB = register("copper_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));

    //COPPER BUTTON
    public static final RegistryObject<Block> COPPER_BUTTON = register("copper_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON).
                    hardnessAndResistance(5f, 30f).sound(SoundType.METAL)));


    /* TERRA */

    //TERRA CROP
    public static final RegistryObject<Block> TERRA_CROP = RandRegistration.BLOCKS
            .register("terra_crop", () -> new TerraCrop(AbstractBlock.Properties.from(Blocks.WHEAT)));


    /* SYITHIAN */

    //SYITHIAN ALTER
    public static final RegistryObject<Block> SYITHIAN_ALTER = RandRegistration.BLOCKS
            .register("syithian_alter", () -> new SyithianAlter(AbstractBlock.Properties.create(
                    Material.LEAVES).hardnessAndResistance(5f, 6.5f)));


    /* MISC. */

    //Red Floating Cube
    public static final RegistryObject<Block> RED_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_red", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));

    //Blue Floating Cube
    public static final RegistryObject<Block> BLUE_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_blue", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));

    //Yellow Floating Cube
    public static final RegistryObject<Block> YELLOW_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_yellow", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));

    //Green Floating Cube
    public static final RegistryObject<Block> GREEN_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_green", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));

    //White Floating Cube
    public static final RegistryObject<Block> WHITE_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_white", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));

    //Gray Floating Cube
    public static final RegistryObject<Block> GRAY_FLOATING_CUBE = RandRegistration.BLOCKS
            .register("floating_cube_gray", () -> new FloatingCube(AbstractBlock.Properties.create(
                    Material.WOOL).hardnessAndResistance(0.8f, 0.8f)));


    public static void register() { }


    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = RandRegistration.BLOCKS.register(name, block);
        RandRegistration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(RandCraftMod.RandCraft)));
        return toReturn;
    }
}
