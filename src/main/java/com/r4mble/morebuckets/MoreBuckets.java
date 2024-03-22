package com.r4mble.morebuckets;

import cech12.bucketlib.api.BucketLibApi;
import com.r4mble.morebuckets.common.ModItemTabs;
import com.r4mble.morebuckets.common.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreBuckets.MOD_ID)
public class MoreBuckets
{
    public static final String MOD_ID = "morebuckets";
    public MoreBuckets()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModRegister(modEventBus);

        modEventBus.addListener(this::sendImc);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void sendImc(InterModEnqueueEvent evt) {
        BucketLibApi.registerBucket(ModItems.WOODEN_BUCKET.getId());
        BucketLibApi.registerBucket(ModItems.STONE_BUCKET.getId());
        BucketLibApi.registerBucket(ModItems.GOLD_BUCKET.getId());
        BucketLibApi.registerBucket(ModItems.DIAMOND_BUCKET.getId());
        BucketLibApi.registerBucket(ModItems.OBSIDIAN_BUCKET.getId());

        BucketLibApi.registerBucket(ModItems.UNFIRED_CLAY_BUCKET.getId());
        BucketLibApi.registerBucket(ModItems.CERAMIC_BUCKET.getId());
    }

    private void ModRegister(IEventBus eventBus)
    {
        ModItemTabs.MOD_TABS.register(eventBus);
        ModItems.ITEMS.register(eventBus);
    }

}
