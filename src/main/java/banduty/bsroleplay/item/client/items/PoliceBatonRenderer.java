package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.PoliceBaton;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PoliceBatonRenderer extends GeoItemRenderer<PoliceBaton> {
    public PoliceBatonRenderer() {
        super(new PoliceBatonModel());
    }
}
