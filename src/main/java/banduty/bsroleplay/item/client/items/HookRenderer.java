package banduty.bsroleplay.item.client.items;


import banduty.bsroleplay.item.custom.item.Hook;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HookRenderer extends GeoItemRenderer<Hook> {
    public HookRenderer() {
        super(new HookModel());
    }
}
