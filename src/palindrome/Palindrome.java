
import static javafx.scene.input.KeyCode.T;


public class Palindrome {

  public static void main (String[]args)
 {
String T="rotor";

int i=0;
int j=T.length()-1;
//affichage de la suite de caractere saisie
        System.out.print(T);
//test de palendrome

while ( (i<j)&&(T.charAt(i)==T.charAt(j)) )

   i=i+1; j=j-1;
                   }

if (T.charAt(i)!=T.charAt(j))
 System.out.println("n'est pas un palindrome);
else
 System.out.println(" est un palindrome");
    }
