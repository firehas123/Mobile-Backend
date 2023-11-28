package mobile.website.backend.mobilesite.rest;

import mobile.website.backend.mobilesite.request.AgentLoginRequest;
import mobile.website.backend.mobilesite.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

    @Autowired
    private AgentService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AgentLoginRequest agentLoginRequest) {
        if (userService.verifyAgentLogin(agentLoginRequest)) {
            return ResponseEntity.ok("{\"status\": \"success\", \"message\": \"Login successful\"}");
        } else {
            return ResponseEntity.status(401).body("{\"status\": \"failure\", \"message\": \"Invalid username or password\"}");
        }
    }
}
