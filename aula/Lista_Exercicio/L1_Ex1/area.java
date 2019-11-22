public class area {
	//define pi = 3.1415;
	private static double calc(double r){
		return 3.1415 * (r*r);
	}
	private static double calc(double b , double h){
		return b * h;
	}
	private static double calc(double x, double y, double z){
		double p = (x+y+z)/2;
		double t = p*(p-x)*(p-y)*(p-z);
		return Math.sqrt(t);
	}
//*******************************************************************
	private static double verifica (String[] str, int i) {
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
//*******************************************************************
	private static void tri_type(double str1, double str2, double str3){
		//equilatero 3 iguais
		if (str1 == str2 && str2 == str3){
			System.out.println("The triangle is equilateral.");
		}
		//isosceles	2 iguais
		else if(str1 == str2 || str1 == str3 || str2 == str3){
			System.out.println("The triangle is isosceles.");
		}
		//escaleno	all =!
		else{
			System.out.println("The triangle is escalene.");
		}
	}
//*******************************************************************

	public static void main(String[] args){
		double valores1;
		double valores2;
		double valores3;
		double area;
		int i;
		if (args.length == 1){
			valores1 = verifica(args,0);
			System.out.println("Area of circle is: "+ calc(valores1));
		}
		else if (args.length == 2){
			valores1 = verifica(args,0);
			valores2 = verifica(args,1);
			if (valores1 == valores2){
				System.out.println("Area of square is: "+ calc(valores1,valores2));
			}else{
				System.out.println("Area of rectangle is: "+ calc(valores1,valores2));
			}

		}
		else if (args.length == 3){
			valores1 = verifica(args,0);
			valores2 = verifica(args,1);
			valores3 = verifica(args,2);
			System.out.println("Area of triangle is: "+ calc(valores1,valores2,valores3));
			tri_type(valores1,valores2,valores3);
		}
		else if (args.length > 3){
			//printa to many args.
			System.out.println("To many arguments!\nPlease read the (readme.txt) file.");
			System.exit(1);
		}
		else{
			//printa dont have arg.
			System.out.println("Hasn't argument!\nPlease read the (readme.txt) file.");
			System.exit(1);
		}
	}
}
