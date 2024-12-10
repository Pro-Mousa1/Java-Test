import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Q1.
        System.out.println("The numbers are: ");
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }

//        Q2.
        int sum=0;
        for (int i=1; i <=10; i++) {
            sum+=i;
        }
        System.out.println("The sum of the numbers is: "+sum);

//        Q3.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num=input.nextInt();

        System.out.println("Multiplication Table for "+num+" :");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+ " x " +i+ " = " +(num*i));
        }

//        Q4.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =input.nextInt();

        long factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }
        System.out.println("Factorial of "+number+" is "+factorial);
        input.close();

//        Q5.
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        double power;

        power=Math.pow(a,b);
        System.out.println(a+" raised to the power of "+b+" is: "+power);

//         Alt2
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the base number");
        double base = input.nextDouble();
        System.out.println("Enter the exponent");
        int exponent = input.nextInt();
        double result=1;
        for (int i=0; i<Math.abs(exponent); i++) {
            result*=base;
        }
        if (exponent<0) {
            result=1/result;
        }
        System.out.println("Result "+result);

//        Q6.
//        Alternative 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number at least 2");
        int a=input.nextInt();
        int reverse=0,lastDigit;
        for (a=a;a>0;a=a/10) {
            lastDigit=a%10;
            reverse=reverse*10+lastDigit;
        }
        System.out.println("The reverse is "+reverse);

//        Alternative 2
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.printf("Number is %d\n",number);
        String num = String.valueOf(number);
        int [] reverse = new int[num.length()];
        int count=0;
        while (true){
            reverse[count]=number%10;
            number = number/10;
            count++;
            if (num.length()==count) {
                break;
            }
        }
        System.out.print("Reverse is   ");
        for (int element:reverse) {
            System.out.println(element);
        }

//          Alternative 3
          Scanner input =new Scanner(System.in);
          System.out.println("Enter a number");
          int number = input.nextInt();
          int reverse=0;
          while (number!=0){
              int digit = number%10;
              reverse=reverse*10+digit;
              number/=10;
          }
        System.out.println("Reverse of the number: "+reverse);

//        Q7.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers you wish to enter");
        int count=input.nextInt();
        int sumEven=0;
        int sumOdd=0;

        for (int i=0;i<count;i++) {
            System.out.print("Enter the integer #" +(i + 1)+": ");
            int num = input.nextInt();
            if (num % 2==0) {
                sumEven+=num;
            }else {
                sumOdd+=num;
            }
        }
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd numbers: "+sumOdd);

//        Q8.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = input.nextInt();

        boolean isPrime = true;

        if (num <0) {
            isPrime = false;
        }else{
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                if (num%2==0) {
                    isPrime =false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }

//        Q9.
        Scanner input = new Scanner(System.in);
        char continueOperation;
        do {
            System.out.println("Enter the first number");
            int num1 = input.nextInt();
            System.out.println("Enter the second number");
            int num2 = input.nextInt();

            int sum = num1+num2;
            System.out.println("The sum of the numbers is "+sum);
            System.out.println("Do you want to perform another operation? (Y/N): ");
            continueOperation = input.next().charAt(0);
        }while(continueOperation=='Y' || continueOperation=='y');

//        Q10.
        Scanner input = new Scanner(System.in);
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        char continueInput;
        do {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number>0) {
                positiveCount++;
            } else if (number<0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
            System.out.println("Number of positive numbers "+positiveCount);
            System.out.println();
            System.out.println("Number of negative numbers "+negativeCount);
            System.out.println();
            System.out.println("Number of zero numbers "+zeroCount);
            System.out.println();
            System.out.println("Do you want to enter another number (Y/N)? ");
            continueInput = input.next().charAt(0);
        }while (continueInput=='Y'||continueInput=='y');

//        Q11.
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        char continueOperation;
        do {
            System.out.println("Enter the number");
            int num = input.nextInt();

            if (num>largest) {
                largest=num;
            }
            if (num<smallest) {
                smallest=num;
            }
            System.out.println("The largest number is "+largest);
            System.out.println();
            System.out.println("The smallest number is "+smallest);
            System.out.println();
            System.out.println("Do you want to continue with the operation (Y/N)? ");
            continueOperation = input.next().charAt(0);
        }while (continueOperation=='Y' || continueOperation=='y');

//        Q12.
//        (i);
        int a = 10;
        for (int row = 1; row <=a-6; row++) {
            for (int col = 1; col<=a; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        (ii);
        int a = 6;
        for (int row = 1; row <=a; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        (iii);
        int a = 6;
        for (int row = 1; row <=a; row++) {
            for (int col = row; col <=a; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        (iv);
        int a = 6;
        for (int row = 1; row <=a; row++) {
            for (int col = row; col <=a; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        (v);
        int a = 6;
        for (int row = 1; row <=a; row++) {
            for (int col = row; col <=a; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <=row-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        (vi);
        int a = 5;
        for (int row = 1; row <=a; row++) {
            for (int col = row; col <=a; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(row);
            }
            for (int col = 1; col <=row-1 ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
//        (vii);
        int a = 5;
        for (int row = 1; row <=a; row++) {
            for (int col = a; col <=row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            for (int col = 1; col <=row-1 ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}