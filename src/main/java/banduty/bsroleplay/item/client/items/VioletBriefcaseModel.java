package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.item.VioletBriefCase;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VioletBriefcaseModel extends AnimatedGeoModel<VioletBriefCase> {
    @Override
    public Identifier getModelResource(VioletBriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/briefcase.geo.json");
    }

    @Override
    public Identifier getTextureResource(VioletBriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/item/violet_briefcase.png");
    }

    @Override
    public Identifier getAnimationResource(VioletBriefCase animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
