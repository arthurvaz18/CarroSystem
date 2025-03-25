package com.Montadora.CarroSystem;

import java.awt.*;

public class Carro {
    private String modeloCarro;
    private Color colorCarro;
    private Motor motorCarro;
    private MontadoraEnum montadoraEnum;

    public Carro(Motor motorCarro) {
        this.motorCarro = motorCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public Color getColorCarro() {
        return colorCarro;
    }

    public void setColorCarro(Color colorCarro) {
        this.colorCarro = colorCarro;
    }

    public Motor getMotorCarro() {
        return motorCarro;
    }

    public void setMotorCarro(Motor motorCarro) {
        this.motorCarro = motorCarro;
    }

    public MontadoraEnum getMontadoraEnum() {
        return montadoraEnum;
    }

    public void setMontadoraEnum(MontadoraEnum montadoraEnum) {
        this.montadoraEnum = montadoraEnum;
    }

    public StatusCarro darIngnicao(Chave chave) {
        if (chave.getMontadora() != this.montadoraEnum) {
            return new StatusCarro("Chave Incorreta");
        }
        return new StatusCarro("ligou " + motorCarro);
    }
}
