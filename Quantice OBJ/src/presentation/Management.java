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
	private TObject model;
	
	public Management() throws IOException {
		ioClass = new IOClass(new File("TEXTO.obj"));
		vertexesList = ioClass.getVertices();
		facesList = ioClass.getFaces();
		
		model = new TObject("Modelo1", vertexesList, facesList);
		model.setnVertexes(vertexesList.size());
		model.setnFaces(facesList.size());
	}
	
	public TObject getModelo() {
		return model;
	}
	
	public void run() throws IOException {
		changeMaxMin();
	}
	
	public File saveModel() throws IOException {
		return ioClass.saveResults("NewObject", model);
	}
	
	private void changeMaxMin() {
		for(int index = 0; index < vertexesList.size(); index++) {
			if (this.model.getMax().compareTo(this.model.getVertexes().get(index).getX()) < 0) {
				this.model.setMax(this.model.getVertexes().get(index).getX());
			}
			
			if (this.model.getMax().compareTo(this.model.getVertexes().get(index).getY()) < 0) {
				this.model.setMax(this.model.getVertexes().get(index).getY());
			}
			
			if (this.model.getMax().compareTo(this.model.getVertexes().get(index).getZ()) < 0) {
				this.model.setMax(this.model.getVertexes().get(index).getZ());
			}
			
			if (this.model.getMin().compareTo(this.model.getVertexes().get(index).getX()) > 0) {
				this.model.setMin(this.model.getVertexes().get(index).getX());
			}
			
			if (this.model.getMin().compareTo(this.model.getVertexes().get(index).getY()) > 0) {
				this.model.setMin(this.model.getVertexes().get(index).getY());
			}
			
			if (this.model.getMin().compareTo(this.model.getVertexes().get(index).getZ()) > 0) {
				this.model.setMin(this.model.getVertexes().get(index).getZ());
			}
		}
	}

}
