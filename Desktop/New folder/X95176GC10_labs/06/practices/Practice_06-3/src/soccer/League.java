
package soccer;

public class League {

    public static void main(String[] args) {
        League theLeague = new League();
        //creat team method
         Team []teams =  theLeague.creatTeams();
         Game theGames[] = theLeague.createGames(teams);
                           
        
         Game currGame = theGames[0];
        currGame.playGame();
        System.out.println(currGame.getDescription());

    }

    private Team [] creatTeams() {
       
           Team team1 = new Team();
        //team1
        team1.teamName= "Reds";
        team1.playerArray = new Player[3];
        team1.playerArray[0]= new Player();
        team1.playerArray[0].playerName="Robert Smith";
        team1.playerArray[1]= new Player();
        team1.playerArray[1].playerName="Rashford Marcus";
        team1.playerArray[2]= new Player();
        team1.playerArray[2].playerName="Rooney Wayne";
        
        //team2
        Team team2 = new Team();
        team2.teamName="Greens";
        team2.playerArray= new Player[3];
        team2.playerArray[0]=new Player();
        team2.playerArray[0].playerName="George Best";
        team2.playerArray[1]= new Player();
        team2.playerArray[1].playerName="Gray Demaray";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName="Gill David";
        
       Team []  theTeams ={team1,team2};
        
        return theTeams;
    }

    private Game[] createGames(Team[] teams) {
              Game theGame = new Game();
              theGame.homeTeam = teams[0];
              theGame.awayTeam = teams[1];
              Game [] games = {theGame};
              return games;
             
    }
    
}
