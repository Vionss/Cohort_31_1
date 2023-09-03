package ait.computer.model;

import java.util.Objects;

public class Computer {

    private String processor;
    private int RAM;
    private String VideoCard;

    public Computer(String processor, int RAM, String videoCard) {
        this.processor = processor;
        this.RAM = RAM;
        VideoCard = videoCard;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRAM() {
        return RAM;
    }
    public String getVideoCard() {
        return VideoCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", RAM=" + RAM +
                ", VideoCard='" + VideoCard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor);
    }
    @Override
    public int hashCode() {
        return processor != null ? processor.hashCode() : 0;
    }
}
