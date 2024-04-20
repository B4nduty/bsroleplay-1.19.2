package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.item.PoliceBaton;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PoliceBatonModel extends AnimatedGeoModel<PoliceBaton> {

    @Override
    public Identifier getModelResource(PoliceBaton animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/police_baton.geo.json");
    }

    @Override
    public Identifier getTextureResource(PoliceBaton animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/item/police_baton.png");
    }

    @Override
    public Identifier getAnimationResource(PoliceBaton animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
