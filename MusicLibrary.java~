import java.util.*;

public class MusicLibrary  {
  
  private ArrayList<Song> songs;
  private int currentSortField = 0;  // Unsorted
  
  public MusicLibrary() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
    songs = new ArrayList<Song>();
  }
  
  /* 
   * Add song to songs ArrayList
   */
  public void addSong (Song song)
  {
    songs.add(song);
  }
  
  /*
   * Retrieve a song by number
   * Return null if song index num is out of bounds
   */
  public Song getSong (int num)
  {
   if(num> -1 && num <songs.size())
     return songs.get(num);
   return null;
  }
  
  /*
   * Sort song list by title
   */

  
  /*
   * Sort song list by a specific field
   * 
   * 1 = title
   * 2 = artist
   */
  public void Sort (int field)
  {
  
  }
  
  /*
   * Shuffle song list
   */
  public void Shuffle ()
  {
    long seed = System.nanoTime();
    Collections.shuffle(songs, new Random(seed));
  }
}
