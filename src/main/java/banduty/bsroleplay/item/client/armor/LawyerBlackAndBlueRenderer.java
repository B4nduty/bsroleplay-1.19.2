package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.LawyerBlackAndBlueItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LawyerBlackAndBlueRenderer extends GeoArmorRenderer<LawyerBlackAndBlueItem> {
    public LawyerBlackAndBlueRenderer() {
        super(new LawyerBlackAndBlueModel());

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
