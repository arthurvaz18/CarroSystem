package com.Montadora.CarroSystem.api;

import com.Montadora.CarroSystem.Chave;
import com.Montadora.CarroSystem.CorollaCross;
import com.Montadora.CarroSystem.Motor;
import com.Montadora.CarroSystem.StatusCarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    @Qualifier("motorTurbo")
    private Motor motor;

    @PostMapping
    public StatusCarro ligarCarro(@RequestBody Chave chave) {
        var carro = new CorollaCross(motor);
        return carro.darIngnicao(chave);
    }
}
