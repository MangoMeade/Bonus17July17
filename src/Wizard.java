/**
 * Created by aibar on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellNumber;

    public Wizard() {

    }

    public Wizard(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public Wizard(int magicalEnergy, int spellNumber) {
        super(magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "spellNumber=" + spellNumber +
                '}';
    }

    @Override
    public String Play() {
        Wizard gameCharc = new Wizard();
        return name + " " + strength + " "  + intelligence + " " + magicalEnergy + spellNumber;
    }
}
