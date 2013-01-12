package net.licks92.EterniaCore.Plugin;

import net.licks92.EterniaCore.EterniaLogger;

public class PluginLogger
{
	private String prefix;
	private EterniaLogger logger;
	
	public PluginLogger(String pluginName)
	{
		prefix = "[" + pluginName + "]";
		logger = new EterniaLogger();
	}
	
	public void debug(String msg)
	{
		logger.info(prefix + msg);
	}
	
	public void config(String msg)
	{
		logger.config(prefix + " " + msg);
	}

	public void fine(String msg)
	{
		logger.fine(prefix + " " + msg);
	}

	public void finer(String msg)
	{
		logger.finer(prefix + " " + msg);
	}

	public void finest(String msg)
	{
		logger.finest(prefix + " " + msg);
	}

	public void info(String msg)
	{
		logger.info(prefix + " " + msg);
	}

	public void severe(String msg)
	{
		logger.severe(prefix + " " + msg);
	}
	
	public void warning(String msg)
	{
		logger.warning(prefix + " " + msg);
	}
}
