package com.dao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.entity.Artwork;
import com.myexceptions.ArtWorkNotFoundException;

public interface IVirtualArtGallery {
	  boolean addArtwork(Artwork artwork) throws ClassNotFoundException, IOException;
	    
	  boolean updateArtwork(Artwork artwork);
	   
      boolean removeArtwork(int artworkId) throws ClassNotFoundException, SQLException, IOException;
	    
	 
	  Artwork getArtworkById(int artworkId) throws SQLException;
	    
	    List<Artwork> searchArtworks(String keyword) throws SQLException, ArtWorkNotFoundException, ClassNotFoundException, IOException;
	    
	    boolean addArtworkToFavorite(int userId, int artworkId) throws SQLException;
	 
	    boolean removeArtworkFromFavorite(int userId, int artworkId) throws SQLException;
	   
	    boolean getUserFavoriteArtworks(int userId) throws SQLException, ClassNotFoundException, IOException;

}
