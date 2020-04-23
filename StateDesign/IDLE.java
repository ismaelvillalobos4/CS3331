
public class IDLE implements RoverState{
	RoverMachine roverMachine;
	
	public IDLE(RoverMachine newRoverMachine) {
		roverMachine = newRoverMachine;
	}

	
	@Override
	public void PressRightOne() {
		System.out.println("Accelerating Forward");
		roverMachine.setRoverState(roverMachine.moveForwardAcc);
		
	}

	@Override
	public void PressRightTwo() {
		System.out.println("Nothing Happened!");
		
	}

	@Override
	public void HoldRight6() {
		System.out.println("Moving Forward Constant");
		roverMachine.setRoverState(roverMachine.moveForwardCons);
	}

	@Override
	public void PressLeftOne() {
		System.out.println("Nothing Happened!");
		
	}

	@Override
	public void HoldLeft6() {
		System.out.println("Accelerating Backward");
		roverMachine.setRoverState(roverMachine.moveBackAcc);
		
	}

	@Override
	public void LetSpeedZero() {
		System.out.println("Nothing Happened!");
		
	}

	@Override
	public void LeftRightSame() {
		System.out.println("Nothing Happened!");
		
	}


	
}
