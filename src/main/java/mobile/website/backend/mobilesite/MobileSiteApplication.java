package mobile.website.backend.mobilesite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "mobile.website.backend.mobilesite.entity")
@ComponentScan("mobile.website.backend.mobilesite")
public class MobileSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(MobileSiteApplication.class, args);
	}
}
