public class FavoriteSong {
   public static void main (String[] args) {
      String song = "Mawaridashita ano ko to boku no mirai ga"
                  + "\nTomari dokka de mata yarinaosetara"
                  + "\nMawaridashita ano ko to boku ga higaisha"
                  + "\nZura de dokka wo mata neriaruketara na";
      Song s = new Song (song);
     
      s.printOut(song);
   }
}

class Song {
   public String song;
   
   Song (String song) {
      this.song = song;
   }
   
   public static void printOut (String song) {
      System.out.println(song);
   }
}