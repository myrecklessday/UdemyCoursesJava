package section_7_oop_part2.composition_1.encapsulation_2;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20,  false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(5);
        System.out.println("Pages printed  was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPage(6);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        printer.fillUpToner(50);
        System.out.println("Toner is now at level " + printer.getTonerLevel());

    }

}
