package com.Montadora.CarroSystem;

public class Chave {
    private MontadoraEnum montadora;
    private String tipo;

    public MontadoraEnum getMontadora() {
        return montadora;
    }

    public void setMontadora(MontadoraEnum montadora) {
        this.montadora = montadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
