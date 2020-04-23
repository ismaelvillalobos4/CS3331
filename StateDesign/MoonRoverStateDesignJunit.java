import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Ismael
 *
 */
public class MoonRoverStateDesignJunit {


	@Test
	public void test() {
		RoverMachine roverMachine = new RoverMachine();
				
		roverMachine.HoldRight6();
		
		roverMachine.LeftRightSame();
		String expected ="Emergency Stop Activated";
		System.out.println(expected);
		//System.out.println(actual);
		//assertEquals(expected,roverMachine.LeftRightSame());
	}
}

	