package com.factoriaf5.rps.models;

public class Player {

    public Figure choose(String string) {

        // Si string for igual a "Rock" ten que retornar un nuevo objeto Rock.

        if (string == "Rock") {
            return new Rock();

        }

        if (string == "Paper") {
            return new Paper();

        }

        if (string == "Scissors") {
            return new Scissors();

        }
        return null;
    }

}
