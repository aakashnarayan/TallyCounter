/*
 * 
 * @author Aakash Narayan
 * 
 */

package tallyCounter;

public class TallyCount 
{
	private int count;
	
	public TallyCount() 
	{
		count = 0;
	}
	
	public TallyCount(int startNum) 
	{
		count = startNum;
	}
	public void click()
	{
		count++;
	}
	public void reset()
	{
		count = 0;
	}
	public int getCount()
	{
		int c = count;
		return c;
	}
	public void unclick()
	{
		count--;
	}
}

