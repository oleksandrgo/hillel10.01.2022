package HW16;

import java.io.IOException;
import java.util.*;

public class User {
    String email, name, lastname, password;
    /*String email;
    String name;
    String lastname;
    String password;*/

    public User(String e, String p){
        if (mailcheck(e)) {
            this.email = e;
            this.password = p;
        } else {
            System.out.println("Введён некорректный email");
        }

    }

    public User(String e, String p, String n, String ln){
        if (mailcheck(e)) {
            this.email = e;
            this.name = n;
            this.lastname = ln;
            this.password = p;
        } else {
            System.out.println("Введён некорректный email");
        }

    }

    static boolean mailcheck(String x){
        char[] mlchck = x.toCharArray();
        int i;
        boolean b = false;
        for (i = 0;i < mlchck.length; i++){
            if (mlchck[i] == '@') {
                b = true;
            }
        }
        return b;
    }

    public void info1(){
        System.out.println(this.email);
        System.out.println(this.name);
        System.out.println(this.lastname);
        System.out.println(this.password);
    }

    public void info2(){
        System.out.println(this.email);
        System.out.println(this.password);
    }

}
