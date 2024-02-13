package dev.turnr.createpipes;

import com.simibubi.create.Create;

import com.tterrag.registrate.Registrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreatePipes implements ModInitializer {
	public static final String ID = "createpipes";
	public static final String NAME = "Create: More Pipes";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static final Registrate REGISTRATE = Registrate.create(ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		AllBlocks.register();
		REGISTRATE.register();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
