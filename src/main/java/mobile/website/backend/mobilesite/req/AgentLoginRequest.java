package mobile.website.backend.mobilesite.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentLoginRequest {
    private String UserAgent;
    private String password;

    public String getUserAgent() {
        return UserAgent;
    }

    public String getPassword() {
        return password;
    }
}
