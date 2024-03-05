package com.r4mble.morebuckets.common;

import com.r4mble.morebuckets.common.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemTabs extends CreativeModeTab {
    public static final ModItemTabs MORE_BUCKETS_MOD_TAB = new ModItemTabs(CreativeModeTab.TABS.length, "mod_tab");

    public ModItemTabs(int length, String label) {
        super(length, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.WOODEN_BUCKET.get());
    }
}
