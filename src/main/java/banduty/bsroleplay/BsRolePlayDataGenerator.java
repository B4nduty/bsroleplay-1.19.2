package banduty.bsroleplay;

import banduty.bsroleplay.datagen.AdvancementsProvider;
import banduty.bsroleplay.datagen.ModModelProvider;
import banduty.bsroleplay.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BsRolePlayDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(AdvancementsProvider::new);
	}
}
