import java.util.Comparator;
public class Song implements Comparable<Song> {
  
  public String artist;
  public String name;
  public int year;
  public double score;
  public String notes;
  // More fields here
  
  // Default constructor.. you'll need to modify this
   public Song(String artist, String name,int year, double score, String notes) { 
     super();
    this.artist = artist;
    this.name = name;
    this.year = year;
    this.score = score;
    this.notes = notes;
  }
   public String getName()
   {
   return this.name;
   }
    public String getArtist()
   {
   return this.artist;
   }
   public int compareTo(Song compareSong) {
 
  return 0;
 
 }
}
 // public static Comparator<Song> SongNameComparator = new Comparator<Song>() {
    class SongNameComparator implements Comparator<Song>{
     public int compare(Song Song1, Song Song2) {
   
       String SongName1 = Song1.getName().toUpperCase();
       String SongName2 = Song2.getName().toUpperCase();
 
       return SongName1.compareTo(SongName2);
     }}
     class SongArtistComparator implements Comparator<Song>{
     public int compare(Song Song1, Song Song2) {
   
       String SongName1 = Song1.getArtist().toUpperCase();
       String SongName2 = Song2.getArtist().toUpperCase();
 
       return SongName1.compareTo(SongName2);
     }
     } 
     
  
   
