package pedropires.auth.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pedropires.auth.services.ApiService;

/**
 * ApiController (/basket)
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private final ApiService apiService;

    /**
     * Controller to prove that you are authenticated
     *
     * @return ResponseEntity with a message
     */
    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        try {
            String message = apiService.getSuccessMessage();
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

}
