public class Hobbit extends Friend {

    boolean hasRing;
    Ring ring;

    public Hobbit() {
    }

    public Hobbit(Ring ring) {
        this.ring = ring;
        this.hasRing = true;
    }

    public Hobbit(int healthPoint, int attackPoint, String name, boolean isDead) {
        super(healthPoint, attackPoint, name, isDead);
    }

    public Hobbit(int healthPoint, int attackPoint, String name, boolean isDead, Ring ring) {
        super(healthPoint, attackPoint, name, isDead);
        this.ring = ring;
        this.hasRing = true;
    }

    public Ring getRing() {
        if (hasRing) {
            return ring;
        }
        System.out.println("This character has no ring!");
        return null;
    }


    public void setRing(Ring ring) {
        this.ring = ring;
        this.hasRing = true;
        System.out.println(this.getName() + " NOW HAS THE RING!");
    }

    public void resetRing() {
        this.ring = null;
        this.hasRing = false;
        System.out.println(this.getName() + " NOW LOST THE RING!");
    }

    public void attack(Enemy enemy) {
        if (this.hasRing) {
            System.out.println(this.getName() + " attacks with power of the RING!");
            this.setAttackPoint(this.getRing().ringPower);
        }
        super.attack(enemy);
    }
}
