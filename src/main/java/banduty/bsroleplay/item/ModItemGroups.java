package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BSROLEPLAY_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(BsRolePlay.MOD_ID, "roleplay_item"), () -> new ItemStack(ModItems.ROLEPLAY_CORE));

    public static final ItemGroup BSROLEPLAY_BLOCK_GROUP = FabricItemGroupBuilder.build(
            new Identifier(BsRolePlay.MOD_ID, "roleplay_block"), () -> new ItemStack(ModItems.TINY_BANDUTY_ITEM));

    public static final ItemGroup BSROLEPLAY_ARMOR_GROUP = FabricItemGroupBuilder.build(
            new Identifier(BsRolePlay.MOD_ID, "roleplay_armor"), () -> new ItemStack(ModItems.CIVIC_CROWN));
}