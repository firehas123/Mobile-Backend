package mobile.website.backend.mobilesite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "mobile.website.backend.mobilesite.entity")
@ComponentScan("mobile.website.backend.mobilesite")
@EnableJpaRepositories(basePackages = "mobile.website.backend.mobilesite.repo")
public class MobileSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(MobileSiteApplication.class, args);
	}
}
