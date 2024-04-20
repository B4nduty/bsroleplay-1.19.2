package banduty.bsroleplay.item.client.armor;

import banduty.bsroleplay.item.custom.armor.DealerItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DealerRenderer extends GeoArmorRenderer<DealerItem> {
    public DealerRenderer() {
        super(new DealerModel());

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
