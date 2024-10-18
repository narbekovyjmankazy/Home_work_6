public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(999);
        boss.setDamage(55);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Katana");
        boss.setWeapon(bossWeapon);
        boss.bossInfo();

        Skeleton firstSkeleton = new Skeleton();
        firstSkeleton.setArrows(10);
        firstSkeleton.setDamage(30);
        firstSkeleton.setHealth(1000);
        Weapon skeletonWeapon = new Weapon(WeaponType.GUN, "Bow");
        firstSkeleton.setWeapon(skeletonWeapon);

        Skeleton secondSkeleton = new Skeleton();
        secondSkeleton.setArrows(20);
        secondSkeleton.setDamage(20);
        secondSkeleton.setHealth(800);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.GUN, "Bow");
        secondSkeleton.setWeapon(skeletonWeapon2);

        secondSkeleton.bossInfo();
        firstSkeleton.bossInfo();


    }
}