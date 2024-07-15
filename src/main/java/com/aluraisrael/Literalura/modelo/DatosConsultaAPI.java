package com.aluraisrael.Literalura.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class DatosConsultaAPI (
        @JsonAlias("count") Integer numeroLibros,
        @JsonAlias("next") String pagProxima,
        @JsonAlias("previous") String pagAnterior,
        @JsonAlias("results") List<DatosLibro> resultado
) {
}
