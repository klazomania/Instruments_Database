public class Bass extends Guitar {
	
	private String bassType;	
	

	public Bass( int volume, int weight, boolean readyToPlay, String color, String BrandName,
			int numberOfStrings, String type, int numberOfFrets, String basstype) {
		super(volume, weight, readyToPlay, color, BrandName, numberOfStrings, type, numberOfFrets);
		setBassType(bassType);		
	}

	public String getBassType() {
		return bassType;
	}

	public void setBassType(String bassType) {
		this.bassType = bassType;
	}		

}
