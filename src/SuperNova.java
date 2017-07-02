import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public class SuperNova  extends Star
{
	
	protected Date peakBrillianceDate;
	 public enum SuperNovaType{I,II,III,IV,V};
	 public SuperNovaType superNova;
	
	@Override
	public String getCelestialClassification() {
		// TODO Auto-generated method stub
		return "Super Nova Star";
	}
	 public SuperNova(String commonName, String constellationDesignation, SpectralType type, double apparentMagnitude,
				double absoluteMagnitude, LY distanceFromTheSun, String[] planets,String peakBrillianceDate,SolarMass relativeMass,SuperNovaType superNova)throws ParseException 
	 {
			super(commonName, constellationDesignation, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets,relativeMass);
			 this.commonName = commonName;
		        
	          SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	          Date date = d.parse(peakBrillianceDate);
	          this.peakBrillianceDate = date;
	          this.superNova=superNova;
		}


	public SuperNovaType getSuperNova() {
		return superNova;
	}
	public void setSuperNova(SuperNovaType superNova) {
		this.superNova = superNova;
	}
	public String getFactualSummary()
	{
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		// TODO Auto-generated method stub
		return super.getFactualSummary()+"Spectral Type = "+Star.SpectralType.B+"\nSuper Nova Type = "+getSuperNova()+"\nPeak Brilliance Date = "+d.format(peakBrillianceDate);
	}
	
}
