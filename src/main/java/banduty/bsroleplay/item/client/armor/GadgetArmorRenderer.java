package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.GadgetArmor;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GadgetArmorRenderer extends GeoArmorRenderer<GadgetArmor> {
    public GadgetArmorRenderer() {
        super(new GadgetArmorModel());

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
