package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.CowboyItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CowboyRenderer extends GeoArmorRenderer<CowboyItem> {
    public CowboyRenderer() {
        super(new CowboyModel());

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
