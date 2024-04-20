package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.PharaohStaff;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PharaohStaffRenderer extends GeoItemRenderer<PharaohStaff> {
    public PharaohStaffRenderer() {
        super(new PharaohStaffModel());
    }
}
