package fr.soren805.bloodsystem;

import org.bukkit.plugin.java.JavaPlugin;

import fr.soren805.bloodsystem.commands.ListenersExec;

public class BloodSystem extends JavaPlugin {
	
	public void onEnable(){
		saveDefaultConfig();
		System.out.println("BloodSystem > Enabled!");
		getServer().getPluginManager().registerEvents(new ListenersExec(this), this);
	}
	
	public void onDisable(){
		System.out.println("BloodSystem > Disabled!");
	}

}
