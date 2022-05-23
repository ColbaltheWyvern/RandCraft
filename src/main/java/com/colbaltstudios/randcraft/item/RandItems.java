package com.colbaltstudios.randcraft.item;

import com.colbaltstudios.randcraft.RandCraftMod;
import com.colbaltstudios.randcraft.block.RandBlocks;
import com.colbaltstudios.randcraft.block.RandFluids;
import com.colbaltstudios.randcraft.util.RandItemTiers;
import com.colbaltstudios.randcraft.util.RandRegistration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class RandItems {
    
    /* ITEMS */

    //RUBY
    public static final RegistryObject<Item> RUBY =
            RandRegistration.ITEMS.register("ruby",
            () -> new Item(new Item.Properties()
                    .isImmuneToFire()
                    .group(RandCraftMod.RandCraft)));

    //RUBY WIRE
    public static final RegistryObject<Item> RUBY_WIRE =
            RandRegistration.ITEMS.register("ruby_wire",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(RandCraftMod.RandCraft)));


    //COPPER INGOT
    public static final RegistryObject<Item> COPPER_INGOT =
            RandRegistration.ITEMS.register("copper_ingot",
                    () -> new Item(new Item.Properties().group(RandCraftMod.RandCraft)));


    //COPPER WIRE
    public static final RegistryObject<Item> COPPER_WIRE =
            RandRegistration.ITEMS.register("copper_wire",
                    () -> new Item(new Item.Properties().group(RandCraftMod.RandCraft)));


    //RUBY CRUSTED GOLDEN APPLE
    public static final RegistryObject<Item> RUBY_CRUSTED_GOLDEN_APPLE =
            RandRegistration.ITEMS.register("ruby_crusted_golden_apple",
                    () -> new RubyCrustedGoldenApple());

    //TERRA SEEDS
    public static final RegistryObject<Item> TERRA_SEEDS =
            RandRegistration.ITEMS.register("terra_seeds",
                    () -> new BlockItem(RandBlocks.TERRA_CROP.get(),
                    new Item.Properties().group(RandCraftMod.RandCraft)));

    //TERRA GEM
    public static final RegistryObject<Item> TERRA_GEM =
            RandRegistration.ITEMS.register("terra_gem",
                    () -> new Item(new Item.Properties().group(RandCraftMod.RandCraft)));

    //SYITHIAN SHARD
    public static final RegistryObject<Item> SYITHIAN_SHARD =
            RandRegistration.ITEMS.register("syithian_shard",
                    () -> new Item(new Item.Properties().group(RandCraftMod.RandCraft)));


    /* TOOLS */

    //RUBY SHOVEL
    public static final RegistryObject<Item> RUBY_SHOVEL =
            RandRegistration.ITEMS.register("ruby_shovel",
                    () -> new ShovelItem(RandItemTiers.ItemTiers.RUBY, 0, 2.3f,
                    new Item.Properties()
                            .defaultMaxDamage(20)
                            .addToolType(ToolType.SHOVEL, 5)
                            .isImmuneToFire()
                            .group(RandCraftMod.RandCraft)));

    //RUBY PICKAXE
    public static final RegistryObject<Item> RUBY_PICKAXE =
            RandRegistration.ITEMS.register("ruby_pickaxe",
                    () -> new PickaxeItem(RandItemTiers.ItemTiers.RUBY, 0, 2.5f,
                            new Item.Properties()
                                    .defaultMaxDamage(40)
                                    .addToolType(ToolType.PICKAXE, 5)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //RUBY AXE
    public static final RegistryObject<Item> RUBY_AXE =
            RandRegistration.ITEMS.register("ruby_axe",
                    () -> new PickaxeItem(RandItemTiers.ItemTiers.RUBY, 0, 2.7f,
                            new Item.Properties()
                                    .defaultMaxDamage(60)
                                    .addToolType(ToolType.AXE, 5)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //RUBY HOE
    public static final RegistryObject<Item> RUBY_HOE =
            RandRegistration.ITEMS.register("ruby_hoe",
                    () -> new HoeItem(RandItemTiers.ItemTiers.RUBY, 999999999,  50.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(999999997)
                                    .addToolType(ToolType.HOE, 10)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //COPPER SHOVEL
    public static final RegistryObject<Item> COPPER_SHOVEL =
            RandRegistration.ITEMS.register("copper_shovel",
                    () -> new ShovelItem(RandItemTiers.ItemTiers.COPPER, 0, 1.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(10)
                                    .addToolType(ToolType.SHOVEL, 3)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //COPPER PICKAXE
    public static final RegistryObject<Item> COPPER_PICKAXE =
            RandRegistration.ITEMS.register("copper_pickaxe",
                    () -> new PickaxeItem(RandItemTiers.ItemTiers.COPPER, 0, 1.6f,
                            new Item.Properties()
                                    .defaultMaxDamage(20)
                                    .addToolType(ToolType.PICKAXE, 3)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //COPPER AXE
    public static final RegistryObject<Item> COPPER_AXE =
            RandRegistration.ITEMS.register("copper_axe",
                    () -> new PickaxeItem(RandItemTiers.ItemTiers.COPPER, 0, 1.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(30)
                                    .addToolType(ToolType.AXE, 3)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //COPPER HOE
    public static final RegistryObject<Item> COPPER_HOE =
            RandRegistration.ITEMS.register("copper_hoe",
                    () -> new HoeItem(RandItemTiers.ItemTiers.COPPER, 0,  1.9f,
                            new Item.Properties()
                                    .defaultMaxDamage(15)
                                    .addToolType(ToolType.HOE, 3)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));


    /* WEAPONS */

    //RUBY SWORD
    public static final RegistryObject<Item> RUBY_SWORD =
            RandRegistration.ITEMS.register("ruby_sword",
                    () -> new SwordItem(RandItemTiers.ItemTiers.RUBY, 2, 3.5f,
                            new Item.Properties()
                                    .defaultMaxDamage(100)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //COPPER SWORD
    public static final RegistryObject<Item> COPPER_SWORD =
            RandRegistration.ITEMS.register("copper_sword",
                    () -> new SwordItem(RandItemTiers.ItemTiers.COPPER, 2, 2.3f,
                            new Item.Properties()
                                    .defaultMaxDamage(40)
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    /*RUBY STAFF
    public static final RegistryObject<Item> RUBY_STAFF =
            RandRegistration.ITEMS.register("ruby_staff",
                    () -> new Item(new Item.Properties().group(RandCraftMod.RandCraft)));

*/

    /* ARMOR */

    //RUBY HELMET
    public static final RegistryObject<Item> RUBY_HELMET =
            RandRegistration.ITEMS.register("ruby_helmet",
                    () -> new ArmorItem(RandItemTiers.ArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //RUBY CHESTPLATE
    public static final RegistryObject<Item> RUBY_CHESTPLATE =
            RandRegistration.ITEMS.register("ruby_chestplate",
                    () -> new ArmorItem(RandItemTiers.ArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //RUBY LEGGINGS
    public static final RegistryObject<Item> RUBY_LEGGINGS =
            RandRegistration.ITEMS.register("ruby_leggings",
                    () -> new ArmorItem(RandItemTiers.ArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    //RUBY BOOTS
    public static final RegistryObject<Item> RUBY_BOOTS =
            RandRegistration.ITEMS.register("ruby_boots",
                    () -> new ArmorItem(RandItemTiers.ArmorMaterial.RUBY, EquipmentSlotType.FEET,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .group(RandCraftMod.RandCraft)));

    /* MISC. */

    //TERRAWATER BUCKET
    public static final RegistryObject<Item> TERRAWATER_BUCKET =
            RandRegistration.ITEMS.register("terrawater_bucket",
                    () -> new BucketItem(RandFluids.TERRAWATER_FLUID::get,
                            new Item.Properties()
                            .isImmuneToFire()
                            .maxStackSize(1)
                            .group(RandCraftMod.RandCraft)));



    public static void register() { }

}
