package banduty.bsroleplay;

import banduty.bsroleplay.block.entity.ModBlockEntities;
import banduty.bsroleplay.block.entity.client.TinyBandutyRenderer;
import banduty.bsroleplay.item.ModItems;
import banduty.bsroleplay.item.client.armor.*;
import banduty.bsroleplay.item.client.items.*;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BsRolePlayClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GeoItemRenderer.registerItemRenderer(ModItems.BRIEFCASE, new BriefcaseRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.BLACK_BRIEFCASE, new BlackBriefcaseRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.VIOLET_BRIEFCASE, new VioletBriefcaseRenderer());

        GeoItemRenderer.registerItemRenderer(ModItems.HOOK, new HookRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.JUDGE_HAMMER, new JudgeHammerRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.PHARAOH_STAFF, new PharaohStaffRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.POLICE_BATON, new PoliceBatonRenderer());

        GeoItemRenderer.registerItemRenderer(ModItems.TINY_BANDUTY_ITEM, new TinyBandutyItemRenderer());
        BlockEntityRendererRegistry.register(ModBlockEntities.TINY_BANDUTY_ENTITY, TinyBandutyRenderer::new);



        GeoArmorRenderer.registerArmorRenderer(new BluePirateArmorRenderer(), ModItems.BLUE_PIRATE_LEGGINGS,
                ModItems.BLUE_PIRATE_CHESTPLATE, ModItems.BLUE_PIRATE_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new BunnyMaskRenderer(), ModItems.BUNNY_MASK);

        GeoArmorRenderer.registerArmorRenderer(new CowboyRenderer(), ModItems.COWBOY_HAT, ModItems.PONCHO);

        GeoArmorRenderer.registerArmorRenderer(new CrownRenderer(), ModItems.CROWN);

        GeoArmorRenderer.registerArmorRenderer(new DealerRenderer(), ModItems.DEALER);

        GeoArmorRenderer.registerArmorRenderer(new DreamMaskRenderer(), ModItems.DREAM_MASK);

        GeoArmorRenderer.registerArmorRenderer(new FuneralMaskRenderer(), ModItems.FUNERAL_MASK);

        GeoArmorRenderer.registerArmorRenderer(new GadgetArmorRenderer(), ModItems.GADGET_HAT);

        GeoArmorRenderer.registerArmorRenderer(new HaloRenderer(), ModItems.HALO);

        GeoArmorRenderer.registerArmorRenderer(new LawyerBlackAndBlueRenderer(), ModItems.LAWYER_BLACKBLUE_CHESTPLATE,
                ModItems.LAWYER_LEGGINGS_BLACK, ModItems.LAWYER_BOOTS_BLACK);

        GeoArmorRenderer.registerArmorRenderer(new LawyerBlackAndBlueRenderer(), ModItems.LAWYER_BLACKGOLD_CHESTPLATE);

        GeoArmorRenderer.registerArmorRenderer(new LawyerBlackAndRedRenderer(), ModItems.LAWYER_BLACKRED_CHESTPLATE);

        GeoArmorRenderer.registerArmorRenderer(new LawyerPurpleAndRedRenderer(), ModItems.LAWYER_PURPLERED_CHESTPLATE,
                ModItems.LAWYER_LEGGINGS_PURPLE, ModItems.LAWYER_BOOTS_PURPLE);

        GeoArmorRenderer.registerArmorRenderer(new MiniCrownRenderer(), ModItems.MINI_CROWN);

        GeoArmorRenderer.registerArmorRenderer(new NeanderthalRenderer(), ModItems.NEANDERTHAL_CHESTPLATE);

        GeoArmorRenderer.registerArmorRenderer(new PoliceArmorRenderer(), ModItems.POLICE_HELMET,
                ModItems.POLICE_CHESTPLATE, ModItems.POLICE_LEGGINGS, ModItems.POLICE_BOOTS);

        GeoArmorRenderer.registerArmorRenderer(new ProtectionClothingRenderer(), ModItems.PROTECTION_HELMET,
                ModItems.PROTECTION_CHESTPLATE, ModItems.PROTECTION_LEGGINGS, ModItems.PROTECTION_BOOTS);

        GeoArmorRenderer.registerArmorRenderer(new RedPirateArmorRenderer(), ModItems.RED_PIRATE_HELMET,
                ModItems.RED_PIRATE_CHESTPLATE, ModItems.RED_PIRATE_LEGGINGS);

        GeoArmorRenderer.registerArmorRenderer(new RomanEmperorRenderer(), ModItems.CIVIC_CROWN, ModItems.ROMAN_TOGA);
    }
}
