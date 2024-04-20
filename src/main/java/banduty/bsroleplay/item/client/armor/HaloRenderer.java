package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.HaloItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HaloRenderer extends GeoArmorRenderer<HaloItem> {
    public HaloRenderer() {
        super(new HaloModel());

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
