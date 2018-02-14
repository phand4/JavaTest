package ie.dit;

interface Player{
	public void play();
}

public class Tune implements Player
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public int getX(){
		return x;
	}

	public String getTitle(){
		return title;
	}

	public String getAltTitle(){
		return altTitle;
	}

	public String getNotation(){
		return notation;
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		int sx = getX();
		sb.append(sx + ", ");

		String  sT = getTitle();
		sb.append(sT + ", ");

			String sAT = getAltTitle();
		if(sAT == ""){
			
		} else {
			sb.append(sAT);
		}

		return sb.toString();
	}

	public void play(){
		System.out.println(getNotation());
	}

}