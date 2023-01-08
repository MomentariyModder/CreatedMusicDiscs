
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftablemusicdiscs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftablemusicdiscs.item.EmptyMusicDiscItem;
import net.mcreator.craftablemusicdiscs.item.DiscFragmentItem;
import net.mcreator.craftablemusicdiscs.item.Calm4musicdiscItem;
import net.mcreator.craftablemusicdiscs.CreatedMusicDiscsMod;

public class CreatedMusicDiscsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreatedMusicDiscsMod.MODID);
	public static final RegistryObject<Item> DISC_FRAGMENT = REGISTRY.register("disc_fragment", () -> new DiscFragmentItem());
	public static final RegistryObject<Item> EMPTY_MUSIC_DISC = REGISTRY.register("empty_music_disc", () -> new EmptyMusicDiscItem());
	public static final RegistryObject<Item> CALM_4MUSICDISC = REGISTRY.register("calm_4musicdisc", () -> new Calm4musicdiscItem());
}
