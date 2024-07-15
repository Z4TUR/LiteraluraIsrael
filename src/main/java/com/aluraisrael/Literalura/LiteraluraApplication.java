package com.aluraisrael.Literalura;

import com.aluraisrael.Literalura.principal.Principal;
import com.aluraisrael.Literalura.repository.AutorRepository;
import com.aluraisrael.Literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}
		@Autowired
		private AutorRepository autorRepository;

		@Autowired
		private LibroRepository libroRepository;

		public static void main(String[] args) {
			SpringApplication.run(LiteraluraApplication.class, args);
		}

		@Override
		public void run(String... args) throws Exception {
			Principal principal = new Principal(autorRepository, libroRepository);
			principal.muestramenu();
		}


}
