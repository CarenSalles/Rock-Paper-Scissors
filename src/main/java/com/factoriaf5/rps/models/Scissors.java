package com.factoriaf5.rps.models;

public class Scissors extends Figure {

    private final String type;

    public Scissors() {
        this.type = "Scissors"; // cuando nazca simpre es "Scissors".
    }

    public Object getType() {
        return type;
    }
}
