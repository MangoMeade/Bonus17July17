import java.util.ArrayList;

/**
 * Created by aibar on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();

        gameCharacters.add(new Warrior("Maximus",50, 72, "Sword"));
        gameCharacters.add(new Warrior("Lokamus",61, 42, "Hammer"));
        gameCharacters.add(new Wizard("Garnonium",50, 72, 100, 3));
        gameCharacters.add(new Wizard("Tarankas",78, 85, 97, 7));
        gameCharacters.add(new Wizard("Aristokras",47, 88, 88, 9));


        for(GameCharacter gameChar : gameCharacters) {
            System.out.println(gameChar.Play());
        }
    }

}
