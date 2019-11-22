public class solido {
  double temperatura;
  double medida;
  double dilatacao;

  public solido(){
    String str;
    String[] st;
    System.out.println("Please give the Temperature, measure and dilation in this order, separately with space.");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    str = input.readLine();
    st = str.split(" ");
    verifica_nargs(st,3,3);
    temperatura = verifica_double(st,0);
    medida = verifica_double(st,1);
    dilatação = verifica_double(st,2);
  }



  //***********************************************
  private class void toString{
    System.out.println("Temp: "+ this.temperatura+ "\n");
    System.out.println("Med: "+ this.medida+ "\n");
    System.out.println("Dilat: "+ this.dilatacao+ "\n");
  }


  //***********************************************
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


  //***********************************************
  private static double verifica_double (String[] str, int i) {
    double doub = 0.0;
    if(str.length == 0){
    }
    try{
      doub = Double.parseDouble(str[i]);
    }
    catch (NumberFormatException nfe){
      System.out.println("Have a Invalid Information!\nPlease read the (readme.txt) file.");
      System.exit(1);
    }
    return doub ;
  }
}
