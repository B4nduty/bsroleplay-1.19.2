package banduty.bsroleplay.item.custom.armor;

import banduty.bsroleplay.BsRolePlay;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class ProtectionClothingItem extends ArmorItem implements IAnimatable {
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player && BsRolePlay.CONFIG.common.modifyProtectionSetEffects) {
            boolean wearingCorrectArmor = true;
            for (ItemStack armorStack : player.getArmorItems()) {
                if (!(armorStack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != this.getMaterial()) {
                    wearingCorrectArmor = false;
                    break;
                }
            }
            if (wearingCorrectArmor) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 40, 0,
                        false, false, false));
                player.removeStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 40, 0,
                        false, false, false).getEffectType());
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public ProtectionClothingItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {

        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle"));

        return PlayState.STOP;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}