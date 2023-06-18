public class Boss extends GameEntity {
    private Weapon weapon;
    public Boss(String name, int health, int level, Weapon weapon){
        super(name,health,level);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Name" + getName() + "\nHealth: " + getHealth() + "\nLevel" + getLevel() +
                "\nWeapon Type: " + weapon.getWeaponType() + "\nWeapon Name: " + weapon.getWeaponName();
    }
}
