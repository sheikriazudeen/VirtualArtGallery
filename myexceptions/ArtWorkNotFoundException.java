package com.myexceptions;

@SuppressWarnings("serial")
public class ArtWorkNotFoundException extends Exception {
	  public ArtWorkNotFoundException(String message) {
		    super(message);
		  }

		  public ArtWorkNotFoundException() {
		    super("Artwork not found!");
		  }
}
