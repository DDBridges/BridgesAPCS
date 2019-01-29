class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;

	public static void main(String[] args) {

	}

	public static void toggleCruiseControl() {
        cruiseControlSet=!cruiseControlSet;
        if(!cruiseControlSet==false){
            System.out.println("Cruise Control Disabled.");
		}
        else{
            System.out.println("Cruise Control Enabled.");
			speed = 0;
        }

	}

	public static void accelerate() {
        if(!cruiseControlSet && (speed < MAX_SPEED)){
            speed += 5;
        }
	        System.out.println("Accelerated 5mph");
            reportSpeed();
    	    if(exceedsWarningThreshold(speed)){
				alert(false);
			}
    }
		
	public static void decelerate() {
		if(!cruiseControlSet && (speed <= MAX_SPEED)){
			speed-=5;
		}
		System.out.println("Decelerated 5 mph");
		reportSpeed();
		if(exceedsWarningThreshold(speed)){
			alert(true);
		}
	}

	public static void reportSpeed() {
		System.out.println("Current speed is:\t" + speed + "mph");
	}

	public static void alert(Boolean isDecelerating) {
		if(isDecelerating){
			System.out.println("Warning, current speed still exceeds warning threshold.");
		}
		else{
			System.out.println("Warning, current speed exceeds warning threshold.");
		}
		System.out.println("Your speed:\t\t" + speed + "mph/" + warningSpeed + "mph");
	}

	public static Boolean exceedsWarningThreshold(int speed) {
		return speed > warningSpeed;
	}
}