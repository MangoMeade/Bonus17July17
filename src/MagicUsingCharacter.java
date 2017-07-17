/**
 * Created by aibar on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {
    public int magicalEnergy;


    public MagicUsingCharacter() {

    }
    public MagicUsingCharacter(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public String toString() {
        return "MagicUsingCharacter{" +
                "magicalEnergy=" + magicalEnergy +
                '}';
    }

    @Override
    public String Play() {
        MagicUsingCharacter gameCharc = new MagicUsingCharacter();
        return name + " " + strength + " "  + intelligence + " " + magicalEnergy;
    }
}
