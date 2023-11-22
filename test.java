package exeption;

public class test {

	public static void main(String[] args) {
		
	
		double n=Double.parseDouble(args[0]);
		double x=Double.parseDouble(args[1]);
		try {
		
		System.out.println(Mathematique.f(n,x));
		}
	
	catch(ArithmeticException A) {
		System.out.println(" impossible de faire une division par zéro ! ");
		A.getMessage();
		A.getStackTrace();
	}

		catch(ArrayIndexOutOfBoundsException  B) {
			System.out.println("« Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
		}

		catch(NumberFormatException  C ) {
			System.out.println("Les arguments doivent être des nombres");}
		catch(ParametreNullException e ) {
			System.out.println("pas de division par 0");
		}
		catch(NegatifException e ) {
			System.out.println("pas des nombres negatifs");
			e.getMessage();
			e.getStackTrace();
		}
		
		
		
	finally {
	System.out.println("bloc finally exécuté quel que soit le résultat d’exécution");
	}
		

	}

}
