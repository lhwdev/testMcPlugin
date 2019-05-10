package com.lhw.bukkit.command

import org.bukkit.command.Command
import org.bukkit.command.CommandSender


typealias CommandAction = (sender: CommandSender, command: Command, label: String, args: Array<String>) -> Unit