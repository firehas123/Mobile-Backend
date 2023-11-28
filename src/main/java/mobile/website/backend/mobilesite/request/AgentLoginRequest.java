package mobile.website.backend.mobilesite.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentLoginRequest {
    private String username;
    private String password;
}
