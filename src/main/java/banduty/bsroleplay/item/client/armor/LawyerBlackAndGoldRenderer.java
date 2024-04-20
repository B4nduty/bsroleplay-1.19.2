package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.LawyerBlackAndGoldItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LawyerBlackAndGoldRenderer extends GeoArmorRenderer<LawyerBlackAndGoldItem> {
    public LawyerBlackAndGoldRenderer() {
        super(new LawyerBlackAndGoldModel());

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
