package org.example.treeset;

public class Color implements Comparable<Color>{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Color(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Color color) {
        return this.getColor().compareTo(color.getColor());
    }
}
