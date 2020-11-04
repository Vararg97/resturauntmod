package io.mcmods.restaurantmod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Sauce extends QuickItem {
    private static int healthAmount = 0;
    private static float saturation = 0f;
    {
        name = "Sauce";
        texture = "sauce";
        type = ItemType.HandHeld;
        type2 = "food";
    }
    public Sauce() {
        super((new Item.Properties().food( (new Food.Builder()).hunger(healthAmount).saturation(saturation).build())));
    }
}
