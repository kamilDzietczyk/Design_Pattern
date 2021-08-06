package com.company;

public abstract class ChesePiece {

    private String name;
    private int numberPosition;
    private String letterPosition;
    private Color color;

    public ChesePiece(String name, int numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch(color.toLowerCase())
        {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
