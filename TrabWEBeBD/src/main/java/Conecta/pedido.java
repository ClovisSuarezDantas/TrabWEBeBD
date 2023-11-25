package Conecta;

public class pedido {
	private int id;
	private String data;
	private String entrada;
	private String principal;
	private String sobremesa;

	public pedido() {
	}

	public pedido(int id, String data, String entrada, String principal, String sobremesa) {
		this.id = id;
		this.data = data;
		this.entrada = entrada;
		this.principal = principal;
		this.sobremesa = sobremesa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}
}