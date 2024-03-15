package com.r4mble.morebuckets.common;

import com.r4mble.morebuckets.MoreBuckets;
import com.r4mble.morebuckets.common.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemTabs extends CreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreBuckets.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCARY_GRANNY_MOD_TAB = MOD_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOODEN_BUCKET.get()))
                    .title(Component.translatable("itemGroup.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.WOODEN_BUCKET.get());
                        pOutput.accept(ModItems.STONE_BUCKET.get());
                        pOutput.accept(ModItems.GOLD_BUCKET.get());
                        pOutput.accept(ModItems.DIAMOND_BUCKET.get());

                    })
                    .build());

    protected ModItemTabs(Builder builder) {
        super(builder);
    }
}
