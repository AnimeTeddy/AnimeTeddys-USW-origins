package net.AnimeTeddy.usworigins;

import net.fabricmc.api.ModInitializer;
import net.AnimeTeddy.usworigins.enchantments.ModEnchantments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class USWOrigins implements ModInitializer {
	// Overflow is best Anime ever :)
	public static final Logger LOGGER = LogManager.getLogger("usworigins");
	public static final String MOD_ID = "usworigins";

	@Override
	public void onInitialize() {
		//AnimeTeddy USW-Origins

		ModEnchantments.registerModEnchantments();

		LOGGER.info("Hello Fabric world!");
	}
}
