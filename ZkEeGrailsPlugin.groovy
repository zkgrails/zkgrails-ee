class ZkEeGrailsPlugin {
    // the plugin version
    def version = "1.1-M1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [zk:version]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp",
        "web-app/**",
        "grails-app/i18n/messages.properties",
	"dependencies.groovy"
    ]

    // TODO Fill in these fields
    def author = "Chanwit Kaewkasi"
    def authorEmail = ""
    def title = "Enterprise Addons for ZK plugin for Grails"
    def description = '''\\
This plugin contains addition jars required for enabling ZK Enterprise features.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/zk-ee"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
