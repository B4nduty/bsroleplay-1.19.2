package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.PoliceArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PoliceArmorRenderer extends GeoArmorRenderer<PoliceArmorItem> {
    public PoliceArmorRenderer() {
        super(new PoliceArmorModel());

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
