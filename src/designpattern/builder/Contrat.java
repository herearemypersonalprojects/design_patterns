package designpattern.builder;


public class Contrat {
	private long id;
	private String numero;
	private long idProduit;
	private String libelle;
	
	private Contrat(Builder builder) {
		this.id = builder.id;
		this.numero = builder.numero;
		this.idProduit = builder.idProduit;
		this.libelle = builder.libelle;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public static class Builder {
		// les parameters obligatoires
		private long id;
		private String numero;
		private long idProduit;
		
		// les parameters optionels - valeurs par défault
		private String libelle = "Produit";
		
		public Builder(int i, String numero, int j) {
			this.id = i;
			this.numero = numero;
			this.idProduit = j;
		}
		
		public Builder libelle(String libelle) {
			this.libelle= libelle;
			return this;
		}
		
		public Contrat build() {
			return new Contrat(this);
		}		
	}
}
