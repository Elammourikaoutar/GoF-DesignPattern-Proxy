package ma.enset;


import ma.enset.metier.ProxySecurity;
import ma.enset.presentation.Presentation;

/*
 * Le proxy joue le role d'un cache
 *ProxySecurity joue le role de parfeu de securite
 * */
public class Demo {
    public static void main(String[] args) {
        Presentation presentation=new Presentation();
        presentation.setMetier(new ProxySecurity("1234"));
        presentation.operation(12);
        presentation.operation(10);
        presentation.operation(10);

    }
}
