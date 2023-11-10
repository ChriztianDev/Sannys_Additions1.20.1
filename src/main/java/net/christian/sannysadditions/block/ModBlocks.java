package net.christian.sannysadditions.block;

import net.christian.sannysadditions.Item.ModItems;
import net.christian.sannysadditions.SannysAdditions;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SannysAdditions.MOD_ID);

    public static final RegistryObject<Block> PURPANITE_BLOCK = registerBlock("purpanite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_PURPANITE_BLOCK = registerBlock("raw_purpanite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PURPANITE_ORE = registerBlock("purpanite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_PURPANITE_ORE = registerBlock("deepslate_purpanite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> NETHER_PURPANITE_ORE = registerBlock("nether_purpanite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_PURPANITE_ORE =registerBlock("end_stone_purpanite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
