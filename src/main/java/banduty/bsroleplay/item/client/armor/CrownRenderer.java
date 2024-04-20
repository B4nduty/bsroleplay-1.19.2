package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.CrownItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CrownRenderer extends GeoArmorRenderer<CrownItem> {
    public CrownRenderer() {
        super(new CrownModel());

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
