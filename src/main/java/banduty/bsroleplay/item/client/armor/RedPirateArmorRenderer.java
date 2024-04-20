package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.RedPirateArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RedPirateArmorRenderer extends GeoArmorRenderer<RedPirateArmorItem> {
    public RedPirateArmorRenderer() {
        super(new RedPirateArmorModel());

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
