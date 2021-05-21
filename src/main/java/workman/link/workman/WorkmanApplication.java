package workman.link.workman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkmanApplication.class, args);
    }

}
