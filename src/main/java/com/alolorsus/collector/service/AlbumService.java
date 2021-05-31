package com.alolorsus.collector.service;

import org.springframework.data.domain.Page;

import com.alolorsus.collector.entity.Album;
import com.alolorsus.collector.entity.Carta;
import com.alolorsus.collector.entity.Usuario;

public interface AlbumService {
	
	// Albums
	
	public Page<Album> getAlbumsFromUser (Usuario usuario, Integer pagina);
	
	public Album getAlbum (Integer album_id);
	
	public Album crearAlbum (String nombre, Usuario usuario);
	
	public void eliminarAlbum (Integer album_id);
	
	// Cartas
	
	public Page<Carta> getCartasFromAlbum (Album album, Integer pagina);
	
	public Carta agregarCarta (String externalId, Integer album_id);
	
	public void eliminarCarta (Integer carta_id);

}