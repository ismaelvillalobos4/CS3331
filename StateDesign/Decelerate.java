
public class Decelerate implements RoverState{
	
	RoverMachine roverMachine;
	
	public Decelerate(RoverMachine newRoverMachine) {
		roverMachine = newRoverMachine;
	}

	//System.out.println("Accelerating Forward");
	//roverMachine.setRoverState(roverMachine.moveForwardAcc);

	//System.out.println("Nothing Happened!");
	
	@Override
	public void PressRightOne() {
		System.out.println("Nothing Happened!");
	}

	@Override
	public void PressRightTwo() {
		System.out.println("Nothing Happened!");
	}

	@Override
	public void HoldRight6() {
		System.out.println("Nothing Happened!");
	}

	@Override
	public void PressLeftOne() {
		System.out.println("Nothing Happened!");
		
	}

	@Override
	public void HoldLeft6() {
		System.out.println("Nothing Happened!");
	}

	@Override
	public void LetSpeedZero() {
		System.out.println("Slowing Down to Speed 0");
		roverMachine.setRoverState(roverMachine.idle);

	}

	@Override
	public void LeftRightSame() {
		System.out.println("Nothing Happened!");
	}


}
