/*a java program that shows thread synchronisation.*/

class Display
{
	public synchronized void Print(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("]");
	}
}

class SyncThread extends Thread
{
	private Display display;
	private String msg;

	SyncThread(Display display, String msg)
	{
		this.display = display;
		this.msg = msg;
	}
	public void run()
	{
		display.Print(msg);
	}
}

public class Synchronise
{
	public static void main(String[] args)
	{
		Display sharedDisplay = new Display();
		SyncThread sc = new SyncThread(sharedDisplay, "Hello");
		SyncThread sd = new SyncThread(sharedDisplay, "world");
		sc.start();
		sd.start();
	}
}