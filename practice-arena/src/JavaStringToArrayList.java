import java.util.ArrayList;
import java.util.Arrays;
class  JavaStringToArrayList
{
	public static void main(String[] args) 
	{
		String strNumbers = "1,2,3,4,5,6,7,8,9";
		String[] strValues = strNumbers.split(",");
		ArrayList<String> aListNumbers = new ArrayList<String>(Arrays.asList(strValues));
		System.out.println("Java String converted to ArrayList as : " + aListNumbers);
	}
}
