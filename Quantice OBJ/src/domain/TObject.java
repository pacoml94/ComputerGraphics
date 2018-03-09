package domain;

import java.math.BigDecimal;
import java.util.List;

public class TObject {
	
	private String name;
	private List<TVertex> vertexes;
	private List<TFace> faces;
	private int nVertexes, nFaces;
	private BigDecimal max, min;
	
	public TObject(String name, List<TVertex> vertexes, List<TFace> faces) {
		this.name = name;
		this.vertexes = vertexes;
		this.faces = faces;
		this.max = new BigDecimal(Integer.MIN_VALUE);
		this.min = new BigDecimal(Integer.MAX_VALUE);
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

	public int getnVertexes() {
		return nVertexes;
	}

	public void setnVertexes(int nVertexes) {
		this.nVertexes = nVertexes;
	}

	public int getnFaces() {
		return nFaces;
	}

	public void setnFaces(int nFaces) {
		this.nFaces = nFaces;
	}

	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "TObject [name=" + name + ", \nvertexes=" + vertexes + ", \nfaces=" + faces + ", \nnVertexes=" + nVertexes
				+ ", nFaces=" + nFaces + "\nmax=" + max + "\nmin=" + min + "]";
	}
	
}
