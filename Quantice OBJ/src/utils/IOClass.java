package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.TFace;
import domain.TObject;
import domain.TVertex;
import sun.security.provider.certpath.Vertex;

public class IOClass {

	private File f;
	private List<TVertex> vertex;
	private List<TFace> faces;

	public IOClass(File f) throws FileNotFoundException {
		this.f = f;
		this.vertex = new ArrayList<>();
		this.faces = new ArrayList<>();
		readData();
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public List<TVertex> getVertices() {
		return vertex;
	}

	public List<TFace> getFaces() {
		return faces;
	}

	private void readData() throws FileNotFoundException {
		Scanner sc = new Scanner(this.f);

		while (sc.hasNext()) {
			String wString = sc.next();
			if (!wString.equals("")) {
				switch (wString.charAt(0)) {
				case 'v':
					TVertex vertex = new TVertex(new BigDecimal(sc.next()), new BigDecimal(sc.next()), new BigDecimal(sc.next()));
					this.vertex.add(vertex);
					break;
				case 'f':
					TFace face = new TFace(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
					this.faces.add(face);
					break;
				}
				sc.nextLine();
			}
		}
	}
	
	public File saveObject(String pathname, TObject object) throws IOException {
		File file = new File(pathname+".obj");
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		
		pw.println("# Blender v2.79 (sub 0) OBJ File: ''\n" + 
				"# www.blender.org\n" + 
				"o V_RF");
		
		for(TVertex v : object.getVertexes()) {
			pw.println("v "+v.getX()+" "+v.getY()+" "+v.getZ());
		}
		
		pw.println("s off");
		for(TFace face : object.getFaces()) {
			pw.println("f "+face.getV1()+" "+face.getV2()+" "+face.getV3());
		}
		
		pw.close();
		return file;
	}
	
	public File saveQuanticeObject(String pathname, TObject object) throws IOException {
		File file = new File(pathname+".obj");
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		char dc;
		
		pw.println("# Blender v2.79 (sub 0) OBJ File: ''\n" + 
				"# www.blender.org\n" + 
				"o V_RF");
		
		pw.println(object.getName());
		pw.println(object.getnVertexes());
		pw.println(object.getnFaces());
		pw.println(object.getMax());
		pw.println(object.getMin());
		
		BigDecimal max = new BigDecimal(String.valueOf(object.getMax()));
		BigDecimal min = new BigDecimal(String.valueOf(object.getMin()));
		BigDecimal result = max.subtract(min);
		
		pw.println(result);
		
		for(TVertex vertex : object.getVertexes()) {
			BigDecimal x = vertex.getX();
			result = x.subtract(min).divide(object.getMax().subtract(object.getMin()),MathContext.DECIMAL64);
			pw.print(result+" ");
			BigDecimal y = vertex.getY();
			result = y.subtract(min).divide(object.getMax().subtract(object.getMin()),MathContext.DECIMAL64);
			pw.print(result+" ");
			BigDecimal z = vertex.getZ();
			result = z.subtract(min).divide(object.getMax().subtract(object.getMin()),MathContext.DECIMAL64);
			pw.print(result+" ");
			pw.println();
		}
		pw.println("s off");
		for(TFace face : object.getFaces()) {
			pw.print(face.getV1()+" ");
			pw.print(face.getV2()+" ");
			pw.print(face.getV3()+" ");
			pw.println();
		}
		
		pw.close();
		return file;
		
	}
}
