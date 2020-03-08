public class HomeAlarm {
	private Status mode;
	
	public HomeAlarm() {
		mode = Status.SAFE; //Upon creation of object, the mode will default to safe
	}
	
	public void setModeSafe() { //Will only be called upon button press from Monitor
		mode = Status.SAFE;
	}
	
	public void setModeGuard() { //Will only be called upon button press from Monitor
		mode = Status.GUARD;
	}
	
	public void setModeWarning() { //Will only be called from actionNeeded()
		mode = Status.WARNING;
	}
	
	public void setModeEmergency() { //Will only be called from actionNeeded()
		mode = Status.EMERGENCY;
	}
	
	public void checkCODetector(CODetector detector) {
		detector.alarmStatus();
		detector.getStatusLocation();
		//Add the data to a linked list of type identifierString, bool, locationString
		
	}
	
	public void checkWindowDoorSensor(WindDoorSensor sensor) {
		sensor.alarmStatus();
		sensor.getStatusLocation();
		//Add the data to a linked list of type identifierString, bool, locationString
	}
	
	public void checkSmokeAlarm(SmokeAlarm alarm) {
		alarm.alarmStatus();
		alarm.getStatusLocation();
		//Add the data to a linked list of type identifierString, bool, locationString
	}
	
	public void checkMotionSensor(MotionSensor sensor) {
		sensor.alarmStatus();
		sensor.getStatusLocation();
		//Add the data to a linked list of type identifierString, bool, locationString
	}
	
	public void getStatusLocation(){
		
	}
	
	public void sendStatusLocation() {
		
	}
	
	public void actionNeeded() {
		checkCODetector();
		checkWindowDoorSensor();
		checkSmokeAlarm();
		checkMotionSensor();
		
		//Check linked list for any bool true
		// If so, check conditions
			// then execute appropriate set function
		
		//Send results to monitor
			//If necessary, sendStatusLocation() for sensor that was triggered
		
	}
}
