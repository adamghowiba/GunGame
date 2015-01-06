package com.techopvp.guns;

import com.techopvp.guns.utilities.GunUtils;
import com.techopvp.guns.utilities.enums.Guns;

public class GunGame {
	
	public static void main(String[] args) {
		GunUtils gun = new GunUtils();
			
		gun.shoot(Guns.COLT45);
	}

}
	