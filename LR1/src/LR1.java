/**
 * <p>Визанчає з заданої N кількості чисел ряду Фібоанчі чсила, які є квадратами</p>
 * <p>M не більше 47</p>
 * <p>Наприкалд, щоб перевірити перші 10 чисел ряду, треба задати N=10</p>
 *
 * @param Fiba Обєкт числа ряду Фібоначі (6(Порядковий номер), 5(число в ряді))
 * @param IsSquare Функція перевірки на квадратичність числа
 */


import java.util.Scanner;
import java.lang.Math;

public class LR1 {

    public static boolean IsSquare(int number){
        return (int) Math.sqrt(number) * (int) Math.sqrt(number) == number;
    }

    public static class Fiba{
        private int nomer;
        private int znach;

        public Fiba(int nom, int zna){
            this.nomer=nom;
            this.znach=zna;
        }

    }

    public static void main(String[] args){

        System.out.print("Input 'N':");
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        Fiba[] array = new Fiba[N];
        array[0]=new Fiba(0,0);
        array[1]=new Fiba(1,1);

        for (int i = 2; i < N; ++i) {
            array[i]= new Fiba (0,0);
            array[i].znach= array[i-1].znach + array[i-2].znach;
            array[i].nomer=i;
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(array[i].znach+" ");
        }

        System.out.println("\nFrom N Fibonachi numbers this are squares:");
        for (int i = 1; i < N; i++){
            if (IsSquare(array[i].znach)){
                System.out.print(array[i].znach + " ");
            }
        }

    }

}
