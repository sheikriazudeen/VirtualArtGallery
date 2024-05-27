package com.dao;
import java.io.IOException;
import java.sql.SQLException;

import com.myexceptions.ArtWorkNotFoundException;
public interface GalleryController {

    public void addArtwork() throws ClassNotFoundException, IOException;

    public void updateArtwork();

    public void addArtworkToFavorite() throws SQLException;


    public void removeArtworkFromFavorite() throws ClassNotFoundException, SQLException, IOException;


    public void getUserFavoriteArtworks() throws SQLException, ClassNotFoundException, IOException;
    

    public void removeArtwork() throws ClassNotFoundException, SQLException, IOException;

    public void getArtworkById() throws SQLException;


    public void searchArtworks() throws SQLException, ArtWorkNotFoundException, ClassNotFoundException, IOException;
    


}
