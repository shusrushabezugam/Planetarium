import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
public class SuperNova  extends Star
{
	 protected Date peakBrillianceDate;
	 public enum SuperNovaType{I,II,III,IV,V};
	
	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "Super Nova Star";
	}

	@Override
	public String getFactualSummary()
	{
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		// TODO Auto-generated method stub
		return super.getFactualSummary()+"Spectral Type = "+Star.SpectralType.B+"\nSuper Nova Type = "+SuperNova.SuperNovaType.II+"\nPeak Brilliance Date = "+d.format(peakBrillianceDate);
	}
	public SuperNova(String commonName, SpectralType type, double apparentMagnitude, double absoluteMagnitude,
			double distanceFromTheSun, String[] planets,String peakBrillianceDate) throws ParseException {
		super(commonName, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets);
		
		// TODO Auto-generated constructor stub
		  this.commonName = commonName;
        
          SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
          Date date = d.parse(peakBrillianceDate);
          this.peakBrillianceDate = date;
	}
}
