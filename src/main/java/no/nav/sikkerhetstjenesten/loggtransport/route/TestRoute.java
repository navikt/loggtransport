package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("quartz://myGroup/myTestTimer?cron=*+*/10+*+*+*+?")
                .log("Hello world ${body}");
    }
}