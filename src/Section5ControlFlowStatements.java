import java.util.Scanner;

public class Section5ControlFlowStatements {

    public static void main(String[] args) {

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
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'f';
        switch (charValue) {
            case 'a':
                System.out.println("'a' was found");
                break;
            case 'b':
                System.out.println("'b' was found");
                break;
            case 'c':
            case 'd':
            case 'e':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "JaNuary";
        switch (month.toLowerCase()) {
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
        System.out.println(getDaysInMonth(2, 2018));

        //for Statement
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("***********");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int countPrime = 0;
        for (int i = 1; i < 20; i++) {
            if (isPrime(i)) {
                countPrime++;
                System.out.println(i + " is a prime number");
                if (countPrime == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("number " + i + " is found");
            }
            if (count == 5) {
                System.out.println("Exiting loop");
                break;
            }
        }
        System.out.println("Sum of the numbers = " + sum);

        //while Loop
        count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Count value is " + i);
        }

        count = 0;
        while (true) {
            if (count == 5) {
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
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("**********");
        number = 4;
        sum = 0;
        count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            count++;
            sum += number;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found " + count);
        System.out.println("Sum of " + count + " even numbers = " + sum);


        System.out.println("**********");

        number = 0;
        while (number < 15) {
            number++;

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }
            System.out.println("number = " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }

        System.out.println("**********");
        System.out.println("Sum of the digits in number is " + sumDigits(20));

        System.out.println("**********");
        System.out.println(getGreatestCommonDivisor(1010, 10));

        System.out.println("**********");
        numberToWords(123);
        System.out.println("**********");

        numberToWords(1010);
        System.out.println("**********");

        numberToWords(100);
        System.out.println("**********");

        numberToWords(-12);
        System.out.println("**********");

        numberToWords(0);
        System.out.println("**********");


        System.out.println(reverse(-121)); //should  return -121
        System.out.println(reverse(1212)); //should return  2121
        System.out.println(reverse(1234)); //should return 4321
        System.out.println(reverse(100)); //should return 1

        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); //should return 3
        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number

        //Parsing values from a String
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);
        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number = " + number2);

        numberAsString += 1;
        number2 += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number2);
        System.out.println("***********");
        System.out.println(getLargestPrime(16));

        System.out.println("------------");
        printSquareStar(8);

/*        //Reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;
            if (age >=0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
*/
        //Reading user input challenge
  /*      Scanner scanner = new Scanner(System.in);
        int sumOfEnteredNumbers = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int enteredNumber = scanner.nextInt();
                sumOfEnteredNumbers += enteredNumber;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); //handle end of line (enter key)
        }
        System.out.println("Sum of entered numbers is " + sumOfEnteredNumbers);
        scanner.close();
   */
        //Reading user input min max challenge
        /*
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
//        int min = 0;
//        int max = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;
        while (true){
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int enteredNumber2 = scanner.nextInt();

//                if (first){
//                    first = false;
//                    min = enteredNumber2;
//                    max = enteredNumber2;
//                }

//                counter++;

                if (enteredNumber2 > max){
                    max = enteredNumber2;
                }
                if (enteredNumber2 < min){
                    min = enteredNumber2;
                }
//                if (counter == 4){
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min is " + min + ", max is " + max);
        scanner.close();
        */

        System.out.println("*********");
        System.out.println(getBucketCount(3.4, 2.1, 1.5,2));


    }

    //Challenge
    private static void printDayOfTheWeek(int day) {
        switch (day) {
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

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {

        //if(month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
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
                default:
                    return -1;
            }
        }
    }

    //for Statement
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; /*i <= n/2*/ i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //while Loop
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static int sumDigits2(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int leastSignificant = number % 10;
        number = number / 10;
        while (leastSignificant != 0) {
            sum += leastSignificant;
            if (number % 10 != 0) {
                leastSignificant = number % 10;
                number = number / 10;
                continue;
            }
            if (number < 10) {
                break;
            }
        }
        return sum;
    }


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;
            // drop the least-significant digit
            number = number / 10;
        }
        return sum;
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int divisor = 1;
        int maxDivisor = 0;

        while (first >= divisor && second >= divisor) {
            int dividedFirst = first % divisor;
            int dividedSecond = second % divisor;
            if (dividedFirst == 0 && dividedSecond == 0) {
                maxDivisor = divisor;
            }
            divisor++;
        }
        return maxDivisor;

    }

        /*Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
To print the number as words, follow these steps:
1. Extract the last digit of the given number using the remainder operator.
2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
 Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.
The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234,
 the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
The method reverse should have one int parameter and return the reversed number (int).
 For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
 The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
Example Input/Output - getDigitCount method
* getDigitCount(0); //should return 1 since there is only 1 digit
* getDigitCount(123); //should return 3
* getDigitCount(-12); //should return -1 since the parameter is negative
* getDigitCount(5200); //should return 4 since there are 4 digits in the number
Example Input/Output - reverse method
* reverse(-121); //should  return -121
* reverse(1212); //should return  2121
* reverse(1234); //should return 4321
* reverse(100); //should return 1
Example Input/Output - numberToWords method
* numberToWords(123); should print "One Two Three".
* numberToWords(1010); should print "One Zero One Zero".
* numberToWords(1000); should print "One Zero Zero Zero".
* numberToWords(-12); should print "Invalid Value" since the parameter is negative.
HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero".
 To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.
NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:
One
Two
Three
They don't have to be separated by a space.
NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
NOTE: In total, you have to write 3 methods.
NOTE: Do not add a main method to the solution code.
    * */

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int digitCountOriginalNum = getDigitCount(number);
            int digitCountReversedNum = getDigitCount(reversedNumber);

            while (reversedNumber >= 0) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber = reversedNumber / 10;

                if (reversedNumber == 0) {
                    break;
                }
            }
            while (digitCountOriginalNum != digitCountReversedNum) {
                //  int digitCountDifference = digitCountOriginalNum - digitCountReversedNum;
                System.out.println("Zero");
                digitCountReversedNum++;
            }
        }
    }

    public static int reverse(int number) {

        int newNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            newNumber = newNumber * 10;
            newNumber += lastDigit;
            number = number / 10;
        }

        return newNumber;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        while (number >= 0) {
            digitCount++;
            number = number / 10;
            if (number == 0) {
                break;
            }
        }
        return digitCount;
    }


    public static int getLargestPrime(int number) {

        if (number <= 0 || number == 1) {
            return -1;
        }

        int maxPrime = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                maxPrime = i;
                number = number / i;
                i--;
                if (number == 1) {
                    break;
                }

            }
        }
        return maxPrime;

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");
        } else {

            for (int row = 1; row <= number; row++) {

                for (int col = 1; col <= number; col++) {

                    if (row == 1 || row == number) {
                        System.out.print("*");
                    } else if (col == number || col == 1) {
                        System.out.print("*");
                    } else if (col == row) {
                        System.out.print("*");
                    } else if (col == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }

        }
    }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

            if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
                return -1;
            }

            double area = width * height;
            int bucketsNeeded =  (int) Math.round(area / areaPerBucket);
            //int buckets = Math.round(bucketsNeeded) - extraBuckets;
            return bucketsNeeded - extraBuckets;

        }


}
