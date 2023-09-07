package test_performance;

import java.util.List;

public interface ListOperationsStrategy {

    void append(int nTimes);

    List getFillList(int length);

    void get(int nTimes, List list);
}
