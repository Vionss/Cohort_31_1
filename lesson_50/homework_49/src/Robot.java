import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Robot {
    List<Command> list;

    public Robot(String comandsString){
        this.list = createComadndsList(comandsString);
    }

    private List<Command> createComadndsList(String comandsString) {

        Deque<Command> queue = new LinkedList<>();

        list = (LinkedList)queue;
    }
}
