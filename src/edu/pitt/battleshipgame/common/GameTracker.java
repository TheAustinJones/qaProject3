package edu.pitt.battleshipgame.common;

import java.util.ArrayList;
import java.util.List;

import edu.pitt.battleshipgame.common.board.Board;
import edu.pitt.battleshipgame.common.board.Coordinate;
import edu.pitt.battleshipgame.common.ships.Ship;

public class GameTracker {
    public static final int MAX_PLAYERS = 2;
    private int registeredPlayers = 0;
    private ArrayList<Board> gameBoards;
    private Coordinate feedback; //The last player's attack to happen
    private GameState state = GameState.INIT;
    private int playerTurn = 0;
    Object lock;
    private boolean quit = false;
    
    public GameTracker() {
        // Exists to protect this object from direct instantiation
        lock = new Object();
        gameBoards = new ArrayList<Board>(MAX_PLAYERS);
        System.out.println("Server constructed.");
    }

    /*
     * Returns -1 if the player cannot be registered for any reason
     */
    public int registerPlayer() {
	if(registeredPlayers > MAX_PLAYERS){
		System.out.println("Attempted to register more than 2 players for a game!");
		return -1;
	}
        synchronized(lock) {
            registeredPlayers++;
            gameBoards.add(new Board("Player " + (registeredPlayers - 1) + " board"));
        }
	if(registeredPlayers == MAX_PLAYERS){
	    state=GameState.PLACEING;
	}
        return registeredPlayers - 1;
    }

    public void wait(int playerID) {
        switch (state) {
            case INIT:
            {
                System.out.println("Player " + playerID + " is waiting for other players");
                while(registeredPlayers < MAX_PLAYERS) {
                    try {
                        Thread.yield();
                    } catch (InterruptedException e) {
                        System.err.println(e + " I can't yield!");
                    }
                }
                state = GameState.PLAYING;
                break;
            }
            case PLAYING:
            {
                while(playerTurn != playerID) {
                    try {
                        Thread.yield();
                    } catch (InterruptedException e) {
                        System.err.println(e + " I can't yield!");
                    }
                }
                break;
            }
            default:
                break;
        }
    }
    
    public List<Board> getBoards() {
        return gameBoards;
    }

    public int getTurn(){
	return playerTurn;
    }

    //Gets the other player's ID equivalent to playerID == 1?0:1
    public int getOtherPlayerId(int playerID){
	if(playerID == 1) return 0;
	else return 1;
    }

    //TODO:complete these
    public boolean canAttack(int playerID, Coordinate c){
	//Make sure it's our turn
	if(playerTurn != playerID) return false;
	return gameBoards.get(getOtherPlayerId(playerID)).canAttack(c);
    }

    public MoveResult doAttack(int playerID, Coordinate c){
	System.out.println("Called doAttack");
	if(!canAttack(playerID,c))
	    System.out.println("Player " + playerID + " was cheating! they tried to attack where they couldn't!");
	feedback = c;
	System.out.printf("After attack was performed, player's boards are:\nPlayer 0:\n%s\nPlayer 1:\n%s",gameBoards.get(0),gameBoards.get(1));
	playerTurn = getOtherPlayerId(playerTurn);
	return gameBoards.get(getOtherPlayerId(playerID)).doAttack(c);
    }

    public boolean canPlaceShipOnBoard(int playerID, Ship s){
	System.out.println("Called canPlaceShipOnBoard");
	return gameBoards.get(playerID).canShipFit(s);
    }

    public void placeShipOnBoard(int playerID, Ship s){
	System.out.println("Called placeShipOnBoard");

	//Make sure we can place the ship
	if(!canPlaceShipOnBoard(playerID,s))
		System.out.println("Player " + playerID + " was cheating! they tried to palce a ship where they couldn't!");
	gameBoards.get(playerID).addShip(s);

	//Check if we're done adding ships to the board
	if(gameBoards.get(0).getShipList().size() == 5 && gameBoards.get(1).getShipList().size() == 5){
	    System.out.println("Setting state to playing");
	    state = GameState.PLAYING;
	}

    }
    
    public void setBoards(ArrayList<Board> boards) {
        gameBoards = boards;
        playerTurn = (playerTurn + 1) % registeredPlayers;
	throw new IllegalArgumentException("Someone tried calling setBoards() instead of placeShipOnBoard() or doAttack()!");
    }

    public Coordinate getFeedback(){
	return feedback;
    }

    public GameState getState(){
	return state;
    }
    
    public boolean isGameOver() {
        System.out.println("Checking if the game is over...");
        if(this.quit){
            System.out.println("A player has quit. The game is over");
            return true;
        }
        for(Board board : gameBoards) {
            if(board.areAllShipsSunk()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean GameOver(String quit){
        if(quit.equalsIgnoreCase("quit")){
           // state = GameState.FIN;
            this.quit = true;
            return true;
        }
        return false;
    }
    
    public boolean getQuit(){
        return this.quit;
    }
    public void exit(){
        System.exit(0);
    }
}
