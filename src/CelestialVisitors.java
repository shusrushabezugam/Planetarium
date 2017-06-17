import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public class CelestialVisitors extends AstroEntity implements CelestialVisitor
{
	protected boolean isPredictable;
	protected Date lastAppeared;
	protected Date nextAppears;
	
	public Date lastAppearedOn()
	{
		return lastAppeared;
	}
	public Date nextAppearsOn()
	{
		return nextAppears;
	}
	public boolean isPredictable()
	{
		return isPredictable;
	}
	
	public  String getFactualSummary()
	{
		//SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        
		return "\n"+super.getFactualSummary()+ "\nCelestial Classification = " +getCelestialClassification()+"\nIs predictable = "+isPredictable()+"\nDate Last Appeared = "+d.format(lastAppearedOn())+"\nDate Next Appears = "+d.format(nextAppearsOn());
	}
	public  String getCelestialClassification()
	{
		return "Celestial Visitors";
	}
	  public CelestialVisitors(String commonName, boolean isPredictable, String lastAppeared, String nextAppears) throws ParseException {
          this.commonName = commonName;
          this.isPredictable = isPredictable;
          SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
          Date date = d.parse(lastAppeared);
          this.lastAppeared = date;
          date = d.parse(nextAppears);
          this.nextAppears =date;
          
      }
	
}
