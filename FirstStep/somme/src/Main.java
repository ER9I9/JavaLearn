import java.util.*;
class Somme {
    public int n1, n2;
    //constructeur par défaut
    Somme(int nbr1, int nbr2){
        n1 = nbr1;
        n2 = nbr2;
        System.out.println("Les nombres sont initialisés.");
    }
    public int sum(){
        return n1 + n2;
    }
}
public class Main {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("Entrez le premier nombre :");
        int n1 = in.nextInt();
        System.out.println("Entrez le deuxième nombre :");
        int n2 = in.nextInt();
        //appeler le constructeur par défaut.
        Somme s = new Somme(n1,n2);
        System.out.println("Le résultat de l'addition est : "+ s.sum());

        in.close();
    }
}