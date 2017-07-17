/**
 * Created by aibar on 7/17/2017.
 */
//child class of GameCharacter
public class Warrior extends GameCharacter{
    private String weaponType;

    public Warrior() {

    }
    public Warrior(String weaponType) {
        this.weaponType = weaponType;
    }

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String Play() {
        Warrior gameCharc = new Warrior();
        return name + " " + strength + " "  +
                intelligence + " " + weaponType;
    }
}
