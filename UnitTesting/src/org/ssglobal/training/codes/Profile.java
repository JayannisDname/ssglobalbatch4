package org.ssglobal.training.codes;

public class Profile {
	
	private String name;
	private Integer age;
	
	public Profile() {
		this.name = "";
		this.age = 18;
	}
	
	public Profile(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String showProfile() {
		return String.join(" ", name, String.valueOf(age));
	}
	
	public int increaseAge(int gradient) {
		return age + gradient;
	}
}
