package com.allbareun.web.entity;

import java.util.Date;

public class CertificationView extends Certification{
	
	private String profile;
	private String name;

	public CertificationView(int goalId, int id, String image, Date regDate, int userId) {
		super(goalId, id, image, regDate, userId);
	}
	
	
	

	public CertificationView(int goalId, int id, String image, Date regDate, int userId, String profile, String name) {
		super(goalId, id, image, regDate, userId);
		this.profile = profile;
		this.name = name;
	}


	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CertificationView [profile=" + profile + ", name=" + name + ", getProfile()=" + getProfile()
				+ ", getName()=" + getName() + ", getGoalId()=" + getGoalId() + ", getId()=" + getId() + ", getImage()="
				+ getImage() + ", getRegDate()=" + getRegDate() + ", getUserId()=" + getUserId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

	
}
