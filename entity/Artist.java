package com.entity;
import java.time.LocalDate;
public class Artist {
	private int artistId;
	private String name;
	private String biography;
	private LocalDate birthDate;
	private String nationality;
	private String website;
	private String contactInformation;
	
	public Artist(int artistId,String name,String bio,LocalDate date,String nation,String web,String contact) {
		this.artistId = artistId;
		this.name = name;
		this.biography = bio;
		this.birthDate = date;
		this.nationality = nation;
		this.website = web;
		this.contactInformation = contact;
	}
	
	
	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

}
