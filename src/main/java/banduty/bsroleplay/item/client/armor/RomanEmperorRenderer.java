package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.RomanEmperorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RomanEmperorRenderer extends GeoArmorRenderer<RomanEmperorItem> {
    public RomanEmperorRenderer() {
        super(new RomanEmperorModel());

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
