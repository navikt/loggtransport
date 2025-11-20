package no.nav.sikkerhetstjenesten.loggtransport;

import org.apache.camel.main.Main;

/**
 * Main class that boot the Camel application
 */
public final class LoggtransportApp {

    private LoggtransportApp() {
    }

    public static void main(String[] args) throws Exception {
        // use Camels Main class
        Main main = new Main(LoggtransportApp.class);
        // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
        main.run(args);
    }

}
