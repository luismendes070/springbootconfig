package one.digitalinnovationone.springbootconfig;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "A seguinte varável de ambiente foi passada: "+dbEnvironmentVariable;
    }
} // end class
