package com.colbaltstudios.randcraft.item;

import com.colbaltstudios.randcraft.RandCraftMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class RubyCrustedGoldenApple extends Item {

    public RubyCrustedGoldenApple() {

        super(new Properties()
                .isImmuneToFire()
                .group(RandCraftMod.RandCraft)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(4)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.HASTE, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.LUCK, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 2400, 3), 1.0f)
                        .effect(() -> new EffectInstance(Effects.SPEED, 2400, 3), 1.0f)
                        .setAlwaysEdible()
                        .build()));

    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new StringTextComponent("You better have good teeth"));
    super.addInformation(stack, world, tooltip, flag);
    }
}
