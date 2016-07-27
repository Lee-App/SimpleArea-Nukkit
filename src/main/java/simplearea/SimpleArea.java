package simplearea;

import cn.nukkit.plugin.PluginBase;
import listener.EventListener;
import cn.nukkit.utils.Config;
import cn.nukkit.command.PluginCommand;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.Command;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.event.level.LevelLoadEvent;
import cn.nukkit.level.Level;
import cn.nukkit.event.level.LevelInitEvent;

import database.AreaProvider;
import database.world.WhiteWorldProvider;
import database.user.UserProperties;
import api.APILoader;
import database.area.AreaLoader;
import api.AreaTax;
import database.minefarm.MineFarmManager;
import database.convert.OldSimpleAreaSupport;
import database.area.AreaManager;
import database.world.WhiteWorldManager;
import database.rent.RentManager;
import database.rent.RentProvider;
import api.RentPayment;
import task.AutoSaveTask;
import database.world.WhiteWorldLoader;
import database.rent.RentLoader;
 
public class SimpleArea extends PluginBase {

	/**
	 *
	 * @var AreaProvider
	 */
	private Object areaProvider;
	/**
	 *
	 * @var WhiteWorldProvider
	 */
	private Object whiteWorldProvider;
	/**
	 *
	 * @var UserProperties
	 */
	private Object userProperties;
	/**
	 *
	 * @var AreaTax
	 */
	public Object areaTax;
	/**
	 *
	 * @var RentPayment
	 */
	public Object rentPayment;
	/**
	 *
	 * @var EventListener
	 */
	private Object eventListener;
	/**
	 *
	 * @var AreaManager
	 */
	private Object areaManager;
	/**
	 *
	 * @var WhiteWorldManager
	 */
	private Object whiteWorldManager;
	/**
	 *
	 * @var MineFarmManager
	 */
	private Object mineFarmManager;
	/**
	 *
	 * @var RentManager
	 */
	private Object rentManager;
	/**
	 *
	 * @var RentProvider
	 */
	private Object rentProvider;
	/**
	 *
	 * @var APILoader
	 */
	public Object otherApi;

	private Object m_version = 0;

	public Config messages;

	@Override
	public void onLoad() {
		this.getLogger().info(
				TextFormat.GREEN + "SimpleArea " + TextFormat.RED + " v0.0.1-Pre-Release" + TextFormat.GREEN + " is loaded!");
	}
	@Override
	public void onEnable() {
		this.getLogger().info(
				TextFormat.GREEN + "SimpleArea " + TextFormat.RED + " v0.0.1-Pre-Release" + TextFormat.GREEN + " is enabled!");
		
	}
}