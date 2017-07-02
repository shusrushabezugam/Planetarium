
public abstract class AstroEntity 
{
public String commonName;
protected abstract String getCelestialClassification();

public AstroEntity() {
}

public AstroEntity(String commonName) {

	this.commonName = commonName;
}
 

public String getFactualSummary()
{
	return "Name = "+commonName;
	
}


}


