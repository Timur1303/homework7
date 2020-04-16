public class Warrior extends Hero {

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior kicked with Sword");

    }

    @Override
    public String superAbilityType(String superpower) {
        return "Warrior superpower is " + superpower;
    }
}
