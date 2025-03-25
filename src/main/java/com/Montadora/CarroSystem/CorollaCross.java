package com.Montadora.CarroSystem;

import java.awt.*;

public class CorollaCross extends Carro {

    public CorollaCross(Motor motor) {
        super(motor);
        setModelo("Corolla");
        setMontadora(Montadora.TOYOTA);
        setColor(Color.GREEN);
    }
}
