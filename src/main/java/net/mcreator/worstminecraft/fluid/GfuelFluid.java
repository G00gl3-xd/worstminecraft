
package net.mcreator.worstminecraft.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.worstminecraft.init.WorstminecraftModItems;
import net.mcreator.worstminecraft.init.WorstminecraftModFluids;
import net.mcreator.worstminecraft.init.WorstminecraftModBlocks;

public abstract class GfuelFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(WorstminecraftModFluids.GFUEL,
			WorstminecraftModFluids.FLOWING_GFUEL,
			FluidAttributes
					.builder(new ResourceLocation("worstminecraft:blocks/still_gfuel"), new ResourceLocation("worstminecraft:blocks/flow_gfuel"))

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("worstminecraft:g_fuelopen"))))
			.explosionResistance(100f)

			.bucket(WorstminecraftModItems.GFUEL_BUCKET).block(() -> (LiquidBlock) WorstminecraftModBlocks.GFUEL.get());

	private GfuelFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends GfuelFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GfuelFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
