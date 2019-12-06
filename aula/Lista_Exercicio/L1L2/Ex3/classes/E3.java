import java.util.*;
import java.io.*;
import L1L2.Ex3.classes.*;

public class E3{
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList lista = new ArrayList();
        ArrayList l2 = new ArrayList();
        MinhaListaOrdenavel ordenador = new MinhaListaOrdenavel();

        Homem p1 = new Homem("Alexandre","28/10/1998",80.0,1.80);
        Homem p2 = new Homem("Arthur","10/11/1999",81.0,1.84);
        Homem p3 = new Homem("Tiago","26/02/1999",58.0,1.72);
        Homem p4 = new Homem("Breno","09/05/1997",65.0,1.77);
        Mulher p5 = new Mulher("Thalita","28/10/1998",62.0,1.60);
        Mulher p6 = new Mulher("Talita","28/10/1998",55.0,1.55);
        Homem p7 = new Homem("Kaylan","28/10/1998",75.0,1.70);
        Mulher p8 = new Mulher("Celia","27/08/1977",90.0,1.60);
        Mulher p9 = new Mulher("Larissa","24/09/2004",80.0,1.63);
        Homem p10 = new Homem("AlexandreP","14/02/1974",100.0,1.85);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);
        lista.add(p10);

        while(true){
            try{
                System.out.println("Que operacao deseja realizar na lista ?\n1 - Adicionar um elemento.\n2 - Buscar um elemento.\n3 - Ordenar a lista.\n4 - Ver a lista.\n0 - Encerrar aplicacao.");
                int i = Integer.parseInt(in.readLine());
                switch(i){
                    case 0:
                        System.exit(0);
                case 1:
                    System.out.println("Digite:\n1 - Homem.\n2 - Mulher");
                    int gen = Integer.parseInt(in.readLine());
                    if(gen <1 || gen > 2){
                        System.out.println("Opção invalida! Tente novamente.");
                    break;
                    }
                    System.out.println("Digite o nome:");
                    String a = in.readLine();
                    System.out.println("Digite o Data de Nascimento:");
                    String b = in.readLine();
                    System.out.println("Digite o Peso:");
                    double c = Double.parseDouble(in.readLine());
                    System.out.println("Digite o Altura:");
                    double d = Double.parseDouble(in.readLine());
                    if(gen == 1){
                        Homem p = new Homem(a,b,c,d);
                        lista.add(p);
                        break;
                    }else if(gen == 2){
                        Mulher p = new Mulher(a,b,c,d);
                        lista.add(p);
                        break;
                    }
                case 2:
                    i = Integer.parseInt(in.readLine());
                    System.out.println(lista.get(i-1));
                    break;
                case 3:
                    System.out.println("Qual criterio de ordenacao? Digite a opcao desejada:\n1 - Nome em ordem crescente.\n2 - Nome em ordem decrescente.\n3 - Peso crescente.\n4 - Peso decrescente.\n5 - Altura crescente.\n6 - Altura decrescente\n7 - Imc crescente.\n8 - Imc decrescente.\n9 - Genero: masculino->feminino.\n10 - Genero: feminino->masculino.");
                    int aux = Integer.parseInt(in.readLine());
                    ordenador.ordena(aux,lista);
                    break;
                case 4:
                    for(i =1;i<=lista.size();i++){
                        System.out.println("Pessoa "+i+lista.get(i-1));
                    }
                    break;
                default:
                    System.out.println("Opçao invalida, favor digitar uma opçao valida.");
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("\nValor inserido invalido!!!\nTente digitar um valor valido.\n");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("\nEndereço inserido invalido!!!\nTente digitar um valor valido.\n");
            }catch(IndexOutOfBoundsException e){
                System.out.println("\nEndereço inserido invalido!!!\nTente digitar um valor valido.\n");
            }catch(Exception e){
                System.out.println("\nErro: "+e);
            }
        }
    }
}
