
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftablemusicdiscs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftablemusicdiscs.CreatedMusicDiscsMod;

public class CreatedMusicDiscsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreatedMusicDiscsMod.MODID);
	public static final RegistryObject<SoundEvent> CALM4 = REGISTRY.register("calm4",
			() -> new SoundEvent(new ResourceLocation("created_music_discs", "calm4")));
}
