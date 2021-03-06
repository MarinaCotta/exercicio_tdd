package boleto;

import java.util.Date;

public class Boleto {
	private String uuid;
	private Date data;
	private Float valorPago;

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Float getValor() {
		return valorPago;
	}
	public void setValor(Float valorPago) {
		this.valorPago = valorPago;
	}


}