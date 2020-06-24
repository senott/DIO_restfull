package br.com.nomadweb.restfull.controller;

import br.com.nomadweb.restfull.dto.Soldado;
import br.com.nomadweb.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private final SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable String cpf){

        Soldado soldado = soldadoService.buscarSoldado(cpf);

        return ResponseEntity.ok(soldado);
    }

    @PostMapping
    public ResponseEntity<Soldado> criarSoldado(@RequestBody Soldado soldado){

        soldadoService.criarSoldado(soldado);

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @PutMapping("/{cpf}")
    public ResponseEntity updateSoldado(@PathVariable String cpf,
                                        @RequestBody Soldado soldado){

        soldadoService.alterarSoldado(cpf, soldado);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarSoldado(@PathVariable String cpf){

        soldadoService.deleteSoldado(cpf);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
