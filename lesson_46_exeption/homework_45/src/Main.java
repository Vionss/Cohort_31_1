import java.util.*;

public class Main {
    public static Map<Character, Character> pairToOpenBracket = Map.of(
            '(', ')',
            '[',']',
            '{','}'
    );

    public static Map<Character, Character> pairToCloseBracket = Map.of(
            ')', '(',
            ']','[',
            '}','{'
    );
    public static void main(String[] args) {
        /*
        Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {} )
        Написать метод (алноритм обсуждали в классе) который проверит прпвилтность расстановки скобок.

( {} [] ) -> true

( {} [ ) -> false

( } [] ) -> false

{ ( } [] ) -> falseДана строка - скобочная последовательность
( строка состоящая из скобок трех видов *() [] {} )

Написать метод (алноритм обсуждали в классе) который проверит прпвилтность расстановки скобок.

    ( {} [] ) -> true

    ( {} [ ) -> false

    ( } [] ) -> false

    { ( } [] ) -> false

        1. если openBracket - > push pair close Bracket
        2. если closeBracket - > сравниваем (pop)с вершиной стека
           если не совпало - return false
        3. check if stack empty
         */

        System.out.println(checkBrackets("()[]{}"));// true
        System.out.println(checkBrackets("{()[]}"));// true
        System.out.println(checkBrackets("([{}]"));// false
        System.out.println(checkBrackets("()[{]}"));// false
        System.out.println(checkBrackets("()[{]}"));// false
        System.out.println(checkBrackets(")("));// false
        System.out.println(checkBrackets("{{}"));// false
        System.out.println(checkBrackets(""));// true

    }

    public static boolean checkBrackets(String str){
        if(str == null)return false;
        if(str.isEmpty())return true;
        Deque<Character> stack = new LinkedList<>();

        for(char ch : str.toCharArray()){
            Character bracket = pairToOpenBracket.get(ch);
            if(bracket!=null){
                stack.push(bracket);
            }else if(pairToCloseBracket.containsKey(ch) && ((stack.isEmpty() || ch!=stack.pop())) ){
                        return false;
                }
        }
        return stack.isEmpty();
    }

    public static boolean checkBrackets2(String brecketStr){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c: brecketStr.toCharArray()) {
            if (brackets.containsValue(c)){
                stack.push(c);
            } else if (brackets.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
