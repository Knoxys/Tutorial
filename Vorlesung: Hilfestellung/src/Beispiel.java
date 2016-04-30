import java.util.EmptyStackException;
import java.util.Stack;

public class Beispiel {
	public static void main(String[] args)
	   {
		
		Konto konto1 = new Konto("Dieter", 111112, 50);
		Konto konto2 = new Konto("Max", 1111113, 300);
		
		Stack<Konto> Kontoliste = new Stack <Konto>;
		
		
		
		
		
		
		
		
		
		//Verkapselungsbeispiel
		Auto kaefer = new Auto(20, "keafer");
		Stack<Auto> beispiel = new Stack<Auto>();
		beispiel.push(kaefer);
		System.out.println(beispiel.pop().bezeichnung);
		

		//Vorlesungsbeispiel
		
	     Stack<String> s = new Stack<String>();
	
	     s.push("Erstes Element");
	     s.push("Zweites Element");
	     s.push("Drittes Element");
	     while (true) {
	       try {
	         System.out.println(s.pop());
	       } catch (EmptyStackException e) {
	         break;
	       }
	     }
	   }
}
