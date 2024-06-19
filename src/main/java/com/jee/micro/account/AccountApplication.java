package com.jee.micro.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition
        (
                info=@Info(
                        title = "Account Ms RestFull Apis",
                        description = "My bank accounts management REST API DOCs",
                        version = "v1",
                        contact = @Contact(
                                name = "Yassine Raddaoui",
                                email = "yassine@gmail.com",
                                url="yassine.com"
                        ),
                        license = @License(
                                name="Apache 2.0",
                                url="ejfmzaaf"
                        )
                ),
                externalDocs = @ExternalDocumentation(
                        description = "External Documentation Restfull apis Docs"
                )
        )
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
