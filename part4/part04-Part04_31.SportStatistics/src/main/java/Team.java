/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeferson
 */
public class Team {
    private String name;
    private int games;
    private int won;
    private int lost;
    
    public Team(String name) {
        this.name = name;
        this.games = 0;
        this.won = 0;
        this.lost = 0;
    }
    
    public void setGame() {
        this.games++;
    }
    
    public void setWin() {
        this.won++;
    }
    
    public void setLoss() {
        this.lost++;
    }
    
    public int getGames() {
        return this.games;
    }
    
    public int getWins() {
        return this.won;
    }
    
    public int getLosses() {
        return this.lost;
    }
    
    public String getName() {
        return this.name;
    }
}
