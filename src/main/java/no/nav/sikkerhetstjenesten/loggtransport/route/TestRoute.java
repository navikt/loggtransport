package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer://simpleTimer?period=600000")
                .log("Hello World")
                .setBody(simple("SELECT * FROM testlogger"))
                .to("spring-jdbc:datasource")
                .log("Hello select");
    }
}
