package com.example.msalmacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients; // ✅ IMPORTANTE

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.msalmacen.client") // ✅ ACTIVA FEIGN
public class MsAlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAlmacenApplication.class, args);
	}

}
