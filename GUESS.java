// WARNING: This file is auto-generated and any changes to it will be overwritten
import javax.swing.*;
import java.util.*;

/**
 * A guessing game
 */
public class GUESS
{
    private String playerName;
    private String gameChoice;
    private int randomNumber;
    private int guess;
    protected Random randomGenerator = new Random ( );

    /**
     * sets player name not null
     */
    public GUESS()
    {
        playerName = "";
    }

    /**
     * simple welcome
     */
    public void display_message()
    {
        System . out . println ( "Welcome to the Guessing game" );
    }

    /**
     * 
     */
    public void play_game()
    {
        /* 3.1       Display Menu*/
        System . out . println ( "Enter P for play and S for stop" );
        gameChoice = JOptionPane . showInputDialog ( "Enter choice now" );
        /* 3.2       If option is equal to play then*/
        if (gameChoice . equals ( "P" )) {
            /* 3.3                   Enter player name 3.4                   Generate random number 3.4.1   Computer generates a number between 1 and 50*/
            int randomNumber = randomGenerator . nextInt ( 50 ) + 1;
            /* 3.5                   While found equals false do 3.6                             enter lucky guess from player 3.7                             if guess equals random number then 3.8                                         set found to true 3.9                             else if guess is less than random number then 3.10                                        display a less than message 3.11                            else 3.12                                        display a more than message 3.13                            end if 3.14                end while 3.15                Display results 3.16    else*/
        }
        else {
            /* 3.17                quit game 3.18    end if*/
        }
    }

    /**
     * 
     */
    public void show_result()
    {
    }
}
