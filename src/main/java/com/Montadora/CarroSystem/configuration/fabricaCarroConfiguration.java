package com.Montadora.CarroSystem.configuration;

import com.Montadora.CarroSystem.Motor;
import com.Montadora.CarroSystem.TipoMotorEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fabricaCarroConfiguration {

    @Bean("motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setModeloMotor("Equalit-1");
        motor.setCilindros(120);
        motor.setLitragem(2.4);
        motor.setCavalos(500);
        motor.setTipoMotor(TipoMotorEnum.ASPIRADO);
        return motor;
    }
    @Bean("motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setModeloMotor("Equalit-2");
        motor.setCilindros(120);
        motor.setLitragem(2.4);
        motor.setCavalos(500);
        motor.setTipoMotor(TipoMotorEnum.TURBO);
        return motor;
    }
    @Bean("motorEletronico")
    public Motor motorEletronico() {
        var motor = new Motor();
        motor.setModeloMotor("Equalit-3");
        motor.setCilindros(120);
        motor.setLitragem(2.4);
        motor.setCavalos(500);
        motor.setTipoMotor(TipoMotorEnum.ELETRICO);

        return motor;
    }
}
