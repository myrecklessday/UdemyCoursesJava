public class Section5ControlFlowStatements {

    public static void main(String[] args){

//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        //switch Statement
        int switchValue = 6;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4: case 5:
                System.out.println("Value was 3, or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

               default:
                   System.out.println("Was not 1 or 2");
                   break;
        }

        char charValue = 'f';
        switch(charValue){
            case 'a':
                System.out.println("'a' was found");
                break;
            case 'b':
                System.out.println("'b' was found");
                break;
            case 'c':case 'd':case 'e':
                System.out.println(charValue + " was found");
                break;
                default:
                    System.out.println("Not found");
                    break;
        }

        String month = "JaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "november":
                System.out.println("Nov");
                break;
                default:
                    System.out.println("Not sure");
        }

        printDayOfTheWeek(-5);

        System.out.println(isLeapYear(-1024));
        System.out.println(getDaysInMonth(2,2018));

        //for Statement
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("***********");

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int countPrime = 0;
        for (int i = 1; i < 20; i++){
            if (isPrime(i)){
                countPrime++;
                System.out.println(i + " is a prime number");
                if (countPrime == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("number " + i + " is found");
            }
                if (count == 5){
                    System.out.println("Exiting loop");
                    break;
                }
        }
        System.out.println("Sum of the numbers = " + sum);

        //while Loop
        count = 0;
        while (count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i=0; i < 5; i++){
            System.out.println("Count value is " + i);
        }

        count = 0;
        while (true){
            if (count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 5);

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("**********");
        number = 4;
        sum = 0;
        count = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);

            count++;
            sum += number;
            if (count >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found " + count);
        System.out.println("Sum of " + count + " even numbers = " + sum);


        System.out.println("**********");

        number = 0;
        while (number < 15){
            number++;

            if (number <= 5){
                System.out.println("Skipping number " + number);
                continue;
            }
            System.out.println("number = " + number);

            if (number >= 10){
                System.out.println("Breaking at " + number);
                break;
            }
        }

        System.out.println("**********");
        System.out.println(sumDigits(125));

    }

    //Challenge
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){

        //if(month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    case 2:
                        if (isLeapYear(year)) {
                            return 29;
                        } else {
                            return 28;
                        }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return 30;
                    default: return -1;
                }
        }
    }

    //for Statement
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; /*i <= n/2*/ i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    //while Loop
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }


    public static int sumDigits(int number){
        if (number >= 10 && number >= 0){
            int sum = 0;
            int leastSignificant = number % 10;
            number = number / 10;
            while(leastSignificant != 0) {
                sum += leastSignificant;
                if (number % 10 != 0){
                    leastSignificant = number % 10;
                    number = number / 10;
                    continue;
                }
                if (number < 10){
                    break;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

}
