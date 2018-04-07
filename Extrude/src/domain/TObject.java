package domain;

import java.util.List;

public class TObject {
	
	private String name;
	private List<TVertex> vertexes;
	private List<TFace> faces;
	
	public TObject(String name, List<TVertex> vertexes, List<TFace> faces) {
		this.name = name;
		this.vertexes = vertexes;
		this.faces = faces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TVertex> getVertexes() {
		return vertexes;
	}

	public void setVertexes(List<TVertex> vertexes) {
		this.vertexes = vertexes;
	}

	public List<TFace> getFaces() {
		return faces;
	}

	public void setFaces(List<TFace> faces) {
		this.faces = faces;
	}

	@Override
	public String toString() {
		return "TObject [name=" + name + ", \nvertexes=" + vertexes + ", \nfaces=" + faces + "]";
	}
	
}
