package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.GadgetArmor;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GadgetArmorModel extends AnimatedGeoModel<GadgetArmor> {

    @Override
    public Identifier getModelResource(GadgetArmor animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/gadget.geo.json");
    }

    @Override
    public Identifier getTextureResource(GadgetArmor animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/gadget.png");
    }

    @Override
    public Identifier getAnimationResource(GadgetArmor animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
