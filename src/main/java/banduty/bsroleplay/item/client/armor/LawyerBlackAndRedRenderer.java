package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.LawyerBlackAndRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LawyerBlackAndRedRenderer extends GeoArmorRenderer<LawyerBlackAndRedItem> {
    public LawyerBlackAndRedRenderer() {
        super(new LawyerBlackAndRedModel());

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
