package one.digitalinnovationone.springbootconfig.config;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("DB connection for DEV - H2 ");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection for H2_TEST - Test instance";
    } // end method

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println("DB connection for PRODUCTION - MySQL ");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection for H2_TEST - Test instance";
    } // end method

} // end class
