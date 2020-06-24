package br.com.nomadweb.restfull.service;

import br.com.nomadweb.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){

        Soldado soldado = new Soldado();

        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        soldado.setCpf(cpf);

        return soldado;

    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, Soldado soldado){

    }

    public void deleteSoldado(String cpf) {
    }
}
