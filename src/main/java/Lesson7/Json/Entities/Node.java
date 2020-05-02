package Lesson7.Json.Entities;

public class Node <T> {
    public T value;
    public String description;

    public Node(T value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", description='" + description + '\'' +
                '}';
    }

}
