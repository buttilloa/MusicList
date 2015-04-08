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
    if(field == 1){
    Collections.sort(songs, new SongNameComparator());
    }
    else if (field ==2)
    {
     Collections.sort(songs, new SongArtistComparator());
    }
    for(Song  name : songs)
      if(field ==1)System.out.println(name.getName());
    else if(field ==2)System.out.println(name.getArtist());
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
