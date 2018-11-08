import java.util.*;
/**
 * Created by Evan Brown
 * Edited last on 11/8/18
 * Written in BlueJ
 * 
 */
public class Club
{
    String teacherSponsor;
    ArrayList<Player> clubMembers = new ArrayList<Player>();
    public Club()
    {
        this.teacherSponsor = "asdfasdf";
        Player Bob = new Player("bob",10);
        this.clubMembers.add(Bob);
    }
    
    public Player[] getClubMembers(){
        Player[] Players = new Player[this.clubMembers.size()];
        for(int i = 0; i < this.clubMembers.size(); i++){
            Players[i] = this.clubMembers.get(i);
        }
        return Players;
    }
    
    public void addMember(Player newMember)
    {
        this.clubMembers.add(newMember);
    }
    
    public Player[] getRandomPlayers(int numOfPlayers)
    {
        shuffle();
        Player[] randPlayers = new Player[numOfPlayers];
        for(int i = 0; i < numOfPlayers; i++){
            randPlayers[i] = this.clubMembers.get(i);
        }
        return randPlayers;
    }
    
    public void shuffle()
    {
        Collections.shuffle(this.clubMembers);
    }
}
