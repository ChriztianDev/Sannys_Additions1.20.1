package net.christian.sannysadditions.Item;

import net.christian.sannysadditions.SannysAdditions;
import net.christian.sannysadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SannysAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SANNYSADDITIONS_TAB = CREATIVE_MODE_TABS.register("sannysadditions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PURPANITE.get()))
                    .title(Component.translatable("creativetab.sannysadditions_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PURPANITE.get());
                        pOutput.accept(ModItems.RAW_PURPANITE.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.PURPANITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PURPANITE_BLOCK.get());
                        pOutput.accept(ModBlocks.PURPANITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PURPANITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_PURPANITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_PURPANITE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
