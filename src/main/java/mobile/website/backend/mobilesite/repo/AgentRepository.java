package mobile.website.backend.mobilesite.repo;

import mobile.website.backend.mobilesite.entity.Agents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agents, Long> {
    Agents findByUsername(String username);
}
