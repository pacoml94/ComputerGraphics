package presentation;

import domain.TObject;
import domain.TVertex;

public class Extrude {

	private TObject obj;
	
	public Extrude(TObject obj) {
		this.obj = obj;
	}
	
	public TObject extrusion(float d) {
		for (int i = 0; i < obj.getVertexes().size(); i+=2) {
			float x, y, z;
			x = obj.getVertexes().get(i).getX()*d;
			y = obj.getVertexes().get(i).getY()*d;
			z = obj.getVertexes().get(i).getZ()*d;
			TVertex vertex = new TVertex(x, y, z);
			obj.getVertexes().add(vertex);
		}
		
		return this.obj;
	}
	
}
