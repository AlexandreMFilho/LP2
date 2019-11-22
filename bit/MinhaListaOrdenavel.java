import java.util.*;

public class MinhaListaOrdenavel{
	private ArrayList lista = new ArrayList<>();

    static {
        Map<Integer, String> criterios = new HashMap<Integer, String>();
        criterios.put(1, " Alfabetica (A-Z) – nome da pessoa");
        criterios.put(2, " Alfabetica (Z-A) – nome da pessoa");
        criterios.put(3, " Menor Peso - crescente");
        criterios.put(4, " Maior Peso - decrescente");
        criterios.put(5, " Menor Altura – crescente, do mais baixo para o mais alto");
        criterios.put(6, " Menor IMC - crescente, do mais baixo para o mais alto");
        criterios.put(7, " Homem / Mulher – ordenar por gênero * esse é desafio");

        criterios = Collections.unmodifiableMap(criterios);
    } 

	public void add(Object p){
		lista.add(p);
	}

	public Object get(int i){
		return this.lista.get(i);
	} 

	public static class Comparators {

		public static Comparator<PessoaIMC> nomeC = new Comparator<PessoaIMC>() {
			@Override
			public int compare(PessoaIMC n1, PessoaIMC n2) {
				String nome1, nome2;
				nome2 = n2.getNome();
				nome1 = n1.getNome();
				return nome1.compareTo(nome2);
			}
		};
		public static Comparator<PessoaIMC> pesoC = new Comparator<PessoaIMC>() {
			@Override
			public int compare (PessoaIMC p1, PessoaIMC p2){ // recebe objetos PessoaIMC como Object
				double pf1, pf2;
				pf2 = p2.getPeso();
				pf1 = p1.getPeso();
				if (pf1 > pf2){
					return 1;
				}
				else if (pf2 > pf1){
					return -1;
				}
				return 0;
			}
		};
		public static Comparator<PessoaIMC> alturaC = new Comparator<PessoaIMC>() {
			@Override
			public int compare (PessoaIMC a1, PessoaIMC a2){ // recebe objetos PessoaIMC como Object
				double altura1, altura2;
				altura2 = a2.getAltura();
				altura1 = a1.getAltura();
				if (altura2 > altura1){
					return 1;
				}
				else if (altura1 > altura2){
					return -1;
				}
				return 0;
			}
		};
		public static Comparator<PessoaIMC> imcC = new Comparator<PessoaIMC>() {
			@Override   
			public int compare (PessoaIMC imc1, PessoaIMC imc2){ // recebe objetos PessoaIMC como Object
				double IMC1, IMC2;
				IMC1 = imc1.CalculaIMC(imc1.getAltura(),imc1.getPeso());
				IMC2 = imc2.CalculaIMC(imc2.getAltura(),imc2.getPeso());
				if (IMC1 > IMC2){
					return 1;
				}
				else if (IMC2 > IMC1){
					return -1;
				}
				return 0;
			}
		};
		// public static Comparator<PessoaIMC> generoC = new Comparator<PessoaIMC>() {
		// 	@Override
		// 	public int compare (PessoaIMC genero1, PessoaIMC genero2){ // recebe objetos PessoaIMC como Object
		// 		double gen1, gen2;
		// 		gen1 = imc1.CalculaIMC(imc1.getAltura(),imc1.getPeso());
		// 		gen2 = imc2.CalculaIMC(imc2.getAltura(),imc2.getPeso());
		// 		if (IMC1 > IMC2){
		// 			return 1;
		// 		}
		// 		else if (IMC2 > IMC1){
		// 			return -1;
		// 		}
		// 		return 0;
		// 	}
		// };
	};
	
	public ArrayList ordena(final int criterio){
		switch(criterio){
			case 1:
				Collections.sort(this.lista, Comparators.nomeC);
				break;
			case 2:
				Collections.sort(this.lista, Comparators.nomeC.reversed());
				break;
			case 3:
				Collections.sort(this.lista, Comparators.pesoC);
				break;
			case 4:
				Collections.sort(this.lista, Comparators.pesoC.reversed());
				break;
			case 5:
				Collections.sort(this.lista, Comparators.alturaC);
				break;
			case 6: 
				Collections.sort(this.lista, Comparators.imcC);
				break;
		}
		return lista;
	}
}
