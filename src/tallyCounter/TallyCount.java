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
}
