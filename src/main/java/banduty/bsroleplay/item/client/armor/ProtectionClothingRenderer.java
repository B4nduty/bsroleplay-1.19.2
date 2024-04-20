package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.ProtectionClothingItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ProtectionClothingRenderer extends GeoArmorRenderer<ProtectionClothingItem> {
    public ProtectionClothingRenderer() {
        super(new ProtectionClothingModel());

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
