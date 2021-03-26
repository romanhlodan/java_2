package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int cash = 5000;
    public static void main(String[] args) {

//----1 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом while
int [] arr = {2,17,13,6,22,31,45,66,100,-18};
int i=0;
while (i<arr.length){
    System.out.print(arr[i] + " ");
    i++;
}

//----2 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for
        int [] arr1 = {2,17,13,6,22,31,45,66,100,-18};
        for (int q = 0; q<arr1.length;q++){
            System.out.print(arr1[q]+ " ");
        }

//-----3 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та: Перебрати його циклом while та вивести числа тільки з непарним індексом
int [] arr2 = {2,17,13,6,22,31,45,66,100,-18};
int w = 0;
while(w<arr.length){
    if (w%2==1){
        System.out.print(arr[w]+" ");
    }
    w++;
}

//----4 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for та вивести числа тільки з непарним індексом
        int [] arr3 = {2,17,13,6,22,31,45,66,100,-18};
        for (int j =0;j<arr3.length;j++){
            if (j%2==1){
                System.out.print(arr3[j]+" ");
            }
        }

//-----5 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та: Перебрати його циклом while та вивести числа тільки парні  значення
        int [] arr4 = {2,17,13,6,22,31,45,66,100,-18};
        int e=0;
        while(e<arr.length) {
            if (arr4[e] % 2 == 0) {
                System.out.print(arr4[e] + " ");
            }
            e++;
        }

//-----6 Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та Перебрати його циклом for та вивести числа тільки парні значення
    int [] arr5 = {2,17,13,6,22,31,45,66,100,-18};
    for (int j = 0; j<arr5.length;j++){
        if (arr5[j]%2==0){
            System.out.print(arr5[j] + " ");
        }
    }

//-----7 Створити пустий масив та заповнити його 50 парними числами.
       int [] arr6 = new int[50];
        Random r = new Random();
        for (int t = 0; t<arr.length;t++){
            arr6[t] = r.nextInt(100);
            if (arr6[t]%2==0){
                System.out.print(arr6[t] + " ");
            }
        }

//----8 Створити пустий масив та заповнити його 50 непарними числами.
       int [] arr7 = new int[50];
        Random r1 = new Random();
        for (int y=0;y<arr.length;y++){
            arr7[y]=r1.nextInt(100);
            if (arr7[y]%2==1){
                System.out.print(arr7[y] + " ");
            }
        }


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
