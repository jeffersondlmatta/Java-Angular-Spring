package br.javaAngular;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Documento API - cadastro de pessoas",
                version = "1.0",
                description = "Documentando uma API básica de gerenciamento de pessoas",
                contact = @Contact(name = "Jeff", email = "jeffersondlmatta@gmail.com", url = "https://github.com/jeffersondlmatta")
        )
)
@SpringBootApplication
public class JavaWithAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaWithAngularApplication.class, args);
    }

}
