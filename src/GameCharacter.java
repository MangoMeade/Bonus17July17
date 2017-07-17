/**
 * Created by aibar on 7/17/2017.
 */
//Blueprint for creating game character objects and parent class of Warrior, MagicUingCharacter and Wizard
public class GameCharacter {
    public String name;
    public int strength;
    public int intelligence;

    public GameCharacter() {

    }
    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String Play() {
        GameCharacter gameCharc = new GameCharacter();
        return name + " " + strength + " "  + intelligence;
    }
}
