package com.colbaltstudios.randcraft.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config {
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.DoubleValue RUBY_SWORD_MONSTER_BURN_CHANCE;

    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        rubySwordFireChance(SERVER_BUILDER, CLIENT_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }
    private static void rubySwordFireChance(ForgeConfigSpec.Builder SERVER_BUILDER,
                                   ForgeConfigSpec.Builder CLIENT_BUILDER) {
        RUBY_SWORD_MONSTER_BURN_CHANCE = CLIENT_BUILDER.comment("The chance of a Ruby Sword lighting a monster on fire. Set to 0.0 to turn off (e.g. 0.7 = 70%)")
                .defineInRange("ruby_sword_fire_chance", 0.7, 0.0, 1.0);
    }
    public static void loadConfigFile(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();

        file.load();
        config.setConfig(file);
    }
}
