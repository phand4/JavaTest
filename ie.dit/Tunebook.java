package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class TuneBook{

	
	ArrayList<String> tunes = new ArrayList<String>();

	public TuneBook()
	{
		loadTuneBook();
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for(String tune:tunes)
		{
			sb.append(tune + ", ");
		}
		return sb.toString();
	}

	public String findTune(String tune)
	{
		System.out.println(s.contains(tune));
	}

	public void loadTuneBook()
	{
		BufferedReader inputStream = null;

		try {
            inputStream = new BufferedReader(new FileReader("hnj0.abc"));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
	}

	public static void main(String[] args) {
		TuneBook tb = new TuneBook("hnj0.abc");
		System.out.println(tb);

		Tune t = tb.fineTune("Scotsman over the Border");
		t.play();
		
	}

}