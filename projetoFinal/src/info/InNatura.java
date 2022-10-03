package info;

public class InNatura extends Ingrediente {
	private String produtor;
	private String cidade;
	private double desc;

	public InNatura(int cod, String nome, double qtdEmbalagem, double valorEmbaleagem, String produtor, String cidade, double desc) {
		super(cod, nome, qtdEmbalagem, valorEmbaleagem);
		setProdutor(produtor);
		setCidade(cidade);
		setDesc(desc);	
	}
	
	public String getProdutor() {
		return produtor;
	}
	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public double getDesc() {
		return desc;
	}
	public void setDesc(double desc) {
		this.desc = desc;
	}	
	public String toString() {
		return super.toString() +  " - Produtor: " + produtor +  " - Cidade: " + cidade + " - Desc Exclusividade: " + desc + "%";
	}
}
