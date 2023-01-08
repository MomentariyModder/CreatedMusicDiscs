
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftablemusicdiscs.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreatedMusicDiscsModTabs {
	public static CreativeModeTab TAB_CREATED_MUSIC_DISCS;

	public static void load() {
		TAB_CREATED_MUSIC_DISCS = new CreativeModeTab("tabcreated_music_discs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreatedMusicDiscsModItems.EMPTY_MUSIC_DISC.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
