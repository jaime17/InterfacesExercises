/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jaime
 */
public class Studio {
     private List<Player> players;
    
    public Studio(){
        players = new LinkedList<>();
    }
    public void addPlayer(Player player){
        players.add(player);
    }
}
