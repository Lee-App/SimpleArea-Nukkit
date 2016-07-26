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

// @param 현재 너무 할일이 많아 주석처리 함.
/*import database.AreaProvider;
 * 	import database.area.AreaProvider;
 *  import database.world.WhiteWorldProvider;
 *	import database.user.UserProperties;
 *  import api.APILoader;
 *	import database.area.AreaLoader;
 *	import api.AreaTax;
 *	import database.minefarm.MineFarmManager;
 *	import database.convert.OldSimpleAreaSupport;
 *	import database.area.AreaManager;
 *	import database.world.WhiteWorldManager;
 *	import database.rent.RentManager;
 *	import database.rent.RentProvider;
 *	import api.RentPayment;
 *	import task.AutoSaveTask;
 *	import database.world.WhiteWorldLoader;
 *	import database.rent.RentLoader;
 
 */
public class SimpleArea extends PluginBase {

	/**
	 *
	 * @var AreaProvider
	 */
	private String areaProvider;
	/**
	 *
	 * @var WhiteWorldProvider
	 */
	private String whiteWorldProvider;
	/**
	 *
	 * @var UserProperties
	 */
	private String userProperties;
	/**
	 *
	 * @var AreaTax
	 */
	public String areaTax;
	/**
	 *
	 * @var RentPayment
	 */
	public String rentPayment;
	/**
	 *
	 * @var EventListener
	 */
	private String eventListener;
	/**
	 *
	 * @var AreaManager
	 */
	private String areaManager;
	/**
	 *
	 * @var WhiteWorldManager
	 */
	private String whiteWorldManager;
	/**
	 *
	 * @var MineFarmManager
	 */
	private String mineFarmManager;
	/**
	 *
	 * @var RentManager
	 */
	private String rentManager;
	/**
	 *
	 * @var RentProvider
	 */
	private String rentProvider;
	/**
	 *
	 * @var APILoader
	 */
	public String otherApi;

	private int m_version = 0;

	public Config messages;

}