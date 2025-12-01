package no.nav.sikkerhetstjenesten.loggtransport;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
//import org.junit.Test;

public class LoggtransportAppTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("direct:start")
                        .to("mock:result");

            }
        };
    }

    //@Test
    public void test() throws InterruptedException {
        System.out.println("running test");
        MockEndpoint resultEndpoint = context.getEndpoint("mock:result", MockEndpoint.class);
        context.createProducerTemplate().sendBody("direct:start", "Hello world");
        resultEndpoint.expectedBodiesReceived("Hello world");
    }
}
