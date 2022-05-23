package com.colbaltstudios.randcraft.events;

import com.colbaltstudios.randcraft.item.RandItems;
import com.colbaltstudios.randcraft.util.Config;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Collection;

public class RandEvents {

    @SubscribeEvent
    public void lightFire(AttackEntityEvent event) {

        if(event.getPlayer().getHeldItemMainhand().getItem() == RandItems.RUBY_SWORD.get()) {
            if(event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                    if(target instanceof MonsterEntity) {
                    PlayerEntity player = event.getPlayer();
                        if (Math.random() < Config.RUBY_SWORD_MONSTER_BURN_CHANCE.get()) {
                            target.setFire(5);
                    }
                }
            }
        }
    }

    public void rubyDrop(LivingDropsEvent event) {

        LivingEntity entity = event.getEntityLiving();
        if(entity instanceof MonsterEntity) {
            World world = entity.getEntityWorld();
            Collection<ItemEntity> drops = event.getDrops();
            LivingEntity target = (LivingEntity) event.getEntityLiving();
            if(entity.isBurning()) {
                if (Math.random() < 0.4) {
                    drops.add(new ItemEntity(world, entity.getPosX(), entity.getPosY(), entity.getPosZ(),
                            new ItemStack(RandItems.RUBY.get())));
                }
            }
        }
    }
}
