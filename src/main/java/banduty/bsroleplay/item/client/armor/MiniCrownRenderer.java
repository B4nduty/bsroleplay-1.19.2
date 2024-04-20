package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.MiniCrownItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MiniCrownRenderer extends GeoArmorRenderer<MiniCrownItem> {
    public MiniCrownRenderer() {
        super(new MiniCrownModel());

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
