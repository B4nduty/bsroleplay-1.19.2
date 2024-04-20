package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.BluePirateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BluePirateArmorRenderer extends GeoArmorRenderer<BluePirateArmorItem> {
    public BluePirateArmorRenderer() {
        super(new BluePirateArmorModel());

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
