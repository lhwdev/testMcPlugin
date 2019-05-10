package com.lhw.bukkit.command

import com.lhw.bukkit.BukkitDslMarker
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor


fun commandHelper(builder: CommandHelperBuilder.() -> Unit): CommandHelper = CommandHelperBuilder().run {
    builder()
    build()
}


@BukkitDslMarker
class CommandHelperBuilder {
    private val commands = mutableListOf<CommandInfo>()


    fun command(label: String, helpMessage: String = "", action: CommandAction) {
        commands += CommandInfo(label, helpMessage, action)
    }

    fun build(): CommandHelper = CommandHelper(commands)
}

class CommandHelper(val commands: List<CommandInfo>) : TabExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        for(info in commands) {
            if(info.label == label)
        }

        return false
    }

    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<String>): MutableList<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}