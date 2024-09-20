package se.edu.streamdemo.task;

public class Deadline extends Task {

    public Deadline(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "(Deadline: " + description + ')';
    }

}
