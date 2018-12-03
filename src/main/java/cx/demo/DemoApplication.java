@SpringBootApplication
@RestController
public class LabsDemoApplication {

public static void main(String[] args) {
SpringApplication.run(LabsDemoApplication.class, args);
}

@RequestMapping("")
public String hello() {
return "Hello! Docker!";
}
}
