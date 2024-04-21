package banduty.bsroleplay;

import banduty.bsroleplay.datagen.AdvancementsProvider;
import banduty.bsroleplay.datagen.ModBlockTagProvider;
import banduty.bsroleplay.datagen.ModLootTableProvider;
import banduty.bsroleplay.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BsRolePlayDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(AdvancementsProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
	}
}
