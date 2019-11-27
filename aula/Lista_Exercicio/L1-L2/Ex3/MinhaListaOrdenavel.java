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
        return this.lista.get(i);
    }
    public static class Comparator{

        public static Comparator<PessoaIMC> C_peso = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 = (PessoaIMC) p2.getPeso();
                pf1 = (PessoaIMC) p1.getPeso();
                if(pf1 - pf2 >= 0){
                    return 10;
                }else if(pf1 - pf2 <= 0){
                    return -10;
                }else{
                    return 0;
                }
            }
        }
        public static Comparator<PessoaIMC> C_altura = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 = (PessoaIMC) p2.getaltura();
                pf1 = (PessoaIMC) p1.getaltura();
                if(pf1 - pf2 >= 0){
                    return 10;
                }else if(pf1 - pf2 <= 0){
                    return -10;
                }else{
                    return 0;
                }
            }
        }
        public static Comparator<PessoaIMC> C_nome = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                String a,b;
                a = p1.getNome();
                b = p2.getNome();
                return a.compareTo(b);
            }
        }
        public static Comparator<PessoaIMC> C_genM = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                if(p1 Intanceof Mulher &&(!(p2 Intanceof Mulher))){
                    return -10;
                }else if(!(p1 Instanceof Mulher) && p2 Intanceof Mulher){
                    return 10;
                }else{
                    return 0;
                }
            }
        }
        public static Comparator<PessoaIMC> C_genH = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                if(p1 Intanceof Homem &&(!(p2 Intanceof Homem))){
                    return -10;
                }else if(!(p1 Instanceof Homem) && p2 Intanceof Homem){
                    return 10;
                }else{
                    return 0;
                }
            }
        }
    }
    public ArrayList ordena(final int num){
        switch(num){
            case 1: //Alfabetica
                Collections.sort(lista,Comparators.C_nome);
                break;
            case 2: //Alfabetica Invertida

                break;
        }
    }
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    }
}
