package org.example.Players;

public abstract class PlayerImpl implements Player {

    private String name;
    private String position;
    private String number;

    public PlayerImpl(String name, String position, String number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    @Override
    public void printPlayer() {
        System.out.printf("\n\n %20s %s (%s) %s", "\u2022", getName(), getPosition(), getNumber());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
