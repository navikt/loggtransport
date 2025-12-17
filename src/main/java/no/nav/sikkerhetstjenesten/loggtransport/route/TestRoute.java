package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer://simpleTimer?period=600000")
                .log("Hello World")
                .setBody(simple("SELECT * FROM TESTLOGGER"))
                .to("spring-jdbc:default")
                .log("Message ${body}");
    }
}