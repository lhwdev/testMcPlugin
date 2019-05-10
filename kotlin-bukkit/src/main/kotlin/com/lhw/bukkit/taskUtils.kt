package com.lhw.bukkit

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitTask


@Suppress("NOTHING_TO_INLINE")
inline fun JavaPlugin.post(noinline task: () -> Unit): BukkitTask = server.scheduler.runTask(this, task)

@Suppress("NOTHING_TO_INLINE")
inline fun JavaPlugin.post(delayTicks: Long, noinline task: () -> Unit): BukkitTask = server.scheduler.runTaskLater(this, task, delayTicks)

