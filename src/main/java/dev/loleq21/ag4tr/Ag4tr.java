package dev.loleq21.ag4tr;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Ag4tr implements ModInitializer {

    public static final int EFDRB_EPB = 64;
    public static final String MOD_ID = "ag4tr";
    public static final ItemGroup AG4TR_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "items")).icon(() -> new ItemStack(Ag4trContent.RHM_HELMET)).build();

    @Override
    public void onInitialize() {

        Ag4trContent.registerAg4trContent();

    }
}
