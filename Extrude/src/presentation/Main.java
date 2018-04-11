package presentation;

import java.io.IOException;
import java.util.List;

import IO.IOClass;
import domain.TFace;
import domain.TObject;
import domain.TVertex;

class Main {

	public static void main(String[] args) {
		try {
			IOClass io = new IOClass("plane.obj");
			List<TVertex> vertexes = io.getListVertex();
			List<TFace> faces = io.getListFaces();
			TObject object = new TObject("OBJECT", vertexes, faces);
			System.out.println(object.toString());
			System.out.println(object.getVertexes().size());
			Extrude e = new Extrude(object);
			object = e.extrusion(2);
			io.setObject(object);
			System.out.println();
			System.out.println(object.getVertexes().size());
			System.out.println(object.toString());
			io.writeExtrudeData("NewPlane.obj");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
