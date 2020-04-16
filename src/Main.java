public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        superpower(magic, "Terraria");
        superpower(medic, "Aspirine");
        superpower(warrior, "Sword");

        System.out.println("_____________________");


        Hero[] heroes = {magic, medic, warrior};
        for (Hero h : heroes) {
            h.applySuperAbility();

        }
    }


    public static void superpower(HavingSuperAbility s, String superpower) {
        System.out.println(s.superAbilityType(superpower));
    }

}
