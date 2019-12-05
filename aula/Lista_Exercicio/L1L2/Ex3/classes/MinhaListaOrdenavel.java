import java.util.Collections.*;
import java.util.ArrayList.*;
import java.util.Comparator.*;
//import L1L2.Ex3.classes.*;

public class MinhaListaOrdenavel implements Comparator{
/*
    final int Ord_nome = 1;
    final int Ord_nome_r = 2;
    final int Ord_peso = 3;
    final int Ord_peso_r = 4;
    final int Ord_alt = 5;
    final int Ord_alt_r = 6;
    final int Ord_imc = 7;
    final int Ord_imc_r = 8;
    final int Ord_gen_h = 9;
    final int Ord_gen_m = 10;
*/
    ArrayList<PessoaIMC> lista = new ArrayList<PessoaIMC>();

    public void add(PessoaIMC p){
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
                pf2 = p2.getPeso();
                pf1 = p1.getPeso();
                if(pf1 - pf2 >= 0){
                    return 10;
                }
                else if(pf1 - pf2 <= 0){
                    return -10;
                }
                return 0;
            }
        };
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
                }
                return 0;
            }
        };
        public static Comparator<PessoaIMC> C_nome = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1,PessoaIMC p2){
                String a,b;
                a = p1.getNome();
                b = p2.getNome();
                return a.compareTo(b);
            }
        };
        // public static Comparator<PessoaIMC> C_genM = new Comparator<PessoaIMC>(){
        //     @Override
        //     public int compare (PessoaIMC p1, PessoaIMC p2){
        //         if(p1 Intanceof Mulher==true && p2 Intanceof Mulher ==false){
        //             return -10;
        //         }else if(p1 Instanceof Mulher ==false && p2 Instanceof Mulher==true){
        //             return 10;
        //         }
        //         return 0;
        //     }
        // };
        // public static Comparator<PessoaIMC> C_genH = new Comparator<PessoaIMC>(){
        //     @Override
        //     public int compare (PessoaIMC p1, PessoaIMC p2){
        //         if(p1 Intanceof Homem==true && p2 Intanceof Homem ==false){
        //             return -10;
        //         }
        //         else if(p1 Instanceof Homem==false && p2 Instanceof Homem==true){
        //             return 10;
        //         }
        //         return 0;
        //     }
        // };
        public static Comparator<PessoaIMC> C_imc = new Comparator<PessoaIMC>(){
            @Override
            public int compare (PessoaIMC p1, PessoaIMC p2){
                float a,b;
                a = PessoaIMC.getimc();
                b = PessoaIMC.getimc();
                if(a > b){
                    return 1;
                }else if(a<b){
                    return -1;
                }
                return 0;
            }
        };
    }

    public ArrayList ordena(int num,ArrayList lista){
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
                Collections.sort(lista,Comparators.C_peso.reversed());
                break;
            case 5: //Altura
                Collections.sort(lista,Comparators.C_altura);
                break;
            case 6: //Altura Invertida
                Collections.sort(lista,Comparators.C_altura.reverse());
                break;
            case 7: //IMC
                Collections.sort(lista,Comparators.C_imc);
                break;
            case 8: //IMC Invertida
                Collections.sort(lista,Comparators.C_imc.reverse());
                break;
            case 9: //Genero Masculino
                Collections.sort(lista,Comparators.Ord_gen_h);
                break;
            case 10: //Genero Feminino
                Collections.sort(lista,Comparators.Ord_gen_m);
                break;
        }
    }

    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        E2 lista = new E2();
        MinhaListaOrdenavel ordenador = new MinhaListaOrdenavel();
        while(true){
            try{
            System.out.println("Que operacao deseja realizar na lista ?\n1 - Adicionar um elemento.\n2 - Buscar um elemento.\n3 - Ordenar a lista.\n4 - Ver a lista.\n0 - Encerrar aplicacao.");

                int i = Integer.parseInt(in.readline());
                switch(i){
                    case 0:
                        System.exit(0);
                    case 1:
                        //ordenador.add();
                        break;
                    case 2:
                        //ordenador.get(index = Integer.parse.Int(in.readline()));
                        break;
                    case 3:
                        System.out.println("Qual criterio de ordenacao? Digite a opcao desejada:\n1 - Nome em ordem crescente.\n2 - Nome em ordem decrescente.\n3 - Peso crescente.\n4 - Peso decrescente.\n5 - Altura crescente.\n6 - Altura decrescente\n7 - Imc crescente.\n8 - Imc decrescente.\n9 - Genero: masculino->feminino.\n10 - Genero: feminino->masculino.");
                        int aux = Integer.parseInt(in.readline());
                        ordenador.ordena(aux,lista);
                        break;
                    case 4:
                        lista.toString();
                        break;
                }
                System.out.println("Deseja executar alguma outra operação?");
            }catch(NumberFormatException e){
                System.out.println("Valor inserido invalido!!!\nTente digitar um valor valido.");
            }catch(Exception a){
                System.out.println("Erro: "+a);
            }
        }
    }
}
