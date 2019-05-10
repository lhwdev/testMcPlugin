package com.lhw.bukkit.testPlugin

import com.lhw.bukkit.command.commandHelper
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin


class MainPlugin : JavaPlugin() {
    override fun onLoad() {

    }

    private val helper = commandHelper {
        command("meteor", helpMessage = "summon the meteor. have fun!") {

        }
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean = helper.onCommand(sender, command, label, args)
}