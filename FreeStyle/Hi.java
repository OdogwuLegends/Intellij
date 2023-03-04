package FreeStyle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hi {
    public static void main(String[] args) {
//        SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//
//        System.out.println(time.format(date));
//        System.out.println(date);

        String email = "boyo@mail.com";
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            System.out.println("match");
        }else System.out.println("non match");
    }
}
