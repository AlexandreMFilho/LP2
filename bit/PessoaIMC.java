public abstract class PessoaIMC implements Comparable<PessoaIMC>{
	protected String nome;
	protected String dataNascimento;
	protected double peso;
	protected double altura;

	public PessoaIMC(String nomeConstrutor, String dataConstrutor, double pesoConstrutor, double alturaConstrutor){
		this.nome = nomeConstrutor;
		this.dataNascimento = dataConstrutor;
		this.peso = pesoConstrutor;
		this.altura = alturaConstrutor;
	}
																																																																																																																																																							
	public String getNome(){
		return this.nome;
	}

	public double getPeso(){																																																																																																																																																																																																																																																																																																																													
		return this.peso;
	}

	public double getAltura(){
		return this.altura;
	}

	public double CalculaIMC(double valorAltura, double valorPeso){
		double imc = valorPeso / (valorAltura * valorAltura);
		return imc;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s\nData de Nascimento: %s\nPeso: %.2f\nAltura: %.2f\n", nome, dataNascimento, peso, altura);
  }

		// 	public Comparator pesoC = new Comparator () {
		// 	public int compare (Object p1, Object p2){ // recebe objetos PessoaIMC como Object
		// 		double pf1, pf2;
		// 		pf2 = ((PessoaIMC)p2).getPeso();
		// 		pf1 = ((PessoaIMC)p1).getPeso();
		// 		return (int)Math.round (pf1 - pf2);
		// 	}
		// };

		// public Comparator alturaC = new Comparator () {
		// 	public int compare (Object a1, Object a2){ // recebe objetos PessoaIMC como Object
		// 		double alt1, alt2;
		// 		alt2 = ((PessoaIMC)a2).getAltura();
		// 		alt1 = ((PessoaIMC)a1).getAltura();
		// 		return (int)Math.round (alt1 - alt2);
		// 	}
		// };

		// public Comparator imcC = new Comparator () {
		// 	public int compare (Object i1, Object i2){ // recebe objetos PessoaIMC como Object
		// 		double imc1, imc2;
		// 		imc2 = ((PessoaIMC)i2).getPeso();
		// 		imc1 = ((PessoaIMC)i1).getPeso();
		// 		return (int)Math.round (imc2 - imc1);
		// 	}

}

	/*public abstract String resultIMC(){
		return new String();
	}*/


