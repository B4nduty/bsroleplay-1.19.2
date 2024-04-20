package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.CrownItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrownModel extends AnimatedGeoModel<CrownItem> {

    @Override
    public Identifier getModelResource(CrownItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/crown.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrownItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/crown.png");
    }

    @Override
    public Identifier getAnimationResource(CrownItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/noanim.animation.json");
    }
}
