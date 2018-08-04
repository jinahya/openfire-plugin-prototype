package ${package};

import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

import java.io.File;

public class MyPlugin implements Plugin {

    @Override
    public void initializePlugin(final PluginManager pluginManager, final File pluginDirectory) {
    }

    @Override
    public void destroyPlugin() {
    }
}

