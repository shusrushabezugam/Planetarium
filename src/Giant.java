

public class Giant extends Star 
{	
	
	protected String constellationDesignation="Alpha Bootis";
	public enum Giantness{SUPER_GAINT,GAINT,SUB_GAINT}; 
	private Giantness giantness;

	@Override
	public String getCelestialClassification() {
		
		return "Gaint Star";
	}

	@Override
	public String getFactualSummary() 
	{
			
		return super.getFactualSummary()+"Spectral Type = " + getSpectralType()+"\n Gaintness = "+getGiantness();	
	}

	public Giant(String commonName, String constellationDesignation, SpectralType type, double apparentMagnitude,
			double absoluteMagnitude, LY distanceFromTheSun, String[] planets,Giantness giantness,SolarMass relativeMass) {
		super(commonName, constellationDesignation, type, apparentMagnitude, absoluteMagnitude, distanceFromTheSun, planets, relativeMass);
		this.giantness = giantness;
	
	}



	public Giantness getGiantness() {
		return giantness;
	}

	public void setGaintness(Giantness giantness) {
		this.giantness = giantness;
	}

	

	

}
