
public class MoveBackCons implements RoverState {
	RoverMachine roverMachine;
	
	public MoveBackCons(RoverMachine newRoverMachine) {
		roverMachine = newRoverMachine;
	}

	//System.out.println("Accelerating Forward");
	//roverMachine.setRoverState(roverMachine.moveForwardAcc);

	//System.out.println("Nothing Happened!");
	
	@Override
	public void PressRightOne() {
		System.out.println("Decelerating");
		roverMachine.setRoverState(roverMachine.decelerate);
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
		System.out.println("Nothing Happened!");

	}

	@Override
	public void LeftRightSame() {
		System.out.println("Emergency Stop Activated");
		roverMachine.setRoverState(roverMachine.idle);
	}

}
