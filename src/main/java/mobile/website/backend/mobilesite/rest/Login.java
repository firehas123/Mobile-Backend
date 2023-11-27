package mobile.website.backend.mobilesite.rest;

// LoginController.java

import mobile.website.backend.mobilesite.bean.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Login{

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Perform authentication logic here
        // For simplicity, let's assume username is "admin" and password is "password"
        if ("admin".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("{\"status\": \"success\", \"message\": \"Login successful\"}");
        } else {
            return ResponseEntity.status(401).body("{\"status\": \"failure\", \"message\": \"Invalid username or password\"}");
        }
    }
}

