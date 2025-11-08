
public class Property {
	private int municipalityNumber; // kommunenr
	private String municipalityName; // kommunenavn
	private int lotNumber; // gnr (gårdsnummer)
	private int sectionNumber; // bnr (bruksnummer)
	private String name; // bruksnavn (may be null or empty)
	private double area; // area in m2
	private String ownerName; // owner name

	public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
									String name, double area, String ownerName) {
		this.municipalityNumber = municipalityNumber;
		this.municipalityName = municipalityName;
		this.lotNumber = lotNumber;
		this.sectionNumber = sectionNumber;
		this.name = (name == null) ? "" : name;
		this.area = area;
		this.ownerName = ownerName;
	}

	public int getMunicipalityNumber() {
		return municipalityNumber;
	}

	public String getMunicipalityName() {
		return municipalityName;
	}

	public int getLotNumber() {
		return lotNumber;
	}	

	public int getSectionNumber() {
		return sectionNumber;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public String getOwnerName() {
		return ownerName;
	}
}