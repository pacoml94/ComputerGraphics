package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import domain.TFace;
import domain.TObject;
import domain.TVertex;
import utils.IOClass;

public class QuanticeOBJ {

	public static void main(String[] args) {
		try {
			Management m = new Management();
			System.out.println(m.getModelo().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
