import java.io.*;
class angulo{
	private static double converteangulo(double g){
		double rad = 0.0;
		rad = Math.toRadians(g);
		return rad;
	}
	private static double funcaoseno(double g){
		double seno = 0.0;
		seno = Math.sin(g);
		return seno;
	}
	private static double funcaocosseno(double g){
		double cos = 0.0;
		cos = Math.cos(g);
		return cos;
	}
	private static double funcaotangente(double g){
		double tang = 0.0;
		tang = Math.tan(g);
		return tang;
	}
	private static double funcaocotangente(double g){
		double ctang = 0.0;
		double s;
		double c;
		s = Math.sin(g);
		c = Math.cos(g);
		ctang = c / s ;
		return ctang;
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
	//***********************************************
	private static void verifica_nargs(String[] str,int min,int max){
	  int tamanho = str.length;
	  if(tamanho >= min && tamanho <= max){
	  }
	  else if(tamanho <= min-1){
	    //System.out.println("Hasn't enough arguments!\nPlease read the (readme.txt) file.");
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
		if (args.length == 1){
			verifica_nargs(args,0,1);
			deg = verifica_double(args,0);
			double a = converteangulo(deg);
			System.out.println(args[0] + " degrees are equal to:");
			System.out.println("Radians:" + (converteangulo(deg)));
			System.out.println("Sine:" + (funcaoseno(a)));
			System.out.println("Cosine:" + (funcaocosseno(a)));
			System.out.println("Tangent:" + (funcaotangente(a)));
			System.out.println("Co_Tangent:" + (funcaocotangente(deg)));
		}
		else{
			String str;
			String[] st;
			do{
				System.out.println("Please insert a degree value...");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				str = input.readLine();
				st = str.split(" ");
				verifica_nargs(st,1,1);
				deg = verifica_double(st,0);
				double a = converteangulo(deg);
				System.out.println(st[0] + " degrees are equal to:");
				System.out.println("Radians:" + (converteangulo(deg)));
				System.out.println("Sine:" + (funcaoseno(a)));
				System.out.println("Cosine:" + (funcaocosseno(a)));
				System.out.println("Tangent:" + (funcaotangente(a)));
				System.out.println("Co_Tangent:" + (funcaocotangente(deg)));
			}while(true);
		}
	}
}
