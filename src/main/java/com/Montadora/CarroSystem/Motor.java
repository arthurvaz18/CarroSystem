package com.Montadora.CarroSystem;

public class Motor {
    private String modeloMotor;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotorEnum tipoMotor;

    public TipoMotorEnum getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotorEnum tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getModeloMotor() {
        return modeloMotor;
    }

    public void setModeloMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modeloMotor='" + modeloMotor + '\'' +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                '}';
    }
}
