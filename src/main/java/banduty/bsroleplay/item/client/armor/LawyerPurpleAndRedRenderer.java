package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.LawyerPurpleAndRedItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LawyerPurpleAndRedRenderer extends GeoArmorRenderer<LawyerPurpleAndRedItem> {
    public LawyerPurpleAndRedRenderer() {
        super(new LawyerPurpleAndRedModel());

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
