package ru.netology.autorizationservice.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.autorizationservice.authorities.Authorities;
import ru.netology.autorizationservice.repository.UserRepository;
import ru.netology.autorizationservice.user.User;

import java.util.Arrays;

@Configuration
public class UserConfiguration {
    @Bean
    public CommandLineRunner init(UserRepository repository) {
        return (args) -> {
            repository.save(new User("name", "password", Arrays.asList(Authorities.DELETE, Authorities.READ)));
        };
    }
}
