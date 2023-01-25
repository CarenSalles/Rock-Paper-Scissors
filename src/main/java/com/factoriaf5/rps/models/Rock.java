package com.factoriaf5.rps.models;

public class Rock extends Figure{


    private final String type;
    
     //Creando constructor del objeto type.
    public Rock() {
        this.type = "Rock"; // cuando nazca siempre es "Rock".
    }

    public String getType() {
        return type;
    }

}
