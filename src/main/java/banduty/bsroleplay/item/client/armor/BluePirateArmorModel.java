package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.BluePirateArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BluePirateArmorModel extends AnimatedGeoModel<BluePirateArmorItem> {
    @Override
    public Identifier getModelResource(BluePirateArmorItem object) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/pirate_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(BluePirateArmorItem object) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/models/armor/blue_pirate_armor.png");
    }

    @Override
    public Identifier getAnimationResource(BluePirateArmorItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
