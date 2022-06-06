import entities.CannonPrinter;
import entities.EpsonPrinter;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        EpsonPrinter epson = new EpsonPrinter(
        "LX-300", "USB", LocalDate.now()
                , 5, 20.0);

        System.out.println(epson);

        CannonPrinter cannon = new CannonPrinter("SX-500", "USB/Wireles",
                LocalDate.now(), 15, 5.00);

        System.out.println(cannon);
        cannon.print();
    }

}
