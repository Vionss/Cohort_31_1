
import java.util.Random;
public class Massive {
    public static void main(String[] args) {

        /*
         task 1

         Собрать в массив данные о росте (или возрасте) членов группы.
         Выведите на печать максимальное и минимальное значение.
         */

        int[] ageArr = {27, 40, 31, 33, 21, 25, 63, 45, 29, 41};

        int i = 0;
        int min = ageArr[0];
        int max = 0;

        while(i < ageArr.length){
            if (ageArr[i] < min){
                min = ageArr[i];
            }
            if (ageArr[i] > max){
                max = ageArr[i];
            }
            i++;

        }
        System.out.println("The youngest student is " +min+ " and the oldest is "+max);



        // task 2

        // Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.

        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int i1 = 0;
        int max1 = array[0];
        int pointer = 0;

        while(i1 < array.length){
            if (array[i1] > max1) {
                max1 = array[i1];
                pointer = i1;
            }
            i1++;
        }
        System.out.println("The highest number is "+ max1+ ", Index: "+ pointer);

        // task 3

        //Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать.
        // Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

        int[] randomArray = new int[20];
        int a = 10;
        int b = 20;
        int i2 = 0;


        /*Random random = new Random(); // выдает рандомное число
        random.nextInt(100, 200);

        /* while (i2 < randomArray.length){
       randomArray[i2] = random.nextInt( 20 - 10 +1) + 10 // пример
        }
         */

        while (i2 < randomArray.length) {
            randomArray[i2] = (int) (Math.random()*(b - a +1) +a); // заполнение случайными числами
            System.out.print(randomArray[i2] + "  ");
            i2++;
        }

        int first = randomArray[0];
        randomArray[0]= randomArray[randomArray.length - 1];
        randomArray[randomArray.length - 1] = first;

        System.out.println();
        System.out.println("print swapped array");

        i2 = 0;

        while (i2 < randomArray.length){
            System.out.print(randomArray[i2]+ "  ");
            i2++;
        }




        // task 4











        // task 4

        //Создайте массив, содержащий в себе название карточных мастей.
        // Создайте массив, содержащий в себе карты от двойки до туза.
        // Раздайте из колоды по 6 карт на 4 игрока.

        /*String [] cardSuits = new String[4];

        cardSuits[0] = "clubs";
        cardSuits[1] = "diamonds";
        cardSuits[2] = "spades";
        cardSuits[3] = "hearts";

        String [] cards = new String[13];

        cards[0] = "two";
        cards[1] = "tree";
        cards[2] = "four";
        cards[3] = "five";
        cards[4] = "six";
        cards[5] = "seven";
        cards[6] = "eight";
        cards[7] = "nine";
        cards[8] = "ten";
        cards[9] = "jack";
        cards[10] = "queen";
        cards[11] = "king";
        cards[12] = "ace";

        String[] deck = new String[cards.length + cardSuits.length];

        System.out.println(cards.length);

         */




    }
}
