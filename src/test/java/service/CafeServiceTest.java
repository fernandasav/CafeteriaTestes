package service;

import model.Cafe;
import org.junit.jupiter.api.Test;

import static model.Acompanhamento.PETIT;
import static org.junit.jupiter.api.Assertions.*;

public class CafeServiceTest {

    @Test
    public void aquecerAteTemperaturaMaxima() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe();
        cafe.setTemperaturaAtual(100);
        service.aquecer(cafe, 100);
        assertEquals(100, cafe.getTemperaturaAtual());
    }


    @Test
    public void engarrafarCafe() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe();
        service.engarrafar(cafe);
        assertTrue(cafe.getTemperaturaAtual() == 80);
    }

    @Test
    public void servirCafe() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe();
        service.aquecer(cafe, 90);
        service.servir(cafe);
        assertFalse(cafe.getTemperaturaAtual() > 79);
    }

    @Test
    public void naoServirCafe() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe();
        service.aquecer(cafe, 70);
        service.servir(cafe);
        assertTrue(cafe.getTemperaturaAtual() < 79);
    }


    @Test
    public void mostrarPedidoCafe() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe(PETIT, "cappuccino", 1, 0, 150, false);
        String estadoAtual = service.estadoAtual(cafe);
        String cafeString = "Cafe{acompanhamento=PETIT, tipoCafe='cappuccino', quantidade=1, temperaturaAtual=0, temperaturaMaxima=150, estoque=false}";
        assertEquals(cafeString, estadoAtual);
    }

    @Test
    public void testAdicionarAcompanhamentoComCafeSemAcompanhamento() {
        CafeService service = new CafeService();
        Cafe cafe = new Cafe(null, "cappuccino", 1, 0, 150, false);

        try {
            service.adicionarAcompanhamento(cafe);
            fail("Throws IllegalArgumentException");
        } catch (IllegalArgumentException error) {
            assertEquals("Informe o acompanhamento, por favor", error.getMessage());
        }
    }

}
