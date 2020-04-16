public class Magic extends Hero {

    @Override
    public void applySuperAbility() {
        System.out.println("Magic destroyed with Terraria");

    }

    @Override
    public String superAbilityType(String superpower) {
        return "Magic superpower is " + superpower;
    }
}
