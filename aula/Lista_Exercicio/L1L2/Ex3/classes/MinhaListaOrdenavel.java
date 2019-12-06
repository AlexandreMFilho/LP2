import java.util.*;
import java.io.*;
import L1L2.Ex3.classes.*;

public class MinhaListaOrdenavel{
    ArrayList<PessoaIMC> lista = new ArrayList<PessoaIMC>();

    public void add(PessoaIMC p){
        lista.add(p);
    }
    public PessoaIMC get(int i){
        return this.lista.get(i);
    }
    public static class Comparators{

        public static Comparator<PessoaIMC> C_peso = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 = p2.getpeso();
                pf1 = p1.getpeso();
                if(pf1 - pf2 >= 0){
                    return 10;
                }
                else if(pf1 - pf2 <= 0){
                    return -10;
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_peso_R = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 = p2.getpeso();
                pf1 = p1.getpeso();
                if(pf1 - pf2 >= 0){
                    return -10;
                }
                else if(pf1 - pf2 <= 0){
                    return 10;
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_altura = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 =  p2.getaltura();
                pf1 =  p1.getaltura();
                if(pf1 - pf2 >= 0){
                    return 10;
                }else if(pf1 - pf2 <= 0){
                    return -10;
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_altura_R = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                double pf1,pf2;
                pf2 =  p2.getaltura();
                pf1 =  p1.getaltura();
                if(pf1 - pf2 >= 0){
                    return -10;
                }else if(pf1 - pf2 <= 0){
                    return 10;
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_nome = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                String a,b;
                a = p1.getnome();
                b = p2.getnome();
                return a.compareTo(b);
            }
        };
        public static Comparator<PessoaIMC> C_genM = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                boolean a,b;
                a = p1 instanceof Homem;
                b = p2 instanceof Homem;
                if(a && !b){
                    return 10;
                }
                else if(!a && b){
                    return -10;
                }else{
                    return 0;
                }
            }
        };

        public static Comparator<PessoaIMC> C_genH = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                boolean a,b;
                a = p1 instanceof Homem;
                b = p2 instanceof Homem;
                if(a && !b){
                    return -10;
                }
                else if(!a && b){
                    return 10;
                }else{
                    return 0;
                }
            }
        };

        public static Comparator<PessoaIMC> C_imc = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                double a,b;
                a = p1.getimc();
                b = p2.getimc();
                if(a > b){
                    return 1;
                }else if(a<b){
                    return -1;
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_imc_R = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                double a,b;
                a = p1.getimc();
                b = p2.getimc();
                if(a > b){
                    return -1;
                }else if(a<b){
                    return 1;
                }
                return 0;
            }
        };
    }

    public void ordena(int num,ArrayList lista){
        switch(num){
            case 1: //Alfabetica
                Collections.sort(lista,Comparators.C_nome);
                break;
            case 2: //Alfabetica Invertida
                Collections.sort(lista,Comparators.C_nome.reversed());
                break;
            case 3: //Peso
                Collections.sort(lista,Comparators.C_peso);
                break;
            case 4: //Peso iInvertido
                Collections.sort(lista,Comparators.C_peso_R);
                break;
            case 5: //Altura
                Collections.sort(lista,Comparators.C_altura);
                break;
            case 6: //Altura Invertida
                Collections.sort(lista,Comparators.C_altura_R);
                break;
            case 7: //IMC
                Collections.sort(lista,Comparators.C_imc);
                break;
            case 8: //IMC Invertida
                Collections.sort(lista,Comparators.C_imc_R);
                break;
            case 9: //Genero Masculino
                Collections.sort(lista,Comparators.C_genH);
                break;
            case 10: //Genero Feminino
                Collections.sort(lista,Comparators.C_genM);
                break;
        }
    }

}
