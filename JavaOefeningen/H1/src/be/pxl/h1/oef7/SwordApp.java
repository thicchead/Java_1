package be.pxl.h1.oef7;

public class SwordApp {
    public static void main(String[] args) {
        Sword woodenSword = new Sword();
        woodenSword.setMaterial("Wood");
        woodenSword.setDurability(33);

        Sword stoneSword = new Sword();
        stoneSword.setMaterial("Stone");
        stoneSword.setDurability(500);

        Sword diamondSword = new Sword();
        diamondSword.setMaterial("Diamond");
        diamondSword.setDurability(1500);

        Sword[] swordArray = {woodenSword, stoneSword, diamondSword};

        int highestDurability = 0;
        String bestSword = "";

        // beste zwaard bijhouden (plaats 0), itereren door array, als durability hoger is, beste zwaard naar die veranderen

        for (int i = 0; i < swordArray.length; i++) {
            int durability = swordArray[i].getDurability();
            String bestMaterial = swordArray[i].getMaterial();
            if (durability > highestDurability) {
                highestDurability = durability;
                bestSword = bestMaterial;
            }
        }
        System.out.println("Most durable sword is of " + bestSword);

        System.out.printf("|%10s|%15s|%n", "Materiaal", "Duurzaamheid");
        for (Sword sword : swordArray) {
            System.out.printf("|%10s|%15d|%n", sword.getMaterial(), sword.getDurability());
        }

    }
}
