/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mangaarchive.controlador;

import java.util.ArrayList;
import mangaarchive.modelo.AutorDAO;
import mangaarchive.modelo.MangaDAO;

/**
 *
 * @author Emilia
 */
public class Actualizacion {
    
    public boolean actualizarMangaBD(int id, String titulo, int precio, int anio, int autorID, int demografiaID, ArrayList<Integer> generos){
        return new MangaDAO().modificarManga(id,titulo,precio,anio,autorID,demografiaID,generos);
   }  
    
    public boolean actualizarAutorBD(int id, String nombre, int nacionalidadID){
        return new AutorDAO().modificarAutor(id,nombre,nacionalidadID);
   }  
    
}