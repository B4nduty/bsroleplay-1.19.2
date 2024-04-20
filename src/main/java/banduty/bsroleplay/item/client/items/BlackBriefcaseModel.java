package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.item.BlackBriefCase;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackBriefcaseModel extends AnimatedGeoModel<BlackBriefCase> {
    @Override
    public Identifier getModelResource(BlackBriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/briefcase.geo.json");
    }

    @Override
    public Identifier getTextureResource(BlackBriefCase object) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/item/black_briefcase.png");
    }

    @Override
    public Identifier getAnimationResource(BlackBriefCase animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/armors.animation.json");
    }
}
