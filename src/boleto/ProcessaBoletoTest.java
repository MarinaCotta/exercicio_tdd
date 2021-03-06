package boleto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fatura.Fatura;
import processador.ProcessaBoleto;

class ProcessaBoletoTest {

	private Fatura fatura;
	private ArrayList<Boleto> boletos = new ArrayList();
	private ProcessaBoleto processaBoleto;

	@BeforeEach
	public void inicializaFatura() {
		fatura = new Fatura("Marina", new Date(), 1000);
		Boleto boleto1 = new Boleto("a124af", new Date(), 100);

		boletos.add(boleto1);

		ProcessaBoleto processaBoleto = new ProcessaBoleto();
	}

	@Test
	public void testFaturaPagaError() {
		processaBoleto.pagarFatura(boletos, fatura);

		assertFalse(fatura.getPago());
	}

	@Test
	public void testFaturaPagaSucesso() {
		Boleto boleto2 = new Boleto("bq234", new Date(), 500);
		Boleto boleto3 = new Boleto("c1q23", new Date(), 400);

		boletos.add(boleto2);
		boletos.add(boleto3);

		processaBoleto.pagarFatura(boletos, fatura);

		assertTrue(fatura.getPago());
	}
}