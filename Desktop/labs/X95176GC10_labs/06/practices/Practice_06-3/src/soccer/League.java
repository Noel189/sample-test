
package soccer;

public class League {

    public static void main(String[] args) {
        //Team1 created below
        Team team1 = new Team();
        team1.team_name ="Reds";
          team1.players = new Player[3];
         team1.players[0]= new Player();
         team1.players[0].player_name="Robert James";
         team1.players[1] = new Player();
         team1.players[1].player_name="Rooney Wayne";
         team1.players[2] = new Player();
         team1.players[2].player_name="Rashford Marcus";
         //Team2 created below
         Team team2 = new Team();
         team2.team_name="Greens";
         team2.players = new Player[3];
         team2.players[0] = new Player();
         team2.players[0].player_name="George Best";
         team2.players[1]= new Player();
         team2.players[1].player_name="Giggs Ryan";
         team2.players[2]=new Player();
         team2.players[2].player_name="Gray Adams";
         //display the teams with the roster of the players
         System.out.println(team1.team_name+": ");
         for(Player myPlayer : team1.players){
             System.out.println(myPlayer.player_name);
         }
         System.out.println("");
         System.out.println(team2.team_name+": ");
         for(Player myPlayer : team2.players){
             System.out.println(myPlayer.player_name);
         }
         //Goals
         System.out.println("");
         System.out.println("Goals: ");
         System.out.printf("Goal scored after 12.0 mins by %s of the %s\n",team1.players[0].player_name,team1.team_name);
         System.out.printf("Goal scored after 23.0 mins by %s of the %s\n",team1.players[2].player_name,team1.team_name);
         System.out.printf("Goal scored after 55.0 mins by %s of the %s\n",team2.players[0].player_name,team2.team_name);
         
         System.out.println("");
         //Search for a player
            if(team2.players[1].player_name.contains("Gig")){
                System.out.println("Player found: "+team2.players[1].player_name);
            }
            
            System.out.println(" ");
            // print last name, first name of players
            int idx ;
            for(int i=0;i<team1.players.length;i++){
                idx = team1.players[i].player_name.indexOf(" ");
                String f_name = team1.players[i].player_name.substring(0, idx);
                String l_name = team1.players[i].player_name.substring(idx);
                System.out.println(l_name+", "+f_name);
            }
         
    }
    
}
