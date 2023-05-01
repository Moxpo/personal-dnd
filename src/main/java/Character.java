import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Character(String name, int level, int strength, int dexterity, int constitution, int intelligence,
                     int wisdom, int charisma) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        saveCharacter();
    }

    private void saveCharacter() {
        String saveGameFile = "data.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(saveGameFile, true))) {
            String dataLine = String.format("%s,%d,%d,%d,%d,%d,%d,%d\n", name, level, strength, dexterity, constitution, intelligence, wisdom, charisma);
            bw.write(dataLine);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "Character " +
                "Name :" + name +
                ", Level :" + level +
                ", Strength :" + strength +
                ", Dexterity :" + dexterity +
                ", Constitution :" + constitution +
                ", Intelligence :" + intelligence +
                ", Wisdom :" + wisdom +
                ", Charisma :" + charisma
                ;
    }

    public int calculateAC(Modifier modifier) {
        int dexterityModifier = modifier.calculate(this.dexterity);
        int armorClass = 10 + dexterityModifier;
        // Add Armor bonus, Shield bonus, and other modifiers here, if necessary
        return armorClass;
    }



}
