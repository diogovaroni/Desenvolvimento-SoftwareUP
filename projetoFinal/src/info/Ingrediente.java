package info;

public abstract class Ingrediente {
	private int cod;
	private String nome;
	private double qtdEmbalagem;
	private double valorEmbalagem;
	
	//método construtor da classe Ingrediente
	public Ingrediente(int cod, String nome, double qtdEmbalagem, double valorEmbaleagem) {
		setCod(cod);
		setNome(nome);
		setQtdEmbalagem(qtdEmbalagem);
		setValorEmbalagem(valorEmbalagem);
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getqtdEmbalagem() {
		return qtdEmbalagem;
	}
	public void setQtdEmbalagem(double qtdEmbalagem) {
		this.qtdEmbalagem = qtdEmbalagem;
	}
	public double getValorEmbalagem() {
		return valorEmbalagem;
	}
	public void setValorEmbalagem(double valorEmbalagem) {
		this.valorEmbalagem = valorEmbalagem;
	}
	public String toString() {
		return "Cód.: " + cod + " - Ingrediente: " + nome + " - Qtd na Emb. (Kg): " + qtdEmbalagem + " - Valor da Emb: R$ " + valorEmbalagem;
	}

}
