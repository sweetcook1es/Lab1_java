import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    //задание 1.2
    public int sumLastNums (int x){
        int last = Math.abs(x) % 10;
        int secondLast = (x / 10) % 10;
        return last + secondLast;
    }

    //задание 1.4
    public boolean isPositive (int x){
        return x >= 0;
    }

    //задание 1.6
    public boolean isUpperCase (char x){
        return x >= 'A' && x <= 'Z';
    }

    //задание 1.8
    public boolean isDivisor (int a, int b){
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    //задание 1.10
    public int lastNumSum(int a, int b){
        return (a % 10) + (b % 10);
    }

    //задание 2.2
    public double safeDiv (int x, int y){
        if (y == 0){
            return 0;
        }else{
            return (double) x / y;
        }
    }

    //задание 2.4
    public String makeDecision (int x, int y){
        if (x > y){
            return x + ">" + y;
        }else if (x < y){
            return x + "<" + y;
        }else{
            return x + "=" + y;
        }
    }

    //задание 2.6
    public boolean sum3 (int x, int y, int z){
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    //задание 2.8
    public String age (int x){
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        } else if (lastDigit == 1) {
            return x + " год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    //задание 2.10
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    //задание 3.2
    public String reverseListNums (int x){
        String result = "";
        for (int i = x; i >= 0; i--) {
            if (i != 0) {
                result += i + " ";
            } else {
                result += i;
            }
        }
        return result;
    }

    //задание 3.4
    public int pow (int x, int y){
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    //задание 3.6
    public boolean equalNum (int x){
        if (x < 10) {
            return true;
        }
        int lastDigit = x % 10;
        int temp = x / 10;
        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    //задание 3.8
    public void leftTriangle (int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //задание 3.10
    public void guessGame(){
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        int attempts = 0;
        int userGuess;
        System.out.println("Введите число от 0 до 9:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == secretNumber) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }
        System.out.println("Вы отгадали число за " + attempts + " попытки");
    }

    //задание 4.2
    public int findLast (int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //задание 4.4
    public int[]add (int[] arr, int x, int pos){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    //задание 4.6
    public void reverse (int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //задание 4.8
    public int[] concat (int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    //задание 4.10
    public int[] deleteNegative (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
