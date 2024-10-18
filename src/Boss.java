public class Boss extends GameEntity{
    private  Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void bossInfo() {
        System.out.println("Урон босса =" + getDamage() + "  Жизнь босса =" + getHealth() + " Тип оружия = "+
                weapon.getWeaponType() + " Название оружия =" + weapon.getWeaponName());
    }
}
