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
	public int click(int numClick)
	{
		count+=numClick;
		return count;
	}
	public void reset()
	{
		count = 0;
	}
	public int getCount()
	{
		return count;
	}
	public void unclick()
	{
		count--;
	}
}

