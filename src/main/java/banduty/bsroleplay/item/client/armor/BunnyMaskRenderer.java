package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.BunnyMaskItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BunnyMaskRenderer extends GeoArmorRenderer<BunnyMaskItem> {
    public BunnyMaskRenderer() {
        super(new BunnyMaskModel());

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
