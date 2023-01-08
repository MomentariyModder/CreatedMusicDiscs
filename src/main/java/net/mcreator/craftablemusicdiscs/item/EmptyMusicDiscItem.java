
package net.mcreator.craftablemusicdiscs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.craftablemusicdiscs.init.CreatedMusicDiscsModTabs;

public class EmptyMusicDiscItem extends Item {
	public EmptyMusicDiscItem() {
		super(new Item.Properties().tab(CreatedMusicDiscsModTabs.TAB_CREATED_MUSIC_DISCS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
