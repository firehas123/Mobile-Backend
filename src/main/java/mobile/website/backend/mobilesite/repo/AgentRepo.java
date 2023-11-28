package mobile.website.backend.mobilesite.repo;

import mobile.website.backend.mobilesite.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepo extends JpaRepository<Agent,Long> {
    Agent findAgentByUserName(String userName);
}
