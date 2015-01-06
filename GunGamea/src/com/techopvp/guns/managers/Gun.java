package com.techopvp.guns.managers;

import com.techopvp.guns.utilities.enums.GunType;

public class Gun {
	
	private String gunName;
	private GunType type;
	private int power, range, id;
	
	public Gun(String gunName, int power, int range, int id, GunType type) {
		this.gunName = gunName;	
		this.power = power;
		this.range = range;
		this.id = id;
		this.type = type;
	}
	
	public String getGunName() {
		return gunName;
	}
	
	public int getGunPower() {
		return power;
	}
	
	public int getGunRange() {
		return range;
	}
	
	public int getGunID() {
		return id;
	}
	
	public GunType getGunType() {
		return type;
	}

}
