package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.Calculate;

public class WeightList {
	
	public WeightList(){
		Calculate x1 = new Calculate();
		Calculate x2 = new Calculate();
		Calculate x3 = new Calculate();

		ArrayList<Calculate> weightlist = new ArrayList<Calculate>();

		weightlist.add(x1);
		weightlist.add(x2);
		weightlist.add(x3);
		}

}
