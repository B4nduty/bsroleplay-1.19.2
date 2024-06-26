package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.HaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HaloModel extends AnimatedGeoModel<HaloItem> {

    @Override
    public Identifier getModelResource(HaloItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/halo.geo.json");
    }

    @Override
    public Identifier getTextureResource(HaloItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/halo.png");
    }

    @Override
    public Identifier getAnimationResource(HaloItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
