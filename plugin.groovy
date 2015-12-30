import actiontracker2.ActionTracker
import actiontracker2.ActionTrackerPlugin
import actiontracker2.PluginUI
import actiontracker2.TrackerLog

import static liveplugin.PluginUtil.show


def trackerLog = new TrackerLog(pluginPath + "/stats")
def tracker = new ActionTracker(trackerLog, pluginDisposable)
def plugin = new ActionTrackerPlugin(tracker, trackerLog, pluginDisposable).init()
new PluginUI(plugin).init(pluginDisposable)

if (!isIdeStartup) show("Reloaded ActionTracker II")
