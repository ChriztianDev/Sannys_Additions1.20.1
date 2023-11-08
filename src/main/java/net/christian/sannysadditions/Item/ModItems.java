package net.christian.sannysadditions.Item;

import net.christian.sannysadditions.SannysAdditions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SannysAdditions.MOD_ID);

    public static final RegistryObject<Item> PURPANITE = ITEMS.register("purpanite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PURPANITE = ITEMS.register("raw_purpanite",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}