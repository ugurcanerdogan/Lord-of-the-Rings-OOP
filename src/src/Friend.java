public class Friend {

    private int healthPoint;
    private int attackPoint;
    private String name;
    private boolean isDead;

    public Friend() {
        System.out.println(this.getName() + " is created!");
    }

    public Friend(int healthPoint, int attackPoint, String name, boolean isDead) {
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
        this.name = name;
        this.isDead = isDead;
        System.out.println(this.getName() + " is created!");
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;

        if (this.healthPoint <= 0) {
            this.healthPoint = 0;
            System.out.println(this.getName() + "'s health : " + this.getHealthPoint());
            this.setDead();
        } else {
            System.out.println(this.getName() + "'s health : " + this.getHealthPoint());
        }
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead() {
        System.out.println(this.getName() + " DIED!");
        isDead = true;
    }

    public void attack(Enemy enemy) {
        System.out.println(this.getName() + " has attacked : " + enemy.getName());
        if (!enemy.isDead()) {
            enemy.setHealthPoint(enemy.getHealthPoint() - this.getAttackPoint());
        } else {
            System.out.println(enemy.getName() + " is already dead!");
        }
    }
}
