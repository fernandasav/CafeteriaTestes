package service;

import model.Sorvete;

import org.junit.jupiter.api.Test;

import static model.Acompanhamento.PETIT;
import static org.junit.jupiter.api.Assertions.*;

public class SorveteServiceTest {

    @Test
    public void esfriarAteTemperaturaMaxima() {
        SorveteService service = new SorveteService();
        Sorvete sorvete = new Sorvete();
        sorvete.setTemperaturaAtual(-30);
        service.esfriar(sorvete, -30);
        assertEquals(-30, sorvete.getTemperaturaAtual());
    }


    @Test
    public void armazenarSorvete() {
        SorveteService service = new SorveteService();
        Sorvete sorvete = new Sorvete();
        service.armazenar(sorvete);
        assertTrue(sorvete.getTemperaturaAtual() == -20);
    }

    @Test
    public void servirSorvete() {
        SorveteService service = new SorveteService();
        Sorvete sorvete = new Sorvete();
        service.esfriar(sorvete, -5);
        service.servir(sorvete);
        assertFalse(sorvete.getTemperaturaAtual() < -19);
    }

    @Test
    public void naoServirSorvete() {
        SorveteService service = new SorveteService();
        Sorvete sorvete = new Sorvete();
        service.esfriar(sorvete, 20);
        service.servir(sorvete);
        assertTrue(sorvete.getTemperaturaAtual() > -19);
    }


    @Test
    public void mostrarPedidoSorvete() {
        SorveteService service = new SorveteService();
        Sorvete sorvete = new Sorvete(PETIT, "palito", 1, 0, -30, false);
        String estadoAtual = service.estadoAtual(sorvete);
        String sorveteString = "Sorvete{acompanhamento=PETIT, tipoSorvete='palito', quantidade=1, temperaturaAtual=0, temperaturaMaxima=-30, estoque=false}";
        assertEquals(sorveteString, estadoAtual);
    }

}