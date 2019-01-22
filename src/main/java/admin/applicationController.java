package admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class applicationController
{

    public static void main(String[] args){
        SpringApplication.run(applicationController.class,args);
    }
}
