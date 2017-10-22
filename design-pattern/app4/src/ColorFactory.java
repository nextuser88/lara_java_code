public class ColorFactory extends AbstractFactory
{
	public Shape getShape(String shapeType)
	{
		return null;
	}
	Color getColor(String color)
	{
		if(color == null)
		{
			return null;
		}
		if(color.equalsIgnoreCase("GREEN"))
		{
			return new Green();
		}
		if(color.equalsIgnoreCase("RED"))
		{
			return new Red();
		}
		if(color.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}
		return null;
	}
}