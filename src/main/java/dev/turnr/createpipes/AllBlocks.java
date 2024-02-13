package dev.turnr.createpipes;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static dev.turnr.createpipes.CreatePipes.REGISTRATE;

import com.simibubi.create.content.fluids.PipeAttachmentModel;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlock;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class AllBlocks {

//	public static final BlockEntry<FluidPipeBlock> ANDESITE_FLUID_PIPE = REGISTRATE.block(
//					"andesite_fluid_pipe", FluidPipeBlock::new)
//			.initialProperties(SharedProperties::stone)
//			.transform(pickaxeOnly())
//			.blockstate(BlockStateGen.pipe())
//			.onRegister(CreateRegistrate.blockModel(() -> PipeAttachmentModel::new))
//			.item()
//			.transform(customItemModel())
//			.register();
//
//	public static final BlockEntry<FluidPipeBlock> IRON_FLUID_PIPE = REGISTRATE.block(
//					"iron_fluid_pipe", FluidPipeBlock::new)
//			.initialProperties((NonNullSupplier<? extends Block>) Blocks.IRON_BLOCK)
//			.transform(pickaxeOnly())
//			.blockstate(BlockStateGen.pipe())
//			.onRegister(CreateRegistrate.blockModel(() -> PipeAttachmentModel::new))
//			.item()
//			.transform(customItemModel())
//			.register();

	public static void register() {}

}
