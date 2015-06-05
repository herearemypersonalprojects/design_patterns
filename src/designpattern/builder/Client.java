package designpattern.builder;

public class Client {

	public static void main(String[] args) {
		Contrat contrat = new Contrat.Builder(1, "2", 3).libelle("tit").build();
		System.out.println(contrat.getLibelle());
		System.out.println(contrat.getNumero());
	}

}
