package com.r4mble.morebuckets.common.item;

import com.r4mble.morebuckets.MoreBuckets;
import com.r4mble.morebuckets.common.ModItemTabs;
import de.cech12.bucketlib.api.item.UniversalBucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBuckets.MOD_ID);

    public static final RegistryObject<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(10).upperCrackingTemperature(1000)
    ));
    public static final RegistryObject<Item> STONE_BUCKET = ITEMS.register("stone_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(50).upperCrackingTemperature(1000)
    ));
    public static final RegistryObject<Item> GOLD_BUCKET = ITEMS.register("gold_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(100)
    ));
    public static final RegistryObject<Item> DIAMOND_BUCKET = ITEMS.register("diamond_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(250)
    ));

}
