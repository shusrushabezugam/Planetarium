
public abstract class AstroEntity 
{
public String commonName;
public abstract String getCelestialClassification();



public AstroEntity() {
}



public String getCommonName() {
	return commonName;
}



public void setCommonName(String commonName) {
	this.commonName = commonName;
}

public String getFactualSummary()
{
	return "helloFromAs";
	
}
}


