package tallyCounter;

public class TallyCounterMain 
{

	public static void main(String[] args) 
	{
		TallyCount counter1 = new TallyCount();
		TallyCount counter2 = new TallyCount(100);
		
		System.out.println(counter1.getCount());
		counter1.click(50);
		System.out.println(counter1.getCount());
		
	}

}
