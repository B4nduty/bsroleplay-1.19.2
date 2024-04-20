package banduty.bsroleplay.datagen;

import banduty.bsroleplay.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataGenerator output) {
        super(output);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(ModItems.JUDGE_HAMMER, 1)
                .pattern(" TR")
                .pattern(" ST")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('T', Items.DARK_OAK_PLANKS)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE),
                        RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_PLANKS),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.JUDGE_HAMMER)));

        ShapedRecipeJsonBuilder.create(ModItems.POLICE_BATON, 1)
                .pattern("  B")
                .pattern(" B ")
                .pattern("R  ")
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL),
                        RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE),
                        RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.POLICE_BATON)));

        ShapedRecipeJsonBuilder.create(ModItems.POLICE_HELMET, 1)
                .pattern("BBB")
                .pattern(" RB")
                .pattern("BBB")
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.POLICE_HELMET)));

        ShapedRecipeJsonBuilder.create(ModItems.POLICE_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BRB")
                .pattern("WWW")
                .input('B', Items.BLUE_WOOL)
                .input('W', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.POLICE_BATON), RecipeProvider.conditionsFromItem(ModItems.POLICE_BATON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.POLICE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.POLICE_LEGGINGS, 1)
                .pattern("BRB")
                .pattern("B B")
                .pattern("B B")
                .input('B', Items.BLUE_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.POLICE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(ModItems.POLICE_BOOTS, 1)
                .pattern("   ")
                .pattern("L L")
                .pattern("LRL")
                .input('L', Items.LEATHER)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.POLICE_BOOTS)));

        ShapedRecipeJsonBuilder.create(ModItems.HALO, 1)
                .pattern("III")
                .pattern("IRI")
                .pattern("III")
                .input('I', Items.GOLD_INGOT)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.HALO)));

        ShapedRecipeJsonBuilder.create(ModItems.RED_PIRATE_HELMET, 1)
                .pattern(" I ")
                .pattern("IBI")
                .pattern("RRR")
                .input('I', Items.GOLD_INGOT)
                .input('B', ModItems.ROLEPLAY_CORE)
                .input('R', Items.RED_WOOL)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.RED_PIRATE_HELMET)));

        ShapedRecipeJsonBuilder.create(ModItems.RED_PIRATE_CHESTPLATE, 1)
                .pattern("RWR")
                .pattern("RCR")
                .pattern("IWI")
                .input('I', Items.GOLD_INGOT)
                .input('R', Items.RED_WOOL)
                .input('W', Items.WHITE_WOOL)
                .input('C', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.RED_PIRATE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.RED_PIRATE_LEGGINGS, 1)
                .pattern("RCR")
                .pattern("R R")
                .pattern("G G")
                .input('R', Items.RED_WOOL)
                .input('G', Items.GOLD_INGOT)
                .input('C', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.RED_PIRATE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(ModItems.BLUE_PIRATE_HELMET, 1)
                .pattern(" I ")
                .pattern("IBI")
                .pattern("RRR")
                .input('I', Items.GOLD_INGOT)
                .input('B', ModItems.ROLEPLAY_CORE)
                .input('R', Items.BLUE_WOOL)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BLUE_PIRATE_HELMET)));

        ShapedRecipeJsonBuilder.create(ModItems.BLUE_PIRATE_CHESTPLATE, 1)
                .pattern("RWR")
                .pattern("RCR")
                .pattern("IWI")
                .input('I', Items.GOLD_INGOT)
                .input('R', Items.BLUE_WOOL)
                .input('W', Items.WHITE_WOOL)
                .input('C', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BLUE_PIRATE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.BLUE_PIRATE_LEGGINGS, 1)
                .pattern("RCR")
                .pattern("R R")
                .pattern("G G")
                .input('R', Items.BLUE_WOOL)
                .input('G', Items.GOLD_INGOT)
                .input('C', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BLUE_PIRATE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(ModItems.MINI_CROWN, 1)
                .pattern("   ")
                .pattern("GRG")
                .pattern("GGG")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('G', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.MINI_CROWN)));

        ShapedRecipeJsonBuilder.create(ModItems.DREAM_MASK, 1)
                .pattern("BWB")
                .pattern("WRW")
                .pattern("BBB")
                .input('W', Items.WHITE_WOOL)
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DREAM_MASK)));

        ShapedRecipeJsonBuilder.create(ModItems.NEANDERTHAL_CHESTPLATE, 1)
                .pattern("P L")
                .pattern(" PL")
                .pattern("LLR")
                .input('P', Items.LAPIS_LAZULI)
                .input('L', Items.LEATHER)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.LAPIS_LAZULI), RecipeProvider.conditionsFromItem(Items.LAPIS_LAZULI))
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.NEANDERTHAL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.CIVIC_CROWN, 1)
                .pattern("OOO")
                .pattern("ORO")
                .pattern("OOO")
                .input('O', Items.OAK_LEAVES)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.OAK_LEAVES), RecipeProvider.conditionsFromItem(Items.OAK_LEAVES))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.CIVIC_CROWN)));

        ShapedRecipeJsonBuilder.create(ModItems.BUNNY_MASK, 1)
                .pattern("O O")
                .pattern("RDR")
                .pattern("WOW")
                .input('O', Items.PINK_WOOL)
                .input('R', Items.RED_WOOL)
                .input('W', Items.WHITE_WOOL)
                .input('D', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.PINK_WOOL), RecipeProvider.conditionsFromItem(Items.PINK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BUNNY_MASK)));

        ShapedRecipeJsonBuilder.create(ModItems.DOLOR_EN_EL_PECHO_CAROLA_MUSIC_DISC, 1)
                .pattern(" D ")
                .pattern(" R ")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('D', ModItems.DOLOR_EN_EL_PECHO_CAROLA_MUSIC_DISC)
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .criterion(RecipeProvider.hasItem(ModItems.DOLOR_EN_EL_PECHO_CAROLA_MUSIC_DISC), RecipeProvider.conditionsFromItem(ModItems.DOLOR_EN_EL_PECHO_CAROLA_MUSIC_DISC))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DOLOR_EN_EL_PECHO_CAROLA_MUSIC_DISC)));

        ShapedRecipeJsonBuilder.create(ModItems.CROWN, 1)
                .pattern("G G")
                .pattern("LME")
                .pattern("   ")
                .input('L', Items.LAPIS_LAZULI)
                .input('E', Items.EMERALD)
                .input('G', Items.GOLD_INGOT)
                .input('M', ModItems.MINI_CROWN)
                .criterion(RecipeProvider.hasItem(Items.LAPIS_LAZULI), RecipeProvider.conditionsFromItem(Items.LAPIS_LAZULI))
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.EMERALD), RecipeProvider.conditionsFromItem(Items.EMERALD))
                .criterion(RecipeProvider.hasItem(ModItems.MINI_CROWN), RecipeProvider.conditionsFromItem(ModItems.MINI_CROWN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.CROWN)));

        ShapedRecipeJsonBuilder.create(ModItems.COWBOY_HAT, 1)
                .pattern("L L")
                .pattern("BGB")
                .pattern("LRL")
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LEATHER)
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.COWBOY_HAT)));

        ShapedRecipeJsonBuilder.create(ModItems.PONCHO, 1)
                .pattern("RBR")
                .pattern("RLL")
                .pattern("L  ")
                .input('R', Items.RED_WOOL)
                .input('L', Items.LEATHER)
                .input('B', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.PONCHO)));

        ShapedRecipeJsonBuilder.create(ModItems.PROTECTION_HELMET, 1)
                .pattern("BBB")
                .pattern("BGB")
                .pattern("YRY")
                .input('B', Items.BLACK_WOOL)
                .input('Y', Items.YELLOW_WOOL)
                .input('G', Items.GLASS)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.YELLOW_WOOL), RecipeProvider.conditionsFromItem(Items.YELLOW_WOOL))
                .criterion(RecipeProvider.hasItem(Items.GLASS), RecipeProvider.conditionsFromItem(Items.GLASS))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.PROTECTION_HELMET)));

        ShapedRecipeJsonBuilder.create(ModItems.PROTECTION_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("YRI")
                .pattern("BBB")
                .input('Y', Items.YELLOW_WOOL)
                .input('B', Items.BLACK_WOOL)
                .input('I', Items.IRON_INGOT)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.YELLOW_WOOL), RecipeProvider.conditionsFromItem(Items.YELLOW_WOOL))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.PROTECTION_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.PROTECTION_LEGGINGS, 1)
                .pattern("BRB")
                .pattern("Y Y")
                .pattern("I I")
                .input('Y', Items.YELLOW_WOOL)
                .input('I', Items.IRON_INGOT)
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.YELLOW_WOOL), RecipeProvider.conditionsFromItem(Items.YELLOW_WOOL))
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.PROTECTION_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(ModItems.PROTECTION_BOOTS, 1)
                .pattern("B B")
                .pattern("GRG")
                .input('B', Items.BLACK_WOOL)
                .input('G', Items.RED_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.PROTECTION_BOOTS)));

        ShapedRecipeJsonBuilder.create(ModItems.ROLEPLAY_CORE, 2)
                .pattern("   ")
                .pattern("RGR")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .input('R', Items.REDSTONE)
                .input('G', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(Items.REDSTONE), RecipeProvider.conditionsFromItem(Items.REDSTONE))
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ROLEPLAY_CORE)));

        ShapedRecipeJsonBuilder.create(ModItems.DEALER, 1)
                .pattern("BBB")
                .pattern("WRW")
                .pattern("   ")
                .input('B', Items.BLACK_WOOL)
                .input('W', Items.WHITE_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.DEALER)));

        ShapedRecipeJsonBuilder.create(ModItems.HAPPY_PILL, 1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" P ")
                .input('W', Items.WITHER_ROSE)
                .input('P', ModItems.PILL_CORE)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE), RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .criterion(RecipeProvider.hasItem(ModItems.PILL_CORE), RecipeProvider.conditionsFromItem(ModItems.PILL_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.HAPPY_PILL)));

        ShapedRecipeJsonBuilder.create(ModItems.SAD_PILL, 1)
                .pattern("   ")
                .pattern(" N ")
                .pattern(" P ")
                .input('N', Items.NETHER_STAR)
                .input('P', ModItems.PILL_CORE)
                .criterion(RecipeProvider.hasItem(Items.NETHER_STAR), RecipeProvider.conditionsFromItem(Items.NETHER_STAR))
                .criterion(RecipeProvider.hasItem(ModItems.PILL_CORE), RecipeProvider.conditionsFromItem(ModItems.PILL_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.SAD_PILL)));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_LEGGINGS_BLACK, 1)
                .pattern("BRB")
                .pattern("B B")
                .pattern("B B")
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_leggings_black_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BOOTS_BLACK, 1)
                .pattern("   ")
                .pattern("B B")
                .pattern("BRB")
                .input('B', Items.BLACK_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_boots_black_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_LEGGINGS_PURPLE, 1)
                .pattern(" BP")
                .input('P', Items.PURPLE_DYE)
                .input('B', ModItems.LAWYER_LEGGINGS_BLACK)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_LEGGINGS_BLACK), RecipeProvider.conditionsFromItem(ModItems.LAWYER_LEGGINGS_BLACK))
                .offerTo(exporter, new Identifier("lawyer_leggings_purple_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BOOTS_PURPLE, 1)
                .pattern(" BP")
                .input('P', Items.PURPLE_DYE)
                .input('B', ModItems.LAWYER_BOOTS_BLACK)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BOOTS_BLACK), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BOOTS_BLACK))
                .offerTo(exporter, new Identifier("lawyer_boots_purple_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_LEGGINGS_PURPLE, 1)
                .pattern("BRB")
                .pattern("B B")
                .pattern("B B")
                .input('B', Items.PURPLE_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_WOOL), RecipeProvider.conditionsFromItem(Items.PURPLE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_leggings_purple_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BOOTS_PURPLE, 1)
                .pattern("   ")
                .pattern("B B")
                .pattern("BRB")
                .input('B', Items.PURPLE_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_WOOL), RecipeProvider.conditionsFromItem(Items.PURPLE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_boots_purple_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_LEGGINGS_BLACK, 1)
                .pattern(" BP")
                .input('P', Items.BLACK_DYE)
                .input('B', ModItems.LAWYER_LEGGINGS_PURPLE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_DYE), RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_LEGGINGS_PURPLE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_LEGGINGS_PURPLE))
                .offerTo(exporter, new Identifier("lawyer_leggings_black_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BOOTS_BLACK, 1)
                .pattern(" BP")
                .input('P', Items.BLACK_DYE)
                .input('B', ModItems.LAWYER_BOOTS_PURPLE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_DYE), RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BOOTS_PURPLE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BOOTS_PURPLE))
                .offerTo(exporter, new Identifier("lawyer_boots_black_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKBLUE_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BLB")
                .pattern("BRB")
                .input('B', Items.BLACK_WOOL)
                .input('L', Items.BLUE_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.BLUE_WOOL), RecipeProvider.conditionsFromItem(Items.BLUE_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_blackblue_chestplate_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKBLUE_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.BLUE_DYE)
                .input('B', ModItems.LAWYER_BLACKGOLD_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE), RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackblue_chestplate_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKBLUE_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.BLUE_DYE)
                .input('B', ModItems.LAWYER_BLACKRED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE), RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKRED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKRED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackblue_chestplate_3"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKBLUE_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.BLUE_DYE)
                .input('B', ModItems.LAWYER_PURPLERED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE), RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_PURPLERED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_PURPLERED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackblue_chestplate_4"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKGOLD_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BLB")
                .pattern("BRB")
                .input('B', Items.BLACK_WOOL)
                .input('L', Items.GOLD_INGOT)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_blackgold_chestplate_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKGOLD_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.GOLD_INGOT)
                .input('B', ModItems.LAWYER_BLACKBLUE_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackgold_chestplate_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKGOLD_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.GOLD_INGOT)
                .input('B', ModItems.LAWYER_PURPLERED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_PURPLERED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_PURPLERED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackgold_chestplate_3"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKGOLD_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.GOLD_INGOT)
                .input('B', ModItems.LAWYER_BLACKRED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKRED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKRED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackgold_chestplate_4"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKRED_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BLB")
                .pattern("BRB")
                .input('B', Items.BLACK_WOOL)
                .input('L', Items.RED_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_WOOL), RecipeProvider.conditionsFromItem(Items.BLACK_WOOL))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_blackred_chestplate_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKRED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.RED_DYE)
                .input('B', ModItems.LAWYER_BLACKBLUE_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.RED_DYE), RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackred_chestplate_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKRED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.RED_DYE)
                .input('B', ModItems.LAWYER_PURPLERED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.RED_DYE), RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_PURPLERED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_PURPLERED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackred_chestplate_3"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_BLACKRED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.RED_DYE)
                .input('B', ModItems.LAWYER_BLACKGOLD_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.RED_DYE), RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_blackred_chestplate_4"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_PURPLERED_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BLB")
                .pattern("BRB")
                .input('B', Items.PURPLE_WOOL)
                .input('L', Items.RED_WOOL)
                .input('R', ModItems.ROLEPLAY_CORE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_WOOL), RecipeProvider.conditionsFromItem(Items.PURPLE_WOOL))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier("lawyer_purplered_chestplate_1"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_PURPLERED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.PURPLE_DYE)
                .input('B', ModItems.LAWYER_BLACKBLUE_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKBLUE_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_purplered_chestplate_2"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_PURPLERED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.PURPLE_DYE)
                .input('B', ModItems.LAWYER_BLACKRED_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKRED_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKRED_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_purplered_chestplate_3"));

        ShapedRecipeJsonBuilder.create(ModItems.LAWYER_PURPLERED_CHESTPLATE, 1)
                .pattern(" BP")
                .input('P', Items.PURPLE_DYE)
                .input('B', ModItems.LAWYER_BLACKGOLD_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE), RecipeProvider.conditionsFromItem(ModItems.LAWYER_BLACKGOLD_CHESTPLATE))
                .offerTo(exporter, new Identifier("lawyer_purplered_chestplate_4"));

        ShapedRecipeJsonBuilder.create(ModItems.BRIEFCASE, 1)
                .pattern("GGG")
                .pattern("LRL")
                .pattern("LLL")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('L', Items.LEATHER)
                .input('G', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.LEATHER), RecipeProvider.conditionsFromItem(Items.LEATHER))
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT), RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BRIEFCASE)));

        ShapedRecipeJsonBuilder.create(ModItems.BLACK_BRIEFCASE, 1)
                .pattern(" BD")
                .input('B', ModItems.BRIEFCASE)
                .input('D', Items.BLACK_DYE)
                .criterion(RecipeProvider.hasItem(Items.BLACK_DYE), RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.BRIEFCASE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.BLACK_BRIEFCASE)));

        ShapedRecipeJsonBuilder.create(ModItems.VIOLET_BRIEFCASE, 1)
                .pattern(" BP")
                .input('B', ModItems.BRIEFCASE)
                .input('P', Items.PURPLE_DYE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.BRIEFCASE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.VIOLET_BRIEFCASE)));

        ShapedRecipeJsonBuilder.create(ModItems.BRIEFCASE, 1)
                .pattern(" BP")
                .input('B', ModItems.VIOLET_BRIEFCASE)
                .input('P', Items.BROWN_DYE)
                .criterion(RecipeProvider.hasItem(Items.BROWN_DYE), RecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.VIOLET_BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.VIOLET_BRIEFCASE))
                .offerTo(exporter, new Identifier("violet_briefcase_to_briefcase"));

        ShapedRecipeJsonBuilder.create(ModItems.BLACK_BRIEFCASE, 1)
                .pattern(" BP")
                .input('B', ModItems.VIOLET_BRIEFCASE)
                .input('P', Items.BLACK_DYE)
                .criterion(RecipeProvider.hasItem(Items.BROWN_DYE), RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.VIOLET_BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.VIOLET_BRIEFCASE))
                .offerTo(exporter, new Identifier("violet_briefcase_to_black_briefcase"));

        ShapedRecipeJsonBuilder.create(ModItems.BRIEFCASE, 1)
                .pattern(" BP")
                .input('B', ModItems.BLACK_BRIEFCASE)
                .input('P', Items.BROWN_DYE)
                .criterion(RecipeProvider.hasItem(Items.BROWN_DYE), RecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.BLACK_BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.BLACK_BRIEFCASE))
                .offerTo(exporter, new Identifier("black_briefcase_to_briefcase"));

        ShapedRecipeJsonBuilder.create(ModItems.VIOLET_BRIEFCASE, 1)
                .pattern(" BP")
                .input('B', ModItems.BLACK_BRIEFCASE)
                .input('P', Items.PURPLE_DYE)
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE), RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .criterion(RecipeProvider.hasItem(ModItems.BLACK_BRIEFCASE), RecipeProvider.conditionsFromItem(ModItems.BLACK_BRIEFCASE))
                .offerTo(exporter, new Identifier("black_briefcase_to_violet_briefcase"));

        ShapedRecipeJsonBuilder.create(ModItems.ROMAN_TOGA, 1)
                .pattern("D W")
                .pattern("DRD")
                .pattern("WWW")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('W', Items.WHITE_WOOL)
                .input('D', Items.RED_WOOL)
                .criterion(RecipeProvider.hasItem(Items.WHITE_WOOL), RecipeProvider.conditionsFromItem(Items.WHITE_WOOL))
                .criterion(RecipeProvider.hasItem(Items.RED_WOOL), RecipeProvider.conditionsFromItem(Items.RED_WOOL))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.ROMAN_TOGA)));

        ShapedRecipeJsonBuilder.create(ModItems.HANDCUFFS, 1)
                .pattern("III")
                .pattern("IRI")
                .pattern("III")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('I', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET), RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.HANDCUFFS)));

        ShapedRecipeJsonBuilder.create(ModItems.HANDCUFFS_KEY, 1)
                .pattern("AAR")
                .input('R', ModItems.ROLEPLAY_CORE)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD), RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(RecipeProvider.hasItem(ModItems.ROLEPLAY_CORE), RecipeProvider.conditionsFromItem(ModItems.ROLEPLAY_CORE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.HANDCUFFS_KEY)));
    }
}
