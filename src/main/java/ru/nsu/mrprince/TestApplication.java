package ru.nsu.mrprince;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.nsu.mrprince.model.entities.Staff;
import ru.nsu.mrprince.repositories.StaffRepository;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    public CommandLineRunner test(StaffRepository repository) {
        return (args) -> {
            Staff testStaff = new Staff();
            testStaff.setAge(30);
            testStaff.setName("Гена");
            repository.save(testStaff);
        };
    }

}