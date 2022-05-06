public class SleepUtilities
{
	/** 	 * Nap between zero and NAP_TIME seconds. 	 */
	public static void nap() {
		nap(NAP_TIME, 1000);
	}

	/** 	 * Nap between zero and duration seconds. 	 */
	public static void nap(int duration, int sleep_mult) {
        	int sleeptime = (int) (duration * Math.random() );
        	try { Thread.sleep(sleeptime*sleep_mult); }
        	catch (InterruptedException e) {
        		// finish executing anything that must be executed
        		// release locks
        	}
	}

	private static final int NAP_TIME = 5;
}
