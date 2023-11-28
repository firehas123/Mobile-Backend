package mobile.website.backend.mobilesite.rest;

import mobile.website.backend.mobilesite.req.AgentLoginRequest;
import mobile.website.backend.mobilesite.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentApi {
    @Autowired
    private AgentService agentService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AgentLoginRequest agentLoginRequest) {
        if (agentService.studentExists(agentLoginRequest)) {
            return ResponseEntity.ok("{\"status\": \"success\", \"message\": \"Login successful\"}");
        } else {
            return ResponseEntity.status(401).body("{\"status\": \"failure\", \"message\": \"Invalid username or password\"}");
        }
    }
}
