
public class CODetector {
	private Boolean alarmStatus;
	private String locationInHouse;
	
	public CODetector(String locationArg) {
		locationInHouse = locationArg;
		alarmStatus = false;
	}
	
	public CODetector() {
		locationInHouse = "Unknown";
		alarmStatus = false;
	}
	
	public void setLocation(String locationArg) {
		locationInHouse = locationArg;
	}
	
	public int generateRandNum() {
		int temp = (int) ((Math.random() * ((10 - 1) + 1)) + 1);
		return temp;
	}
	
	public Boolean checkStatus() {
		int testNumber = generateRandNum();
		if (testNumber == 5) {
			alarmStatus = true;
		}
		
		if(alarmStatus == true) {
			alarmStatus = false; //reset alarm, we've already recorded it was triggered
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getStatusLocation() {
		return locationInHouse;
	}
	
}
