package mobile.website.backend.mobilesite.service;

import mobile.website.backend.mobilesite.entity.Agents;
import mobile.website.backend.mobilesite.repo.AgentRepository;
import mobile.website.backend.mobilesite.request.AgentLoginRequest;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    AgentRepository agentRepository;


    public boolean verifyAgentLogin(AgentLoginRequest agentLoginRequest) {
        Agents user = agentRepository.findByUsername(agentLoginRequest.getUsername());
        return user != null && user.getPassword().equals(agentLoginRequest.getPassword());
    }
}
