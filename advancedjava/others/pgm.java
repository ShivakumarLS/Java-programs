import java.util.Scanner;

// class Checker implements java.util.Comparator
// {
    

//     @Override
//     public int compare(Player a, Player b) {
//          if(a.score==b.score)
//         return a.name.compareTo(b.name);
//       return a.score-b.score;
//     }

   
// }


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class pgm {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        // Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
// 
        // Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
