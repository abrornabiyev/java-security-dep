package pixelacademy.auth_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("home")
    public String load() {
        return "Test";
    }
}
