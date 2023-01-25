package com.factoriaf5.rps.models;

public class Paper extends Figure {

    private final String type;

    public Paper() {
        this.type = "Paper"; // cuando nazca siempre es "Rock".
    }

    public String getType() {
        return type;
    }

}
