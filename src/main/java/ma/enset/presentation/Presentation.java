package ma.enset.presentation;


import lombok.Data;
import ma.enset.metier.Imetier;

@Data
public class Presentation {
    Imetier metier;
    public void operation (int n){
        double res=metier.calcul(n);
        System.out.println("=================");
        System.out.println("pour n ="+n+ " ====> "+ res);
        System.out.println("=================");
    }
}
