import java.util.Scanner;
import quadraticequation.QuadraticEquation;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
                System.out.println("������� ���������� a ");
        	int a = scanner.nextInt();
        	System.out.println("������� ���������� b ");
        	int b = scanner.nextInt();
        	System.out.println("������� ���������� c ");
        	int c = scanner.nextInt();

        	QuadraticEquation equation = new QuadraticEquation(a, b, c);
        	equation.decision();
	}
}