import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaMedia {

    // Library injection
    private static final Logger logger = Logger.getLogger(ListaMedia.class);

    private static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {

        try {
            if (integerList.size() >= 5 && integerList.size() <= 9) {
                logger.info("List's length is greater than 5.");
            }
            if (integerList.size() >= 10) {
                logger.info("List's length is greater than 10.");
            }
            if (integerList.size() == 0) {
                throw new Exception();
            }
        }
        catch (Exception e) {
            logger.error("The list is empty!");
        }

    }

    public static void calcularMedia() {
        int soma = 0;
        for (Integer integer : integerList) {
            soma += integer;
        }
        System.out.println("A soma da lista é: " + soma/integerList.size() );
    }
}
