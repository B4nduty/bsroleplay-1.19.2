package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.DreamMaskItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DreamMaskRenderer extends GeoArmorRenderer<DreamMaskItem> {
    public DreamMaskRenderer() {
        super(new DreamMaskModel());

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
