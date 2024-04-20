package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.NeanderthalItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NeanderthalModel extends AnimatedGeoModel<NeanderthalItem> {

    @Override
    public Identifier getModelResource(NeanderthalItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/neanderthal.geo.json");
    }

    @Override
    public Identifier getTextureResource(NeanderthalItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/neanderthal.png");
    }

    @Override
    public Identifier getAnimationResource(NeanderthalItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
