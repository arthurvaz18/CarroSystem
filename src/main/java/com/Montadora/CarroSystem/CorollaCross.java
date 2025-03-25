package com.Montadora.CarroSystem;

import java.awt.*;

public class CorollaCross extends Carro{

    public CorollaCross(Motor motorCarro) {
        super(motorCarro);
        setColorCarro(Color.white);
        setModeloCarro("ColorollaCross");
        setMontadoraEnum(MontadoraEnum.TOYOTA);
    }
}
