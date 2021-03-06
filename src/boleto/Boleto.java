package boleto;

import java.util.Date;

public class Boleto {
	private String uuid;
	private Date data;
	private Integer valorPago;

	public Boleto(String uuid, Date data, Integer valorPago) {
		this.uuid = uuid;
		this.data = data;
		this.valorPago = valorPago;

	}

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
	
	public Integer getValor() {
		return valorPago;
	}

	public void setValor(Integer valorPago) {
		this.valorPago = valorPago;
	}
}