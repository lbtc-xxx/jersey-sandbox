package rest;

import java.util.Arrays;
import java.util.List;

public class MyEnclosedBean {

    public boolean isFine() {
        return true;
    }

    public List<String> getSub() {
        return Arrays.asList("a", "b");
    }
    public List<String> getSub1() {
        return Arrays.asList("a");
    }
}
