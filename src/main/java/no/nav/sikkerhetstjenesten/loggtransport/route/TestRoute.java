package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TestRoute extends RouteBuilder {

    @Override
    public void configure() {
        //from("timer://simpleTimer?period=600000") // 10 minutter
        //from("quartz://myGroup/myTimerName?cron=30+6+*+*+*+?")   // DB2 06:30 eller 7?
        from("quartz://myGroup/myTimerName?cron=45+*+*+*+*+?")   // Oracle (kvart på) hver time
                .setBody(constant("Test body"))
                .log("Hello World");
    }
}