package mobile.website.backend.mobilesite.service;

import mobile.website.backend.mobilesite.repo.AgentRepo;
import mobile.website.backend.mobilesite.req.AgentLoginRequest;
import mobile.website.backend.mobilesite.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {
    @Autowired
    AgentRepo agentRepo;
    @Autowired
    Utils utils;

    public boolean studentExists(AgentLoginRequest data) {
        if(!utils.isNullOrEmptyString(data.getUserAgent()))
            return agentRepo.findAgentByUserName(data.getUserAgent()).getPassword().equals(data.getPassword());
        return false;
    }
}
