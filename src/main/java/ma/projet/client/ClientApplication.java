package ma.projet.client;

import ma.projet.client.entities.Client;
import ma.projet.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(1L, "Rabab SELIMANI", 23.0f));
            clientRepository.save(new Client(2L, "Amal RAMI", 22.0f));
            clientRepository.save(new Client(3L, "Samir SAFI", 22.0f));
        };
    }
}
