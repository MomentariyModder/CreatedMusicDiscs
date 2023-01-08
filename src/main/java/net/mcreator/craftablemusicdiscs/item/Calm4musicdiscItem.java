
package net.mcreator.craftablemusicdiscs.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.craftablemusicdiscs.init.CreatedMusicDiscsModTabs;

import java.util.List;

public class Calm4musicdiscItem extends RecordItem {
	public Calm4musicdiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("created_music_discs:calm4")),
				new Item.Properties().tab(CreatedMusicDiscsModTabs.TAB_CREATED_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE), 100);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal(
				"Calm4.ogg was a music file (alongside the other tracks) that was beta-tested and created by Notch himself. It consists of an up-beat"));
		list.add(Component.literal(
				"battle-like tune. A part of the song has Notch saying \"Mojang Specifications\" in a slowed-down voice. The track was released around Alpha 1.1.1 (Seecret Saturday 10)"));
		list.add(Component.literal("but it is unknown when and why it was omitted from the downloaded game files."));
	}
}
