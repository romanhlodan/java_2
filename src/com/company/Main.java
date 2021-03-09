package com.company;

import java.util.Scanner;

public class Main {
    static int cash = 5000;
    public static void main(String[] args) {

//----1 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом while
//int [] arr = {2,17,13,6,22,31,45,66,100,-18};
//int i=0;
//while (i<arr.length){
//    System.out.print(arr[i] + " ");
//    i++;
//}

//----2 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for
//        int [] arr = {2,17,13,6,22,31,45,66,100,-18};
//        for (int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }

//-----3 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та: Перебрати його циклом while та вивести числа тільки з непарним індексом
//int [] arr = {2,17,13,6,22,31,45,66,100,-18};
//int i = 0;
//while(i<arr.length){
//    if (i%2==1){
//        System.out.print(arr[i]+" ");
//    }
//    i++;
//}

//----4 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for та вивести числа тільки з непарним індексом
//        int [] arr1 = {2,17,13,6,22,31,45,66,100,-18};
//        for (int j =0;j<arr.length;j++){
//            if (j%2==1){
//                System.out.print(arr1[j]+" ");
//            }
//        }

//-----5 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та: Перебрати його циклом while та вивести числа тільки парні  значення
//        int [] arr = {2,17,13,6,22,31,45,66,100,-18};
//        int i=0;
//        while(i<arr.length) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//            i++;
//        }
//-----6 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for та вивести числа тільки парні значення
//    int [] arr1 = {2,17,13,6,22,31,45,66,100,-18};
//    for (int j = 0; j<arr1.length;j++){
//        if (arr1[j]%2==0){
//            System.out.print(arr1[j] + " ");
//        }
//    }

//-----7 Створити пустий масив та заповнити його 50 парними числами.
//       int [] arr = new int[50];
//        Random r = new Random();
//        for (int i = 0; i<arr.length;i++){
//            arr[i] = r.nextInt(100);
//            if (arr[i]%2==0){
//                System.out.print(arr[i] + " ");
//            }
//        }

//----8 Створити пустий масив та заповнити його 50 непарними числами.
//       int [] arr = new int[50];
//        Random r = new Random();
//        for (int i=0;i<arr.length;i++){
//            arr[i]=r.nextInt(100);
//            if (arr[i]%2==1){
//                System.out.print(arr[i] + " ");
//            }
//        }


//9---Імітуємо роботу банкомату. Є рахунок та дії над ним
//1. Етап логінації - ввести логін + пароль
//2 Меню :
//а) Подивитись стан рахунку : виводить стан рахунку
//б) Зняти кошти (ввести кількість коштів,
//+ дивитись над тим щоб не залазити в борг)
//в) покласти кошти (ви вводите скільки коштів потрібно покласти)
//г) вихід
//д) продовжити роботу
//Якщо ви не обираєте " продовжити роботу" тоді вам пропонують все пройти наново.
        Log();
    }
    public static void Log(){
        System.out.println("Введіть логін і пароль");
        Scanner s = new Scanner(System.in);
        String log = s.nextLine();
        String pass= s.nextLine();
        if (log.equals("admin") && pass.equals("admin")){
            Menu();
        }else {
            Log();
        }
    }

    public static void Menu(){
        System.out.println("а)Подивитись стан рахунку");
        System.out.println("b)Зняти гроші");
        System.out.println("c)покласти гроші");
        System.out.println("d)вихід");
        System.out.println("e)продовжити роботу");

        Scanner s = new Scanner(System.in);

        switch (s.nextLine()){
            case "a":
                Rahunok();
                break;
            case "b":
                Cesh();
                break;
            case "c":
                Plus();
                break;
            case "d":
                Exit();
                break;
            case "e":
                Reply();
                break;
        }
    }

    public static void Rahunok(){
        System.out.println(cash + "грн.");
        Menu();
    }

    public static void Cesh(){
        System.out.println("Вкажіть потрібну суму...");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        if (c>cash){
            System.out.println("Недостатньо грошей. На твому рахунку " + cash);
            Cesh();
        }
        cash=cash-c;
        Menu();
    }

    public static int Plus(){
        System.out.println("Внесіть кошти");
        Scanner s = new Scanner(System.in);
        int hrn = s.nextInt();
        cash= cash+hrn;
        System.out.println("Ви внесли "+ hrn);
        Menu();
        return cash;
    }

    public static void Exit(){
        Log();
    }

    public static void Reply(){
        System.out.println("Продовжити роботу натисніть 1");
        System.out.println("Завершити натисніть любу кнопку");
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        if (q==1){
            Menu();
        }else {
            Log();
        }
    }
}
