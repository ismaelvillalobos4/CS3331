
public class RoverMachine {
	RoverState idle;
	RoverState moveForwardAcc;
	RoverState moveForwardCons;
	RoverState decelerate;   
	RoverState moveBackAcc;
	RoverState moveBackCons;
	
	RoverState roverState;
	
	public RoverMachine() {
		idle = new IDLE(this);
		moveForwardAcc = new MoveForwardAcc(this);
		moveForwardCons = new MoveForwardCons(this);
		decelerate = new Decelerate(this);
		moveBackAcc = new MoveBackAcc(this);
		moveBackCons = new MoveBackCons(this);
		
		roverState = idle;
	}
	
	void setRoverState(RoverState newRoverState) {
		roverState = newRoverState;
	}
	
	void PressRightOne() {
		roverState.PressLeftOne();
	}
	
	void PressRightTwo() {
		roverState.PressRightTwo();
	}
	
	void HoldRight6() {
		roverState.HoldRight6();
	}
	
	void PressLeftOne() {
		roverState.PressLeftOne();
	}
	
	void HoldLeft6() {
		roverState.HoldLeft6();
	}
	
	void LetSpeedZero() {
		roverState.LetSpeedZero();
	}
	
	void LeftRightSame() {
		roverState.LeftRightSame();
	}
	

}
