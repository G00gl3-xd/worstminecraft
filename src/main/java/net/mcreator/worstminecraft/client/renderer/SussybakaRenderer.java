
package net.mcreator.worstminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.worstminecraft.entity.SussybakaEntity;

public class SussybakaRenderer extends HumanoidMobRenderer<SussybakaEntity, HumanoidModel<SussybakaEntity>> {
	public SussybakaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(SussybakaEntity entity) {
		return new ResourceLocation("worstminecraft:textures/2022_06_27_light-yellow-among-us-20487916.png");
	}
}
