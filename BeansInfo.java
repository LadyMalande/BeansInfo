import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.util.Scanner;
import java.beans.Introspector;


import static java.beans.Introspector.getBeanInfo;

public class BeansInfo {

    private static void findInfo(String line) {
        Class cl;

        try{ cl = Class.forName(line); }
        catch(ClassNotFoundException ex){System.out.println("\"" + line + "\"" + " does not exist"); System.out.println(); return;}

        try{BeanInfo bi = Introspector.getBeanInfo(cl);}
        catch(IntrospectionException ex2){System.out.println(ex2.getStackTrace());}

        System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;

        while(sc.hasNext()) {
            line = sc.next();

            findInfo(line);
        }

    }

}
