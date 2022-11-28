package net.AnimeTeddy.usworigins.enchantments;

import net.AnimeTeddy.usworigins.USWOrigins;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;

public class ModEnchantments {
    public static Enchantment FEATHERWEIGHT = register("featherweight",
            new FeatherweightEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.ARMOR, EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HEAD, EquipmentSlot.LEGS));


    private static Enchantment register(String name, Enchantment enchantment) {
        return  Registry.register(Registry.ENCHANTMENT, new Identifier(USWOrigins.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering ModEnchantments for " + USWOrigins.MOD_ID);
    }
}
