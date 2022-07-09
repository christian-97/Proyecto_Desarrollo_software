package edu.pe.idat.app.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//clase servicio para 
//actualizar imagenes
@Service
public class UploadFileService {

	// una variable que guarda una ruta
	// para una imagen de un producto
	private String folder = "images//";

	// funcion que combierte a bytes las imagenes
	public String saveImage(MultipartFile file) throws IOException {

		// comprueba si la imagen existe para poder ser cargada
		// a la página
		if (!file.isEmpty()) {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(folder + file.getOriginalFilename());
			Files.write(path, bytes);
			return file.getOriginalFilename();
		}

		// si no existe imagen (else)
		return "default.jpg";
	}
	
	//funcion que elimina la imagen de un 
	//producto que fué borrado
	public void deleteImage(String nombre) {
		String ruta = "images//";
		File file = new File(ruta + nombre);
		file.delete();

	}

}
