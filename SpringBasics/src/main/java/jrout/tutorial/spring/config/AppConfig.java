package jrout.tutorial.spring.config;

import jrout.tutorial.spring.dao.IDVDDao;
import jrout.tutorial.spring.service.IDVDService;
import jrout.tutorial.spring.service.impl.DVDServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("jrout.tutorial.spring")
@PropertySource(value = {"classpath:application.properties"})
public class AppConfig {

    @Value("${jdbc.url}")
    private String url;

    @Autowired
    private Environment environment;

//    private final String url = "jdbc:postgresql://Jayram.local:5432/postgres";
//    private final String username = "postgres";
//    private final String password = "postgres";

    /*@Bean
    public IDVDService getServiceObject(){
        return new DVDServiceImpl();
    }*/

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
        dataSource.setUrl(url);
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
