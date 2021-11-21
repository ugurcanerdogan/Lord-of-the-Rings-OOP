public class WarZone {
    public static void main(String[] args) {

        Ring oneRing = new Ring();

        Hobbit hobbit1 = new Hobbit(100, 10, "Frodo", false);
        Hobbit hobbit2 = new Hobbit(100, 10, "Samwise", false);
        Wizard wizard = new Wizard(200, 25, "Gandalf", false);

        Friend[] friends = {hobbit1, hobbit2, wizard};

        Orc orc = new Orc(150, 20, "Gothmog", false);
        Demon demon = new Demon(400, 50, "Balrog", false);

        Enemy[] enemies = {orc, demon};

        hobbit1.attack(orc);
        hobbit2.attack(orc);
        wizard.attack(demon);
        wizard.attack(orc);

        orc.attack(hobbit1);
        demon.attack(wizard);

        hobbit2.attack(orc);
        wizard.attack(orc);

        hobbit1.setRing(oneRing);

        hobbit1.attack(orc);
        hobbit1.attack(demon);
        wizard.attack(demon);
    }
}
