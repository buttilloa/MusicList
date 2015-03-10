import java.util.Arrays;

public class MusicRunner
{
  public static void main (String[] args)
  {
    int count = 0;
    MusicReader mr = new MusicReader();
    MusicLibrary Ml = new MusicLibrary();
    
    mr.open("musiclist.csv");
    
    String[] data = mr.getSongData();
    
    // First line contains all the fields - We don't want to save this anywhere but we can
    // print it for now to see what information we have.
    System.out.println(Arrays.toString(data));
    
    data = mr.getSongData();  // Get next line of song data
    
    // if data is null then we were unable to read a line of song data, so
    // this loop will continue to read lines of song data as long as there
    // IS song data available
    while (data != null)
    {
      // You probably will comment this out but for now print out the line so you can see what is there
      
      
      // Let's try to create a Song object
      if(data[2].substring(1,data[2].length()-1).compareTo("song") ==0)
      {Ml.addSong(new Song(data[0], data[1],Integer.parseInt(data[3].substring(1,data[3].length()-1)),Double.parseDouble(data[4].substring(1,data[4].length()-1)),data[16]));  // data[0] is the artist and data[1] is the name
      count++;
      System.out.println(Arrays.toString(data));
      }
      if (count == 10)  // For now only read ONE song
        break;
      
      data = mr.getSongData();  // Get next line of song data
    }
    Ml.Sort(1);
    mr.close();
  }
}