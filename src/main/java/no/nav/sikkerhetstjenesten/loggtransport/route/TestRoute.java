package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class TestRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:test?period=60000")
                .log("Hello World");
    }
}
