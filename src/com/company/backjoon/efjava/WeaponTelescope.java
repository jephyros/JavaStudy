package com.company.backjoon.efjava;

/**
 * @author InSeok
 * Date : 2021-12-03
 * Remark :
 */
public class WeaponTelescope extends WeaponAccessory {

    private Weapon weapon;

    public WeaponTelescope(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fire() {
        System.out.println("망원경 조준하고");
        weapon.fire();
    }
}
