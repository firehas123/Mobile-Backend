package mobile.website.backend.mobilesite.repo;

import mobile.website.backend.mobilesite.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// AgentRepo.java
@Repository
public interface AgentRepo extends JpaRepository<Agent, Long> {

//    @Query("SELECT a FROM Agent a WHERE a.userName = :userName")
//    Agent findAgentByUserName(@Param("userName") String userName);

    Agent findAgentByUserName(String userName);
}
