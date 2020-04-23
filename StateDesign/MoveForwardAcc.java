
public class MoveForwardAcc implements RoverState{
	RoverMachine roverMachine;
	
	public MoveForwardAcc(RoverMachine newRoverMachine) {
		roverMachine = newRoverMachine;
	}
	
	
	@Override
	public void PressRightOne() {
		System.out.println("Nothing Happened!");
		
	}
	
	@Override
	public void PressRightTwo() {
		System.out.println("Decelerating");
		roverMachine.setRoverState(roverMachine.decelerate);
	}
	
	@Override
	public void HoldRight6() {
		System.out.println("Moving Forward Constant");
		roverMachine.setRoverState(roverMachine.moveForwardCons);
	}
	
	@Override
	public void PressLeftOne() {
		System.out.println("Moving Forward Constant");
		roverMachine.setRoverState(roverMachine.moveForwardCons);
	
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
		//roverMachine.setRoverState(roverMachine.decelerate);
		roverMachine.setRoverState(roverMachine.idle);


	}
	


}
