
public class MoveBackAcc implements RoverState {
	RoverMachine roverMachine;
	
	public MoveBackAcc(RoverMachine newRoverMachine) {
		roverMachine = newRoverMachine;
	}

	//System.out.println("Accelerating Forward");
	//roverMachine.setRoverState(roverMachine.moveForwardAcc);

	//System.out.println("Nothing Happened!");
	
	@Override
	public void PressRightOne() {
		System.out.println("Develerating");
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
		System.out.println("Moving Backward Constant");
		roverMachine.setRoverState(roverMachine.moveBackCons);
		
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
