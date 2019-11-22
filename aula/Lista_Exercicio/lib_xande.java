public class lib_xande{
//Recebe uma string e um inteiro que será o indice do vetor para ser verificado.
//Encerrra execução caso o tipo não seja transformavel ou retorna a string
//convertida em um double.
private static double verifica_double (String[] str, int i) {
  double doub = 0.0;
  try{
    doub = Double.parseDouble(str[i]);
  }
  catch (NumberFormatException nfe){
    System.out.println("Have a Invalid Information!\nPlease read the (readme.txt) file.");
    System.exit(1);
  }
  return doub ;
}
//Recebe uma string e um inteiro que será a quantidade de argumentos pedidos.
//verifica se a quantidade de argumentos é valida através do inteiro passado
//Encerra a execução caso o a string estiver vazia ou mais argumentos que os
//necessarios. Caso a quantidade de argumentos seja a necessitada o funçao
//termina a sua execuçao sem que retorne erro.
private static void verifica_nargs(String[] str,int min,int max){
  int tamanho = str.length;
  if(tamanho >= min && tamanho <= max){
  }
  else if(tamanho <= min-1){
    System.out.println("Hasn't enough arguments!\nPlease read the (readme.txt) file.");
    System.exit(1);
  }
  else if (tamanho >= max){
    System.out.println("To many arguments!\nPlease read the (readme.txt) file.");
    System.exit(1);
  }
}
}
