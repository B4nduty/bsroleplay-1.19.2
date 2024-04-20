package banduty.bsroleplay.item.client.items;

import banduty.bsroleplay.item.custom.item.JudgeHammer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class JudgeHammerRenderer extends GeoItemRenderer<JudgeHammer> {
    public JudgeHammerRenderer() {
        super(new JudgeHammerModel());
    }
}
