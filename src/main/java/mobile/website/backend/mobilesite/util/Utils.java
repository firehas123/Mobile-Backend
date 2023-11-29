package mobile.website.backend.mobilesite.util;

import org.springframework.stereotype.Component;

@Component
public class Utils {
    public boolean isNullOrEmptyString(String s){
        return s.isEmpty();
    }
}
