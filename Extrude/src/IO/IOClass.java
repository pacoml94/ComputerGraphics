package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.TFace;
import domain.TObject;
import domain.TVertex;

public class IOClass {

	private File f;
	private List<TVertex> listVertex;
	private List<TFace> listFaces;
	private TObject object;
	
	public IOClass(String pathname) throws IOException {
		this.f = new File(pathname);
		listVertex = new ArrayList<>();
		listFaces = new ArrayList<>();
		readData();
	}
	
	public List<TFace> getListFaces() {
		return listFaces;
	}
	
	public List<TVertex> getListVertex() {
		return listVertex;
	}
	
	private void readData() throws IOException {
		Scanner sc = new Scanner(this.f);
		
		while(sc.hasNext()) {
			String character = sc.next();
			switch (character) {
			case "v":
				String x, y, z;
				x = sc.next();
				y = sc.next();
				z = sc.next();
				listVertex.add(new TVertex(Float.parseFloat(x), Float.parseFloat(y), Float.parseFloat(z)));
				break;
			case "f":
				String v1, v2, v3;
				v1 = sc.next();
				v2 = sc.next();
				v3 = sc.next();
				listFaces.add(new TFace(Integer.parseInt(v1), Integer.parseInt(v2), Integer.parseInt(v3)));
				break;
			}
		}
	}
	
	public void setObject(TObject object) {
		this.object = object;
	}
	
	public File writeExtrudeData(String objectName) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(new File(objectName)));
		pw.println("# Blender v2.79 (sub 0) OBJ File: ''\n" + 
				"# www.blender.org\n" + 
				"o V_RF\n");
		
		for (int i = 0; i < object.getVertexes().size(); i++) {
			pw.println("v "+object.getVertexes().get(i).getX()+" "+object.getVertexes().get(i).getY()
					+" "+object.getVertexes().get(i).getZ());
		}
		
		pw.println("s off");
		
		for (int i = 0; i < object.getFaces().size(); i++) {
			pw.println("f "+object.getFaces().get(i).getV1()+" "+object.getFaces().get(i).getV2()+
					" "+object.getFaces().get(i).getV3());
		}
		
		pw.close();
		return new File(objectName);
	}
}
