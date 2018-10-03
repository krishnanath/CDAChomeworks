public class Player {
    String handleName;
    int lives;
    int level;
    int score;

    public Player() {
        handleName ="Unknown Player";
        lives = 3;
        level = 1;
        score =0;
    }

}


public class Demo {
    public static void main(String[] args){
        Player tim = new Player();

        System.out.println(tim.handleName);
    }
}

