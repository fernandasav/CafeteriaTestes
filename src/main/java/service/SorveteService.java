package service;

import model.Sorvete;

public class SorveteService {
    //todo cafe é servido a no min 80 graus
    //cada vez que o cafe é aquecido aumenta em 20ºC sua temperatura
    //todo sorvete é servido a no min -20 graus

    public void esfriar(Sorvete sorvete, int temperaturaMaxima) {
        if (sorvete.isEstoque() && sorvete.getTemperaturaAtual() < temperaturaMaxima)
            sorvete.setTemperaturaAtual(sorvete.getTemperaturaAtual() - 20);
    }

    public void armazenar(Sorvete sorvete) {
        sorvete.setTemperaturaAtual(-20);

    }

    public String servir(Sorvete sorvete) {
        if (sorvete.getTemperaturaAtual() < -19) {
            return ("O sorvete precisa ser esfriado!");
        } else {
            return ("Sirva o sorvete!");

        }
    }

    public String estadoAtual(Sorvete sorvete) {
        return sorvete.toString();
    }

}