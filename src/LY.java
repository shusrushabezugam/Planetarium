
public class LY 
{
	public double ly;
	public LY(double ly)
	{
	this.ly=ly;	
	}
	public LY toLY1()
	{
		LY lyObj = new LY(ly);
		return lyObj;
	}
	public static String getAstroUnit()
	{
		return "LY";
	}
}
