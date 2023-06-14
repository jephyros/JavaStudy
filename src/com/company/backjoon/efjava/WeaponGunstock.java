package com.company.backjoon.efjava;

/**
 * @author InSeok
 * Date : 2021-12-03
 * Remark :
 */
public class WeaponGunstock extends WeaponAccessory{
    private Weapon weapon;

    public WeaponGunstock(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fire() {
        System.out.println("견착하고");
        weapon.fire();

    }
}
