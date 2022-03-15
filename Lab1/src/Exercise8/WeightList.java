package Exercise8;
import java.util.ArrayList;
import java.util.Iterator;
import Exercise7.Calculate;
import Exercise7.Main;

public class WeightList {
	
	double[] EarthArr = new double[10];
	double[] MarsArr = new double[10];
	
	public WeightList()
	{}
	
	public double[] retEarth()
	{
		return EarthArr.clone();
	}
	
	public double[] retMars()
	{
		return MarsArr.clone();
	}
}
