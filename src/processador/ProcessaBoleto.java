package processador;

import java.util.ArrayList;

import boleto.Boleto;
import fatura.Fatura;

public class ProcessaBoleto {



	public static void pagarFatura(ArrayList<Boleto> boletos , Fatura fatura) {
		int valorBoletos = 0;
		for(int i = 0; i < boletos.size(); i++) {
			valorBoletos = valorBoletos + boletos.get(i).getValor();
		}

		if(valorBoletos >= fatura.getValorTotal()) {
			fatura.setPago(true);
		}

	}
}