package mobile.website.backend.mobilesite.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentLoginRequest {
    private String userAgent;
    private String password;

    @Override
    public String toString() {
        return "AgentLoginRequest{" +
                "userAgent='" + userAgent + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
