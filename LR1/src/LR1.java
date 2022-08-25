/**
 * <p>Визанчає з заданої N кількості чисел ряду Фібоанчі чсила, які є квадратами</p>
 * <p>M не більше 47</p>
 * <p>Наприкалд, щоб перевірити перші 10 чисел ряду, треба задати N=10</p>
 *
 * @param fiba Обєкт числа ряду Фібоначі (6(Порядковий номер), 5(число в ряді))
 * @param isSquare Функція перевірки на квадратичність числа
 * @param input введення N від користувача
 * @param makeArr заповнює масив на N-кількість чисел ряду Фібоначі (масив, кількість)
 */


import java.util.Scanner;
import java.lang.Math;

public class LR1 {

    public static boolean isSquare(int number){
        return (int) Math.sqrt(number) * (int) Math.sqrt(number) == number;
    }

    public static class fiba{
        private int nomer;
        private int znach;

        public fiba(int nom, int zna){
            this.nomer=nom;
            this.znach=zna;
        }

        public int getNomer() {
            return this.nomer;
        }
        public int getZnach(){
            return this.znach;
        }
    }

    public static int input(){
        System.out.print("Input 'N':");
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        return N;
    }

    public static void makeArr(fiba array[], int Ncount){
        for (int i = 2; i < Ncount; ++i) {
            array[i]= new fiba (0,0);
            array[i].znach= array[i-1].znach + array[i-2].znach;
            array[i].nomer=i;
        }
    }

    public static void main(String[] args){

        int Ncount=input();

        fiba[] array = new fiba[Ncount];
        array[0]=new fiba(0,0);
        array[1]=new fiba(1,1);

        makeArr(array, Ncount);

        for (int i = 0; i < Ncount; ++i) {
            System.out.print(array[i].znach+" ");
        }

        System.out.println("\nFrom N Fibonachi numbers this are squares:");
        for (int i = 1; i < Ncount; i++){
            if (isSquare(array[i].znach)){
                System.out.print(array[i].znach + " ");
            }
        }
    }
}
