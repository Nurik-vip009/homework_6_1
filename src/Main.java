public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD,"Excalibur");
        Boss boss = new Boss("Evil Boss", 100, 10, bossWeapon);
        System.out.println(boss.printInfo());

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Longbow");
        Skeleton skeleton1 = new Skeleton("Skeleton Archer", 50, 5, skeletonWeapon1, 20);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.KNIFE, "Sharp Knife");
        Skeleton skeleton2 = new Skeleton("Skeleton Warrior", 80, 7, skeletonWeapon2, 0);

        System.out.println("\n" + skeleton1.printInfo());
        System.out.println("\n" + skeleton2.printInfo());
    }
}