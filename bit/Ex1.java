import java.io.*;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		MinhaListaOrdenavel listaOrd = new MinhaListaOrdenavel();
		ArrayList listaPessoa = new ArrayList<>();
		Mulher suzana = new Mulher("Suzana", "10/06/1998", 90, 1.80);
		listaOrd.add(suzana);
		Mulher vivian = new Mulher("Vivian", "27/05/1994", 60, 2.05);
		listaOrd.add(vivian);
		Homem joao = new Homem("Joao", "04/01/1962", 78, 1.75);
		listaOrd.add(joao);
		Homem carlos = new Homem("Carlos", "14/09/1999", 52, 1.92);
		listaOrd.add(carlos);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String aux;
		System.out.println("Digite a opçao desejada: \n1.Imprimir Lista\n2.Sair");
		aux = in.readLine();
		int n = 0;
		try {
			n = Integer.parseInt(aux);
		} catch (NumberFormatException numberFormatException) {
			System.out.println("Opçao Invalida!");
		}
		if (n == 1) {
			System.out.println(
					"Digite a opçao desejada: \n1.Alfabetica (A-Z)\n2.Alfabetica (Z-A)\n3.Menor Peso\n4.Maior Peso\n5.Maior Altura\n6.Menor IMC\n7.Ordenar por genero");
			aux = in.readLine();
			int val = 0;
			try {
				val = Integer.parseInt(aux);
				listaPessoa = listaOrd.ordena(val);
				
				for (int i = 0; i < listaPessoa.size(); i++) {
					System.out.println("\n" + (PessoaIMC)listaPessoa.get(i));
				}

			} catch (NumberFormatException numberFormatException) {
				System.out.println("Opçao Invalida!");
			}

		}
	}
}
