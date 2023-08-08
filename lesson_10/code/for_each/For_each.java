package for_each;

public class For_each {
    public static void main(String[] args) {

        int ints[] = {2, 67,34,8};

        for( int i = 0; i < ints.length; i++){

            System.out.println(ints[i]);
        }

        // for-each loop ( enhanced for )

        System.out.println("Print elements with for-each");

        for (int num : ints){
            System.out.println(num);
        }

        /*
        Цикл for-each служит для перебора єлементов массива без указания индексов и длинны массива
        создается "итерационная переменная" num,
         в которую последовательно на каждом шаге цикла записівается очередное значение элемента
         */

        for ( int i = 0; i < 5; i++){

            if (i == 3 ){
                continue;
            }
            System.out.println(i);
        }

        // Break
        // если в программе в цикле встрачается слово break, то происходит выход из цикла и переход к команде,
        // следующей за циклом

        for (int i = 0; i< 100; i++){
            System.out.println(i);

            if ( i == 50){
                break;
            }
           // System.out.println(i);

        }
        System.out.println("Out of loop");


    }
}
