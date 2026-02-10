package eci.edu.co.health_api.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String checkAPI() {
        return "<h1>The API is working ok!</h1>";
    }
}