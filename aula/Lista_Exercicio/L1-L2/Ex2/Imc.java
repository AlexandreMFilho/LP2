import java.io.*;
import java.util.*;

public class Imc{
    public static void main(String[] args){
        Homem man;
        Mulher woman;
        String[] palavras;
        String linha, name, date;
        int qtd = 0 ,i = 0, inb = 0, iio = 0, ig = 0;
        double peso, altura;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList lista = null;

        while(i <= 3){
            try{
                System.out.print("Digite o numero de pessoas: ");
	               linha = in.readLine();
                   qtd = Integer.parseInt(linha);
                   lista = new ArrayList(qtd);
                   i = 10;
               }catch(NumberFormatException nb){
                   System.out.println("Erro. Valor inserido nao e numerico."+ nb);
                   i++;
               }catch(IOException io){
                   System.out.println("Erro de entrada. "+ io);
                   i++;
               }
               if(i == 3){
                   System.out.print("Encerrando aplicaçao...");
                   System.exit(1);
               }
           }


        try{
            for(i = 0; i < qtd;i++){
                System.out.print("\nInserir homem (h) ou mulher(m) nº"+(i+1)+": ");
                linha = in.readLine();

                if(linha.equalsIgnoreCase("H")){
                    System.out.print("\nDigite o nome: ");
                    name = in.readLine();
                    System.out.print("\nDigite a data de Nascimento: ");
                    date = in.readLine();
                    System.out.print("\nDigite o peso: ");
                    peso = Double.parseDouble(in.readLine());
                    System.out.print("\nDigite a altura(em metros): ");
                    altura =  Double.parseDouble(in.readLine());

                    man = new Homem(name,date,peso,altura);
                    lista.add(man);
                }

                else if (linha.equalsIgnoreCase("M")){
                    System.out.print("\nDigite o nome: ");
                    name = in.readLine();
                    System.out.print("\nDigite a data de Nascimento: ");
                    date = in.readLine();
                    System.out.print("\nDigite o peso: ");
                    peso = Double.parseDouble(in.readLine());
                    System.out.print("\nDigite a altura(em metros): ");
                    altura =  Double.parseDouble(in.readLine());

                    woman = new Mulher(name,date,peso,altura);
                    lista.add(woman);
                }

                else{
                    System.out.println("---Opçao Invalida!\nTente:\n(h) para homem.\n(m) para mulher.\n");
                    i--;
                    ig++;
                }
                if(inb > 2 || iio > 2 || ig > 2){
                    System.out.print("\nTentativas excedidas.\nEncerrando aplicaçao...\n");
                    System.exit(1);
                }
            }
            System.out.println(lista.toString());

        }catch(NumberFormatException nb){
            System.out.println("Erro. "+ nb +"\nValor inserido nao e numerico. Reiniciando aplicaçao.");
            inb++;
            i--;
        }catch(IOException io){
            System.out.println("Erro de entrada. "+ io +"\nReiniciando aplicação.");
            iio++;
            i--;
        }catch(NullPointerException np){
            System.out.print("Erro."+np+"\nPonteiro nulo.");
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("Erro Inesperado. \nEncerrando aplicação.");
            System.exit(1);
        }
    }
}
