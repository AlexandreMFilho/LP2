import java.io.*;
class AnguloObj{
  private double ang;
  private double rad;

  private AnguloObj(double x){
    ang = Math.toRadians(x);
    rad = x;
  }
  private double converteangulo(){
    return Math.toRadians(ang);
  }
	private double funcaoseno(){
		return Math.sin(ang);
	}
	private double funcaocosseno(){
		return Math.cos(ang);
	}
	private double funcaotangente(){
		return Math.tan(ang);
	}
	private double funcaocotangente(){
		return Math.cos(ang)/Math.sin(ang);
	}
  private double printrad(){
    return rad;
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

  private static int verifica_int (String[] str, int i) {
    int doub = 0;
    if(str.length == 0){
    }
    try{
      doub = Integer.parseInt(str[i]);
    }
    catch (NumberFormatException nfe){
      System.out.println("Have a Invalid Information!\nPlease read the (readme.txt) file.");
      System.exit(1);
    }
    return doub ;
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
	public static void main(String[] args) throws IOException{
		double deg = 0.0;
    if (args.length != 0){              //erro , não quero argumentos da chamada.
      verifica_nargs(args,0,0);
    }
    else{                               // execução normal, pede quantidade e executa.

      int i;
      int qtd;
      String str;
			String[] st;

      System.out.println("Enter q number of degrees that will calculate:\n");
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      str = input.readLine();
      st = str.split(" ");
      qtd = verifica_int(st,0);
      AnguloObj[] angs = new AnguloObj[qtd];

      for (i = 0; i < qtd; i++){
				System.out.println("Please insert a degree value...\n");
				//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				str = input.readLine();
				st = str.split(" ");
				verifica_nargs(st,1,1);
				angs[i] = new AnguloObj(verifica_double(st,0));
      }
      for (i = 0; i< qtd; i++){
				System.out.println(angs[i].printrad() + " degrees are equal to:");
			  System.out.println("\tRadians:" + (angs[i].converteangulo()));
				System.out.println("\tSine:" + (angs[i].funcaoseno()));
		    System.out.println("\tCosine:" + (angs[i].funcaocosseno()));
			  System.out.println("\tTangent:" + (angs[i].funcaotangente()));
			  System.out.println("\tCo_Tangent:" + (angs[i].funcaocotangente()+"\n"));
			}
    }
	}
}
