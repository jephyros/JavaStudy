package com.company.backjoon.efjava;

/**
 * @author InSeok
 * Date : 2021-12-03
 * Remark :
 */
public class WeaponTest {
    public static void main(String[] args) {
        Weapon weaponBase = new WeaponBase();
        weaponBase = new WeaponTelescope(weaponBase);
        weaponBase = new WeaponGunstock(weaponBase);

        weaponBase.fire();

    }
}
