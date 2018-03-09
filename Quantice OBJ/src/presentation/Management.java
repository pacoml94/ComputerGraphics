package presentation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import domain.TFace;
import domain.TObject;
import domain.TVertex;
import utils.IOClass;

public class Management {
	
	private IOClass ioClass;
	private List<TVertex> vertexesList;
	private List<TFace> facesList;
	private TObject modelo;
	
	public Management() throws IOException {
		ioClass = new IOClass(new File("TEXTO.obj"));
		vertexesList = ioClass.getVertices();
		facesList = ioClass.getFaces();
		
		modelo = new TObject("Modelo1", vertexesList, facesList);
		modelo.setnVertexes(vertexesList.size());
		modelo.setnFaces(facesList.size());
	}
	
	public TObject getModelo() {
		return modelo;
	}
	
	public void run() {
		
	}
}
