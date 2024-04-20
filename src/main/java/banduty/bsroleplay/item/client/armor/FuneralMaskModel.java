package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.armor.FuneralMaskItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FuneralMaskModel extends AnimatedGeoModel<FuneralMaskItem> {

    @Override
    public Identifier getModelResource(FuneralMaskItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/funeral_mask.geo.json");
    }

    @Override
    public Identifier getTextureResource(FuneralMaskItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/funeral_mask.png");
    }

    @Override
    public Identifier getAnimationResource(FuneralMaskItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/armors.animation.json");
    }
}
