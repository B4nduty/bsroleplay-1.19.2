package banduty.bsroleplay.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    POLICE("a", 15, new int[] { 3, 8, 6, 3 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    HOLY("a", 25, new int[] { 1, 0, 0, 0 }, 19,
            SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    PIRATE("a", 7, new int[] { 2, 6, 4, 0 }, 19,
    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    KING("a", 10, new int[] { 3, 0, 0, 0 }, 19,
    SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    MINI_KING("a", 3, new int[] { 1, 0, 0, 0 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    MASK("a", 3, new int[] { 1, 0, 0, 0 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    NEANDERTHAL("a", 5, new int[] { 0, 3, 0, 0 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    PHARAOH("a", 20, new int[] { 5, 0, 0, 0 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),
    ROMAN("a", 2, new int[] { 2, 5, 0, 0 }, 19,
            SoundEvents.BLOCK_AZALEA_LEAVES_PLACE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    COWBOY("a", 3, new int[] { 3, 0, 0, 0 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE)),

    PROTECTION("a", 11, new int[] { 1, 4, 3, 2 }, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ROLEPLAY_CORE))

    ;

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{11, 16, 15, 13};
    }
}
