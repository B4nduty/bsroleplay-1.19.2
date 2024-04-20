package banduty.bsroleplay.block.entity;
import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.block.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<TinyBandutyEntity> TINY_BANDUTY_ENTITY;

    public static void registerAllBlockEntities() {
        TINY_BANDUTY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(BsRolePlay.MOD_ID, "tiny_banduty_entity"),
                FabricBlockEntityTypeBuilder.create(TinyBandutyEntity::new,
                        ModBlock.TINY_BANDUTY).build(null));
    }
}