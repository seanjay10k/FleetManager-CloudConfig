package com.sp.fleetmanagercloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FleetmanagerCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetmanagerCloudConfigApplication.class, args);
	}

}
