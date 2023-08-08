package practicumMasive;

public class Marks {
    public static void main(String[] args) {

        // Имеются оценки абитуриента из его аттестата, всего 12 оценок.
        // Найдите средний балл абитуриента.

        // 1, 2, 3, 4, 5;  - так выглядят оценки

        int[] marksArr = {4, 5, 2, 1, 1, 3, 2, 5, 1, 1, 2, 1}; //  это примое заполнение масива прямо в коде

        int l = marksArr.length;
        System.out.println("Length of array is : " + l);

        // сложить все элементы массива и разделить их на его размер
        // организуем цикл while
        int sum = 0; // в эту переменную будем накапливать сумму
        int i = 0;  // это переменная для индекса, параметр цикла который мы будем изменять

        while (i < marksArr.length){  // пробегаем по всем елементам массива
            sum = sum + marksArr[i];  // накапливаем сумму значаний элементво в переменную
            i++;
        }

        double averageMark = (double) sum / (double) marksArr.length; // вычисляем средний бал
        System.out.printf("Avarage mark: %.2f" , averageMark);


    }
}
