package com.Montadora.CarroSystem.configuration;

import com.Montadora.CarroSystem.Motor;
import com.Montadora.CarroSystem.TipoMotorEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setTipoMotor(TipoMotorEnum.TURBO);
        motor.setCilindros(3);
        motor.setLitragem(1.8);
        return motor;
    }

}
