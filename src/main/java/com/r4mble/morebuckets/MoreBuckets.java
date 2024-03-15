package com.r4mble.morebuckets;

import com.mojang.logging.LogUtils;
import com.r4mble.morebuckets.common.item.ModItems;
import de.cech12.bucketlib.api.BucketLibApi;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreBuckets.MOD_ID)
public class MoreBuckets
{
    public static final String MOD_ID = "morebuckets";
    private static final Logger LOGGER = LogUtils.getLogger();
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
    }

    private void ModRegister(IEventBus eventBus)
    {
     ModItems.ITEMS.register(eventBus);
    }

}
