package net.licks92.EterniaCore.Plugin;

import net.licks92.EterniaCore.EterniaCore;

import org.bukkit.plugin.java.JavaPlugin;

public class EterniaPlugin extends JavaPlugin
{
	protected EterniaCore core;
	protected PluginLogger log;
	
	protected boolean linkToCore(String pluginName)
	{
		core = (EterniaCore) this.getServer().getPluginManager().getPlugin("EterniaCore");
		log = new PluginLogger(pluginName);
		
		return true;
	}
}
