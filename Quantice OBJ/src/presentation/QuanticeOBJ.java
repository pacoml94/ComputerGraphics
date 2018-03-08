package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import domain.TFace;
import domain.TVertex;
import utils.IOClass;

public class QuanticeOBJ {

	public static void main(String[] args) {
		try {
			IOClass ioClass = new IOClass(new File("TEXTO.obj"));
			List<TVertex> verticesList = ioClass.getVertices();
			List<TFace> facesList = ioClass.getFaces();
			System.out.println(verticesList.toString());
			for(TVertex vertex : verticesList) {
				BigDecimal add = new BigDecimal(2.0);
				vertex.setZ(vertex.getZ().add(add));
			}
			
			System.out.println(verticesList.toString());
			System.out.println(facesList.toString());
			
			System.out.println(facesList.toString());
			
			ioClass.saveResults("ObjetoNuevo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
