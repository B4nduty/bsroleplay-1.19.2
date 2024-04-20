package banduty.bsroleplay;

import banduty.bsroleplay.config.ModConfigs;
import banduty.bsroleplay.item.ModItems;
import banduty.bsroleplay.sound.ModSounds;
import banduty.bsroleplay.util.ModLootTableModifiers;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class BsRolePlay implements ModInitializer {
	public static final String MOD_ID = "bsroleplay";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ModConfigs CONFIG;

	@Override
	public void onInitialize() {
		AutoConfig.register(ModConfigs.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(ModConfigs.class).getConfig();

		ModItems.registerModItems();

		ModSounds.registerSounds();

		GeckoLib.initialize();

		ModLootTableModifiers.modifyLootTables();
	}
}