//package ru.job4j.accident.config;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import javax.sql.DataSource;
//
///**
// * JdbcConfig
// *
// * @author Victor Egorov (qrioflat@gmail.com).
// * @version 0.1
// * @since 18.06.2020
// * @noinspection SpringFacetCodeInspection
// */
//@Configuration
//@PropertySource("classpath:app.properties")
//@EnableTransactionManagement
//public class JdbcConfig {
//
//    @Bean
//    public DataSource ds(@Value("${jdbc.driver}") String driver,
//                         @Value("${jdbc.url}") String url,
//                         @Value("${jdbc.username}") String username,
//                         @Value("${jdbc.password}") String password) {
//        BasicDataSource ds = new BasicDataSource();
//        ds.setDriverClassName(driver);
//        ds.setUrl(url);
//        ds.setUsername(username);
//        ds.setPassword(password);
//        return ds;
//    }
//
//    @Bean
//    public JdbcTemplate jdbc(DataSource ds) {
//        return new JdbcTemplate(ds);
//    }
//
//}
