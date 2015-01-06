package com.techopvp.guns.guns;

import com.techopvp.guns.managers.Gun;
import com.techopvp.guns.utilities.enums.GunType;

public class AK47 extends Gun {

	public AK47() {
		super("AK47", 15, 30, 1, GunType.ASSAULT);
	}
	
}
