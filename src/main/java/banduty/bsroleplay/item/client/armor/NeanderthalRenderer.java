package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.NeanderthalItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NeanderthalRenderer extends GeoArmorRenderer<NeanderthalItem> {
    public NeanderthalRenderer() {
        super(new NeanderthalModel());

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
