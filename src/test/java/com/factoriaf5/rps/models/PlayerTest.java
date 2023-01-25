package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Los testes poden tener atributos y constructores
public class PlayerTest {
    //creando los atributos jugadores.
    private Player player1; 
    // private Player player2;

 // Creando el constructor.
    public PlayerTest(){
        //Inicializando o instanciando(crear objeto) para cada jugador.
        this.player1 = new Player();
        // this.player2 = new Player();
    }

    @Test
    public void test_is_a_Paper() {
       Figure paper = new Paper();
       assertTrue(paper instanceof Paper); //significa que el objeto rock es instancia de la class Rock.
       assertEquals("Paper", paper.getType());
       // si espera que se tenga um  método getType() que devolve que es de tipo string ("Rock").
    }
    
    // Neste test el juegador tiene que elegir una figura.
    @Test
    public void test_Player_can_choose_Rock(){

        //Given - no necesito pq ya tengo arriba los juegadores como atributos.

        //When - objeto Rock tine que elegir una roca.
        Figure rock = player1.choose("Rock");

        //Then
        assertTrue(rock instanceof Rock); 
        // Si  rock és un objeto de la Clase Rock será verdadero.
        assertEquals("Rock", rock.getType()); 
        // Obtengamos "Rock" cuando llamamos el tipo del objeto que hemos instanciado.
        


    }

    @Test
    public void test_Player_can_choose_Paper(){
        Figure paper = player1.choose("Paper");
        // assertTrue(paper instanceof Paper);
        assertEquals("Paper", paper.getType());

    }
}



