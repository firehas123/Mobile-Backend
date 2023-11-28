package mobile.website.backend.mobilesite.repo;

import mobile.website.backend.mobilesite.entity.Agents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AgentRepository extends JpaRepository<Agents, Long> {
    Agents findByUsername(String username);
}
