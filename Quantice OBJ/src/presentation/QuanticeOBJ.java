package presentation;

import java.io.File;
import java.io.IOException;

public class QuanticeOBJ {

	public static void main(String[] args) {
		try {
			Management m = new Management();
			m.run();
			File newModel = m.saveModel();
			File newQObject = m.saveQuanticeObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
