package com.company;

public class Main {

    public static void main(String[] args) {

        ChesePiece blackPiece = new BlackPiece("blackPiece");
        ChesePiece whitePiece =  new WhitePiece("whitePiece");

        System.out.println(blackPiece.getColor() == whitePiece.getColor());


    }
}
