package fatura;

import java.util.Date;

public class Fatura {
	private String nomeCliente;
	private Date data;
	private Integer valorTotal;

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}



}