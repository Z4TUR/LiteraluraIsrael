package com.aluraisrael.Literalura.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer yearNacimiento,
        @JsonAlias("death_year") Integer yearFallecimiento
) {
}
