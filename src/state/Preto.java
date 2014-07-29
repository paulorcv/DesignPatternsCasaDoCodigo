package state;

import java.sql.Date;
import java.util.List;

public class Preto extends Cor {

	void assumiu(No no, List<No> list){
		list.add(no);
		System.out.println("Preto: " + no);
	}
	
}
