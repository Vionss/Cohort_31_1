package ait.generic.util;

public class JsonWrapper2 <T> {
    private T value;

    public JsonWrapper2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public String toString() {
        return "{value: " + value + "}";
    }
}