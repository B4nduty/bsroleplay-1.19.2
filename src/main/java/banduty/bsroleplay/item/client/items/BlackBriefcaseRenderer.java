package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.BlackBriefCase;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BlackBriefcaseRenderer extends GeoItemRenderer<BlackBriefCase> {
    public BlackBriefcaseRenderer() {
        super(new BlackBriefcaseModel());
    }
}
