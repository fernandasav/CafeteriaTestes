package service;

import model.Cafe;

public class CafeService {
    //é uma cafeteria então quero fazer cappuccino
    //todo cafe é servido a no min 80 graus
    //cada vez que o cafe é aquecido aumenta em 20ºC sua temperatura
    //todo sorvete é servido a -20 graus

    public void aquecer(Cafe cafe, int temperaturaMaxima) {
        if (cafe.isEstoque() && cafe.getTemperaturaAtual() < temperaturaMaxima)
            cafe.setTemperaturaAtual(cafe.getTemperaturaAtual() + 20);
    }

    public void engarrafar(Cafe cafe) {
        cafe.setTemperaturaAtual(80);

    }

    public String servir(Cafe cafe) {
        if (cafe.getTemperaturaAtual() > 79) {
            return ("O café precisa ser aquecido!");
        } else {
            return ("Sirva o café!");

        }
    }

    public void adicionarAcompanhamento (Cafe cafe) throws IllegalArgumentException {
        if (cafe.getAcompanhamento() == null) {
            throw new IllegalArgumentException("Informe o acompanhamento, por favor");
        }
    }

    public String estadoAtual(Cafe cafe) {
        return cafe.toString();
    }

}