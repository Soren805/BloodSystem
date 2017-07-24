package fr.soren805.bloodsystem.commands;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import fr.soren805.bloodsystem.BloodSystem;

public class ListenersExec implements Listener {
	
	private BloodSystem main;
	private FileConfiguration config;
	
	public ListenersExec(BloodSystem bloodSystem){
		this.main = bloodSystem;
		this.config = main.getConfig();
	}
	
	@EventHandler
	public void onBlood(EntityDamageByEntityEvent event){
		
		Entity entity = event.getEntity();
		Location loc = entity.getLocation();
		
		if(entity.getType() != EntityType.ITEM_FRAME){
			entity.getWorld().playEffect(loc, Effect.STEP_SOUND, config.getInt("bloodsystem.blood-effect.id"));
		}
		
	}

}
