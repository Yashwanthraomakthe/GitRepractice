package qaclickacademy;

import java.io.IOException;
import java.util.ArrayList;

public class dataDriverTestCase {

	public static void main(String[] args) throws IOException {
		dataDriven d = new dataDriven();
		ArrayList data=d.getData("Purchase");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
	}

}
