package section_7_oop_part2.composition_1.encapsulation_2;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex){
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int fillUpToner(int tonerToFill){
        if (tonerToFill > 0 && tonerToFill <= 100){
            if (this.tonerLevel + tonerToFill > 100){
                return -1;
            }
            return this.tonerLevel += tonerToFill;
        }
        return -1;
    }

    public int printPage(int pages){

        int pagesToPrint = pages;
        if (this.isDuplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
