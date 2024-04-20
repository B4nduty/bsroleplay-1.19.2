package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.item.BriefCase;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BriefcaseModel extends AnimatedGeoModel<BriefCase> {
    @Override
    public Identifier getModelResource(BriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/briefcase.geo.json");
    }

    @Override
    public Identifier getTextureResource(BriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/item/briefcase.png");
    }

    @Override
    public Identifier getAnimationResource(BriefCase animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
