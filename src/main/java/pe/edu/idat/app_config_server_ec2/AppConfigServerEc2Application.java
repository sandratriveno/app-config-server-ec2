package pe.edu.idat.app_config_server_ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class AppConfigServerEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigServerEc2Application.class, args);
	}

}
