public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Medic helped with Aspirine");

    }

    @Override
    public String superAbilityType(String superpower) {
        return "Medic superpower is " + superpower;
    }
}
