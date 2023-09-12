package Hm312;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hm312 {

    public List<String> removeDuplicates(List<String> input){
        Set<String> res = new HashSet<>(input);
        return new ArrayList<>(res);
    }
}
