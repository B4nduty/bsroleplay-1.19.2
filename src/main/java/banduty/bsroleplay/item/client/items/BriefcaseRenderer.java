package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.BriefCase;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BriefcaseRenderer extends GeoItemRenderer<BriefCase> {
    public BriefcaseRenderer() {
        super(new BriefcaseModel());
    }
}
