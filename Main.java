import java.awt.geom.Area;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//    /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//two numbers , takes two numbers as input*/
////        System.out.println("Enter first number:");
////        int number1 = input.nextInt();
////        System.out.println("Enter second number:");
////        int number2 = input.nextInt();
////        System.out.println(number1+"+"+number2+"="+(number1+number2));
////        System.out.println(number1+"-"+number2+"="+(number1-number2));
////        System.out.println(number1+"*"+number2+"="+(number1*number2));
////        System.out.println(number1+"/"+number2+"="+(number1/number2));
////        System.out.println(number1+" mod "+number2+"="+(number1%number2));
////        /*2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
////Test Data:*/
////        System.out.println("Input number:");
////        int num = input.nextInt();
////        for (int i = 1; i <=10 ; i++) {
////            System.out.println(num+"*"+i+"="+ num*i);
////        }
////        /*3. Write a Java program to print the area and perimeter of a circle.*/
////        double radius = 7.5;
////        double perimeter = 2 * Math.PI * radius;
////        double area = Math.PI * radius * radius;
////        System.out.println("Radius="+radius );
////        System.out.println("Perimeter is= "+perimeter);
////        System.out.println("Area is= "+area);
////        /*4. Java program to find out the average of a set of integers*/
////        System.out.println("Enter the count of numbers:");
////        double score=0;
////       double num2 =0;
////       double sum=0;
////       while (score != -1){
////           System.out.println("Enter an integer:");
////           score=input.nextDouble();
////           sum+=score;
////           num2++;
////       }
////        System.out.println("The average is:"+ (sum/num2));
//       /*5. Write a Java program that accepts three integers as input, adds the first two integers
//together, and then determines whether the sum is equal to the third integer.*/
////        int sum=0;
////        System.out.println("Input the first number: ");
////        int first = input.nextInt();
////        System.out.println("Input the second number: ");
////        int second = input.nextInt();
////        System.out.println("Input the third number: ");
////        int third = input.nextInt();
////        sum=first+second;
////        boolean test=(sum==third);
////        System.out.println("The result is: "+test);
////        /*Write a Java program to reverse a word.*/
////        String word="dsaf";
////        System.out.println("Input a word:"+word);
////        String z = "";
////        char c;
////        for (int i = 0; i < word.length(); i++) {
////            c = word.charAt(i);
////            z = c + z;
////        }
////        System.out.println("Reverse word: "+z);
//        /*7 - Java program to check whether the given number is even or odd*/
////        System.out.println("Enter a number:");
////        int n = input.nextInt();
////        if (n % 2 == 0) {
////            System.out.println("The number is Even");
////        }else{
////            System.out.println("The number is Odd");
////        }
//        /*8 - Java program to convert the temperature in Centigrade to Fahrenheit*/
////        System.out.println("Enter temperature in Centigrade:");
////        double temperature = input.nextDouble();
////        double fahrenheit=0;
////        System.out.print("Temperature in Fahrenheit is: ");
////        System.out.println(((fahrenheit *9)/5)+32);
//        /*9.Write a Java program that takes a string and a number from the user,then prints the
//character in the given index*/
////        System.out.println("Input a string: ");
////        String s = input.nextLine();
////        System.out.println("Input a number: ");
////        int n = input.nextInt();
////        char c =0;
////        for (int i = 0; i <= s.length(); i++) {
////             c = s.charAt(i);
////        }
////        System.out.println(c);
//        /*10. Write a Java program to print the area and perimeter of a rectangle*/
////        System.out.print("Width= ");
////        float width=input.nextFloat();
////        System.out.print("Height= ");
////        float height=input.nextFloat();
////        System.out.print("Area is "+width+"*"+height+"=");
////        float area=width*height;
////        System.out.println(area);
////        System.out.print("Perimeter is 2 "+"*"+(width+"+"+height)+"=");
////        float perimeter=2*(width+height);
////        System.out.println(perimeter);
//        /*11. Write a Java program to compare two numbers.*/
////        System.out.println("Input first integer:");
////        int a = input.nextInt();
////        System.out.println("Input second integer:");
////        int b = input.nextInt();
////            System.out.println(a+"!="+b);
////            System.out.println(a+"<"+b);
////            System.out.println(a+"<="+b);
//        /*12. Write a Java program to convert seconds to hours, minutes and seconds.*/
////        System.out.print("Input seconds: ");
////        int seconds =input.nextInt();
////        int S=seconds%60;
////        int H=seconds/60;
////        int M=H%60;
////        H = H/60;
////        System.out.print(H + ":" + M + ":" + S);
//        /*13. Write a Java program that accepts four integers from the user and prints equal if all
//four are equal, and not equal otherwise*/
////        System.out.println("Input first number:");
////        int f1 = input.nextInt();
////        System.out.println("Input second number:");
////        int f2 = input.nextInt();
////        System.out.println("Input third number:");
////        int f3 = input.nextInt();
////        System.out.println("Input fourth number:");
////        int f4 = input.nextInt();
////        if (f1 == f2 && f2 == f3 && f3 == f4){
////            System.out.println("Numbers are equal");
////        }else{
////            System.out.println("Numbers are not equal!");
////        }
//        /*14. Write a Java program that reads an integer and check whether it is negative, zero,or positive.*/
////        System.out.println("Input a number:");
////        int value = input.nextInt();
////        int positive = 0;
////        int negative = 0;
////        int zero= 0;
////            if (value>0){
////              positive++;
////              System.out.println("Number is positive");
////            }else if (value<0){
////                negative++;
////                System.out.println("Number is negative");
////            }else{
////                zero++;
////                System.out.println("Number is zero");
////            }
//        /*15.Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered*/
////        int P = 0;
////        int N = 0;
////        int Z = 0;
////        String choice="y";
////        while (choice.equalsIgnoreCase("y")) {
////            System.out.println("please enter numbers: ");
////            int num3 = input.nextInt();
////            if (num3 > 0) {
////                P++;
////            } else if (num3 < 0) {
////                N++;
////            }else{
////                Z++;
////            }
////            System.out.println("you want to complete? Y or N: ");
////             choice =input.next();
////        }
////        System.out.println(P+ " positives");
////        System.out.println(N+ " negatives");
////        System.out.println(Z+ " zero");
//
//        /*16 - Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed.*/
////        System.out.println("Enter the Digits:");
////        int number = input.nextInt();
////        int reverse=0;
////        while (number != 0) {
////            int digit = number % 10;
////           reverse = reverse*10 + digit;
////           number = number / 10;
////        }
////        System.out.println("The Reversed number is: " + reverse);
//
//        /*17 - Write a program to enter the numbers till the user wants and at the end the program
//should display the largest and smallest numbers entered.*/
////        int small=0;
////        int large=0;
////        int num;
////        System.out.println("Enter the number :");
////        int y = input.nextInt();
////        for(int i=0; i<y ;i++){
////            System.out.println("Enter the number :");
////         num = input.nextInt();
////         if(num > large){
////             large=num;
////         }else if(num < small){
////             small=num;
////         }
////        }
////        System.out.println("The Large number :" + large);
////        System.out.println("The Small number:" + small);
//
//        /*18 - Determine and print the number of times the character ‘a’ appears in the input
//entered by the user.*/
////        System.out.println("Enter String: ");
////        String s = input.nextLine();
////        char c = 0;
////        int z=0;
////        for (int i = 0; i < s.length(); i++) {
////            if (s.charAt(i)==c) {
////              z++;
////            }
////
////        }
////        System.out.println("Numbers of a is: " + z );


    }
}
