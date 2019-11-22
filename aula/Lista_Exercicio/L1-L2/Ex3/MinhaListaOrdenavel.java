import java.util.Collections.*;
import java.util.ArrayList.*;
import java.util.Comparator.*;

public class MinhaListaOrdenavel implements Comparator{

    final int Ord_nome = 1;
    final int Ord_nome_r = 2;
    final int Ord_peso = 3;
    final int Ord_alt = 4;
    final int Ord_imc = 5;
    final int Ord_gen_h = 6;
    final int Ord_gen_m = 7;

    ArrayList<PessoaIMC> lista = new ArrayList<PessoaIMC>();

    public add(PessoaIMC p){
        lista.add(p);
    }
    public PessoaIMC get(int i){
        return lista.get(i);
    }
    @override
    public int compare(PessoaIMC p1,PessoaIMC p2){
        double pf1,pf2;
        pf2 = (PessoaIMC) p2.getPeso();
        pf1 = (PessoaIMC) p1.getPeso();
        return (int)Math.round(pf2-pf1);
    }

    public void ordena(ArrayList lista,int num){
        colec = lista;
        switch(num){
            case 1: //Alfabetica

                break;
            case 2: //Alfabetica Invertida

                break;
        }
    }
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    }
}
