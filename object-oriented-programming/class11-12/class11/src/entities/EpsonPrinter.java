package entities;

import java.time.LocalDate;

public class EpsonPrinter extends Printer{

    public EpsonPrinter(String model, String connectionType, LocalDate manufactureDate, int papersAvailable, double inkPercentage) {
        super(model, connectionType, manufactureDate, papersAvailable, inkPercentage);
    }

    @Override
    public void print() {
        if (isTherePaper() && !doesItNeedInk()) {
            setPapersAvailable(getPapersAvailable() - 1);
            setInkPercentage(getInkPercentage() - 0.01);
            System.out.println("Printing with Epson Printer ...");
        } else if (isTherePaper() && doesItNeedInk()) {
            System.out.println("You need to fill ink in.");
        } else if (!isTherePaper() && doesItNeedInk()) {
            System.out.println("You need paper and ink.");
        } else {
            System.out.println("You are running out of paper.");
        }
    }
}
