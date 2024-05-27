package com.entity;
import java.time.LocalDate;
import java.util.ArrayList;
public class User {
	private int userId;
	private String userName;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String profilePicture;
	private ArrayList<Integer> favoriteArtworks;
	
	
	public User() {
		
	}
	
	public User(int userId,String userName, String password, String email, String firstName, String lastName, 
			LocalDate dateOfBirth,String profilePicture, ArrayList<Integer> favoriteArtworks) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.profilePicture = profilePicture;
		this.favoriteArtworks = favoriteArtworks;
	}
	
	
	public ArrayList<Integer> getFavoriteArtworks() {
		return favoriteArtworks;
	}
	public void setFavoriteArtworks(ArrayList<Integer> favoriteArtworks) {
		this.favoriteArtworks = favoriteArtworks;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	public String toString() {
		return("User:\nUser Id: "+userId+"\nUser name: "+userName+"\nEmail: "+email+"\nFirst name: "+firstName+"\nLast name: "+lastName+
				"\nDate of Birth: "+dateOfBirth+"\nProfile: "+profilePicture+"\nFavorite Artworks: "+favoriteArtworks);
	}
}
