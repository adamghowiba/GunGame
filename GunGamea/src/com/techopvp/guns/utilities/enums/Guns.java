package com.techopvp.guns.utilities.enums;

import com.techopvp.guns.guns.AK47;
import com.techopvp.guns.guns.Colt45;
import com.techopvp.guns.guns.UZI;
import com.techopvp.guns.managers.Gun;

public enum Guns {
		
	COLT45(new Colt45()),
	AK47(new AK47()),
	UZI(new UZI());
	
	Gun gun;
	
	private Guns(Gun gun) {
		this.gun = gun;		
	}
	
	/**
	 * Get a gun's options, and gun information.
	 * 
	 * @return gun - Gun options
	 */
	
	public Gun getGun() {
		return gun;
	}

}
