package mobile.website.backend.mobilesite.service;

import mobile.website.backend.mobilesite.repo.AgentRepo;
import mobile.website.backend.mobilesite.entity.Agent;
import mobile.website.backend.mobilesite.req.AgentLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
    @Autowired
    AgentRepo agentRepo;

    public boolean studentExists(AgentLoginRequest data) {
        //agentRepo
        return false;
    }
}
