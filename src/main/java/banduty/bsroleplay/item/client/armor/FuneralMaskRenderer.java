package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.FuneralMaskItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FuneralMaskRenderer extends GeoArmorRenderer<FuneralMaskItem> {
    public FuneralMaskRenderer() {
        super(new FuneralMaskModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
