package com.formacionbdi.microservicios.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.formacionbdi.microservicios.app.commons.usuarios.models.entity"})
@SpringBootApplication
public class SpringbootServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioUsuarioApplication.class, args);
	}

}
