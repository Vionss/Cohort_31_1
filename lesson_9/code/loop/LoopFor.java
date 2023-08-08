package loop;

public class LoopFor {
    public static void main(String[] args) {

        // Цикл For
        /*
        for(initialisation; condition; increment/decrement){

        statement(s)
        }
        initialisation      - присвоение начального значение переменной(счетчика), которая будет изменятся в цикле
        condition           - булиановское выражение, определяющее будет ли выполняться цикл
        increment/decrement - изменение счетчика

         */


        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        char exit = 'N';
        while (exit !='N'){

            System.out.println("hello");
        }

        for( int i = 100; i > -100; i-=5){
            System.out.println(i);
        }

        for ( int i =10; i < 5; i++){
            i++;
        }




    }
}
