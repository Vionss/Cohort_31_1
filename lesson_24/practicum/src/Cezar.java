public class Cezar {
    /*
    Код Цезаря

     Это код, когда каждая буква в письме заменяется буквой на n  позиций впереди в алфавите
     Например, если n = 5
      с -> h
      z -> e
      Нужно написать метод, реализующий код цезаря. Строка состоит  только из маленьких букв английского алфавита,
          без пробелов

      public static String code(String code)
     */

    public static String cezar (String code, int move){
        String coded = "";
        int lastCharValue = 'z'; // 122
        int alphabetLenght = 'z' - 'a'+1;  // a= 97;

        for(char character: coded.toCharArray()){
            int charNoRotation = character + move;

            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLenght;
            coded +=(char) charValue;
        }
        return coded;

    }
}
