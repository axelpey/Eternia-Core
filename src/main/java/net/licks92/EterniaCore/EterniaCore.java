package net.licks92.EterniaCore;

import net.licks92.EterniaCore.Plugin.PluginLogger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EterniaCore extends JavaPlugin
{
	private PluginLogger log;
	
	@Override
	public void onEnable()
	{
		//Init variables
		log = new PluginLogger("Core");
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public PluginLogger getLog()
	{
		return log;
	}
}
