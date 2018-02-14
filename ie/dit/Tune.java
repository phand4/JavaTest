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

//Needs to get data after X:, T:, T:, K:
//So should retrieve substrings post the first two characters but
//where it starts with relevant letter and colon
	public int getX(){
		return x.substring(2);
	}

	public String getTitle(){
		return title.substring(2);;
	}

	public String getAltTitle(){
		return altTitle.substring(2);;
	}

	public String getNotation(){
		return notation.startsWith("K:");
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