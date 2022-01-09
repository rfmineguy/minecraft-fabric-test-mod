package net.fabricmc.example.registry;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings());

    public static void RegisterAll() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
        ExampleMod.LOGGER.info("Registered all items");
    }
}
