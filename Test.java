package HelloWorld;
import java.util.Scanner;

	public class Test {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Calculatrice calc = new Calculatrice();

	        System.out.println("=== CALCULATRICE ===");
	        System.out.print("Entrez le premier nombre : ");
	        double num1 = scanner.nextDouble();

	        char operation = scanner.next().charAt(0);

	        System.out.print("Entrez le deuxième nombre : ");
	        double num2 = scanner.nextDouble();

	        double resultat = 0;
	        boolean erreur = false;

	        try {
	            switch (operation) {
	                case '+':
	                    resultat = calc.addition(num1, num2);
	                    break;
	                case '-':
	                    resultat = calc.soustraction(num1, num2);
	                    break;
	                case '*':
	                    resultat = calc.multiplication(num1, num2);
	                    break;
	                case '/':
	                    resultat = calc.division(num1, num2);
	                    break;
	                default:
	                    System.out.println("Erreur : Opération invalide !");
	                    erreur = true;
	            }

	            if (!erreur) {
	                System.out.println("Résultat : " + resultat);
	            }
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }

	        scanner.close();
	    }
	}




	