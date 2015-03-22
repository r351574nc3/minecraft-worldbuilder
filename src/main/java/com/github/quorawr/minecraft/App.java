package com.github.quorawr.minecraft;

import com.firebase.client.Firebase;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Hello world!
 *
 */
public class App extends JavaPlugin {
    public App() {
        final Firebase fb = new Firebase("https://worldbuilder-fb.firebaseio.com");
    }

    public void onLoad() {

    }

    public void onDisable() {

    }
    
    public void onEnable() {

    }

    public boolean onCommand(final CommandSender sender, 
    						 final Command command,
    						 final String label,
    						 final String ... args) { 
    	if (label.equalsIgnoreCase("hello")) {
    		final String message = "Some message";
    		getServer().broadcastMessage(message);
    		return true;

    	}

    	return false;


    }
}
