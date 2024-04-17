package com.r4mble.morebuckets.common.item;

import cech12.bucketlib.api.item.UniversalBucketItem;
import com.r4mble.morebuckets.MoreBuckets;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBuckets.MOD_ID);

    public static final RegistryObject<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(6).upperCrackingTemperature(1000)
    ));
    public static final RegistryObject<Item> STONE_BUCKET = ITEMS.register("stone_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(10).upperCrackingTemperature(1000)
    ));
    public static final RegistryObject<Item> GOLD_BUCKET = ITEMS.register("gold_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(0)
    ));
    public static final RegistryObject<Item> DIAMOND_BUCKET = ITEMS.register("diamond_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(0)
    ));
    public static final RegistryObject<Item> OBSIDIAN_BUCKET = ITEMS.register("obsidian_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(0)
    ));

    //Unusual
    public static final RegistryObject<Item> UNFIRED_CLAY_BUCKET = ITEMS.register("unfired_clay_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(2).upperCrackingTemperature(1000).lowerCrackingTemperature(0).disableEntityObtaining().disableBlockObtaining().disableMilking()
    ));
    public static final RegistryObject<Item> CERAMIC_BUCKET = ITEMS.register("ceramic_bucket", () -> new UniversalBucketItem(
            new UniversalBucketItem.Properties().durability(0)
    ));

}
