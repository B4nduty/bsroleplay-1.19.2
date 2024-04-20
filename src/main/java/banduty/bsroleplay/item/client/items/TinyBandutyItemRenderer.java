package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.TinyBandutyItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class TinyBandutyItemRenderer extends GeoItemRenderer<TinyBandutyItem> {
    public TinyBandutyItemRenderer() {
        super(new TinyBandutyItemModel());
    }
}
