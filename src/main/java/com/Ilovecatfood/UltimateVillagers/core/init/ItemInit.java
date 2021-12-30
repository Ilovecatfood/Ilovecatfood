package com.Ilovecatfood.UltimateVillagers.core.init;

import com.Ilovecatfood.UltimateVillagers.UltimateVillagers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UltimateVillagers.MODID);

    public static final RegistryObject<Item> HASASHEUM_ALLOY = ITEMS.register("hasasheum_alloy",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64)));


}