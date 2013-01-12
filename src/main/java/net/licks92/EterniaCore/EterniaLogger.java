package net.licks92.EterniaCore;

import java.util.logging.Logger;

import org.bukkit.Bukkit;

public class EterniaLogger
{
	private String prefix;
	private Logger logger;
	
	public EterniaLogger()
	{
		prefix = "[Eternia]";
		logger = Bukkit.getLogger();
	}
	
	public void debug(String msg)
	{
		logger.info("[Eternia Debug] " + msg);
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

