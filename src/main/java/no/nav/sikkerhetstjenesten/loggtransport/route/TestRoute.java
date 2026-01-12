package no.nav.sikkerhetstjenesten.loggtransport.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class TestRoute extends RouteBuilder {

    @Bean(name = {"jdbcTemplate", "JdbcTemplate"})
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Override
    public void configure() {
        from("quartz://myGroup/myTestTimer?cron=*+*/10+*+*+*+?")
                .log("Hello world ${body}");
    }
}