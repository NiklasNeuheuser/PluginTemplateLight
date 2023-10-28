package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {

	/**
	 * Automaticaly performs login  Once when the plugin starts
	 */


	@Override
	protected void onPluginStart() {
		int bla = 4;
		int bli = 5;
		int ble = 7;
		int i = 0;
		do {
			i++;
			if (i % 2 == 1) {
				System.out.println("gerade" + i);
			} else {
				System.out.println("ungerade" + i);
			}
		} while (i != 10);
		for (int g = 5; g != 10; g++)
			System.out.println(g);

		int[] zahlen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

		for (int zahl : zahlen)
			System.out.println("zahlenlist:" + zahl);
	}




	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.PIG)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 16);
	}
}
