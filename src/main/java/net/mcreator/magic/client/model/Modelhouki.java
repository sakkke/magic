package net.mcreator.magic.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhouki<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("magic", "modelhouki"), "main");
	public final ModelPart bb_main;

	public Modelhouki(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -8.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -6.0F, 2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 19)
						.addBox(-2.0F, -5.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 19).addBox(-2.0F, -6.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 12)
						.addBox(-2.0F, -4.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 6).addBox(-2.0F, -6.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-1.0F, -6.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 5).addBox(0.0F, -6.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 19)
						.addBox(1.0F, -6.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 11).addBox(1.0F, -4.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 10)
						.addBox(1.0F, -5.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 4).addBox(0.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 13)
						.addBox(-2.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 3).addBox(-1.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 19)
						.addBox(1.0F, -7.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 19).addBox(1.0F, -3.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 19)
						.addBox(1.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 19).addBox(1.0F, -2.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 19)
						.addBox(1.0F, -2.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(1.0F, -2.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(1.0F, -3.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 17).addBox(1.0F, -3.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
						.addBox(1.0F, -4.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 18).addBox(1.0F, -4.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 15)
						.addBox(1.0F, -5.0F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 14).addBox(1.0F, -7.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 18)
						.addBox(1.0F, -8.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 13).addBox(1.0F, -8.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(1.0F, -8.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 18).addBox(1.0F, -7.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 8)
						.addBox(1.0F, -7.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 18).addBox(1.0F, -6.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 7)
						.addBox(1.0F, -6.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 6).addBox(1.0F, -5.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 18)
						.addBox(1.0F, -5.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 5).addBox(1.0F, -6.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 4)
						.addBox(1.0F, -6.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 18).addBox(1.0F, -7.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
						.addBox(1.0F, -7.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 2).addBox(1.0F, -7.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 18)
						.addBox(1.0F, -6.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 1).addBox(1.0F, -6.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(1.0F, -5.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(1.0F, -5.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 17)
						.addBox(1.0F, -6.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 17).addBox(1.0F, -6.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 12)
						.addBox(1.0F, -6.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 17).addBox(1.0F, -5.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 11)
						.addBox(1.0F, -5.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 10).addBox(1.0F, -4.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 17)
						.addBox(1.0F, -4.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17).addBox(1.0F, -5.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(1.0F, -5.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 17).addBox(1.0F, -5.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 17)
						.addBox(1.0F, -4.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(1.0F, -4.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(1.0F, -3.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 15).addBox(1.0F, -3.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(1.0F, -3.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 16).addBox(1.0F, -4.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 13)
						.addBox(1.0F, -4.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 16).addBox(1.0F, -4.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 16)
						.addBox(-2.0F, -4.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 8).addBox(-2.0F, -4.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 16)
						.addBox(-2.0F, -4.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-2.0F, -3.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
						.addBox(-2.0F, -3.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 16).addBox(-2.0F, -3.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 5)
						.addBox(-2.0F, -4.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 4).addBox(-2.0F, -4.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 16)
						.addBox(-2.0F, -5.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 3).addBox(-2.0F, -5.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 2)
						.addBox(-2.0F, -5.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 16).addBox(-2.0F, -4.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 1)
						.addBox(-2.0F, -4.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(-2.0F, -5.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.0F, -5.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 15).addBox(-2.0F, -6.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 12)
						.addBox(-2.0F, -6.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 15).addBox(-2.0F, -6.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 11)
						.addBox(-2.0F, -5.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 10).addBox(-2.0F, -5.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 15)
						.addBox(-2.0F, -6.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 15).addBox(-2.0F, -6.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 15)
						.addBox(-2.0F, -7.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 15).addBox(-2.0F, -7.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 15)
						.addBox(-2.0F, -7.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-2.0F, -6.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-2.0F, -6.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 13).addBox(-2.0F, -5.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-2.0F, -5.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14).addBox(-2.0F, -6.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(-2.0F, -6.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 14).addBox(-2.0F, -7.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-2.0F, -7.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 6).addBox(-2.0F, -8.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(-2.0F, -8.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 14).addBox(-2.0F, -8.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 14)
						.addBox(-2.0F, -7.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-2.0F, -5.0F, 12.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 12)
						.addBox(-2.0F, -4.0F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 13).addBox(-2.0F, -4.0F, 10.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-2.0F, -3.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 13).addBox(-2.0F, -3.0F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-2.0F, -2.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 13).addBox(-2.0F, -2.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(-2.0F, -2.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-2.0F, -3.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 12)
						.addBox(-2.0F, -3.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 12).addBox(-2.0F, -7.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 2)
						.addBox(-2.0F, -7.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 13).addBox(0.0F, -7.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 1)
						.addBox(-1.0F, -7.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 0).addBox(-2.0F, -7.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-1.0F, -7.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 12).addBox(0.0F, -7.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(-2.0F, -8.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 12).addBox(-1.0F, -8.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 12)
						.addBox(0.0F, -8.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 12).addBox(0.0F, -8.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(-1.0F, -8.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 12).addBox(-2.0F, -8.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(0.0F, -8.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 11).addBox(-1.0F, -8.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 9)
						.addBox(-2.0F, -8.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 8).addBox(0.0F, -7.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-1.0F, -7.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 7).addBox(-2.0F, -7.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 6)
						.addBox(0.0F, -7.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 11).addBox(-1.0F, -7.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-2.0F, -7.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(0.0F, -6.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 11)
						.addBox(-1.0F, -6.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 3).addBox(-2.0F, -6.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 2)
						.addBox(0.0F, -6.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 11).addBox(-1.0F, -6.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 1)
						.addBox(-2.0F, -6.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0).addBox(0.0F, -5.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-1.0F, -5.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(-2.0F, -5.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 9)
						.addBox(0.0F, -4.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 9).addBox(-1.0F, -4.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-2.0F, -4.0F, 12.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 8).addBox(0.0F, -3.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 8)
						.addBox(-1.0F, -3.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 8).addBox(-2.0F, -3.0F, 11.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -3.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 7).addBox(-1.0F, -3.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(-2.0F, -3.0F, 10.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 2).addBox(0.0F, -2.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
						.addBox(-1.0F, -2.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 1).addBox(-2.0F, -2.0F, 9.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(0.0F, -2.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-1.0F, -2.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-2.0F, -2.0F, 8.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5).addBox(0.0F, -1.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-1.0F, -1.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 6).addBox(-2.0F, -1.0F, 7.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 3)
						.addBox(0.0F, -1.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 6).addBox(-1.0F, -1.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-2.0F, -1.0F, 6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(0.0F, -1.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
						.addBox(-1.0F, -1.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 5).addBox(-2.0F, -1.0F, 5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 1)
						.addBox(0.0F, -2.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-2.0F, -2.0F, 4.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(0.0F, -2.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-1.0F, -2.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-2.0F, -2.0F, 3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 3).addBox(-1.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-2.0F, -3.0F, 2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).addBox(0.0F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 21)
						.addBox(-1.0F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 21).addBox(-2.0F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
						.addBox(-1.0F, -8.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 12).addBox(0.0F, -8.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 21)
						.addBox(-2.0F, -8.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 11).addBox(-2.0F, -8.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 21)
						.addBox(-1.0F, -8.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 21).addBox(0.0F, -8.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 21)
						.addBox(-1.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 21).addBox(-2.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 21)
						.addBox(0.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-1.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 20)
						.addBox(-2.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 19).addBox(0.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 18)
						.addBox(-1.0F, -5.0F, 13.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 20).addBox(-2.0F, -5.0F, 13.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(0.0F, -5.0F, 13.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-1.0F, -4.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 15)
						.addBox(-2.0F, -4.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 14).addBox(0.0F, -4.0F, 12.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-1.0F, -3.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 8).addBox(-2.0F, -3.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(0.0F, -3.0F, 10.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 6).addBox(-1.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 5)
						.addBox(-2.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 4).addBox(0.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 3)
						.addBox(-1.0F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 2).addBox(-2.0F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 1)
						.addBox(0.0F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-1.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-2.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(0.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 25)
						.addBox(-1.0F, -5.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 25).addBox(-1.0F, -6.0F, -10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
