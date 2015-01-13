package com.techopvp.guns.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techopvp.guns.guns.AK47;
import com.techopvp.guns.guns.Colt45;
import com.techopvp.guns.managers.Gun;
import com.techopvp.guns.utilities.enums.GunType;
import com.techopvp.guns.utilities.enums.Guns;

public class GunUtils {

	ArrayList<Gun> guns = new ArrayList<Gun>();

	public GunUtils() {
		guns.add(new Colt45());
		guns.add(new AK47());
	}

	public List<String> getGunNames() {
		List<String> gunNames = new ArrayList<String>();
		for (Gun guns : guns) {
			gunNames.add(guns.getGunName());
		}
		return gunNames;
	}

	public String getGunsWType(GunType type) {
		List<String> gunList = new ArrayList<String>();
		for (Gun guns : guns) {
			if (type == guns.getGunType()) {
				gunList.add(guns.getGunName());
			}
		}
		if (gunList.isEmpty()) {
			return "There are no guns with the type " + type + ".";
		} else {
			return gunList.toString();
		}
	}

	public Gun getGun(Guns gun) {
		return gun.getGun();
	}

	public void shoot(Guns gun) {
		Random random = new Random();
		boolean hit = random.nextBoolean();
		
		System.out.println("You have fired a " + gun.getGun().getGunName() + " with the type " + gun.getGun().getGunType() 
				+ " it " + (hit ? "hit".toUpperCase() : "didn't hit".toUpperCase()) + " the target.");
	}

}
