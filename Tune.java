package ie.dit;

	public class Tune
	{
		private int x;
		private String title;
		private String altTitle;
		private String title;
		private String notation;
	}
	
	 //Constructor method
   public Tune(int x,String title, String altTitle, String notation)
   {
     this.title = title;
     this.altTitle = altTitle;
     this.notation = notation;
     this.address = address;
	 this.x =x;
   }
	 public String toString() {
        return "3, Banish Misfortune.:" + this.x + ",, "
                + "4, piper's Chair,.:" + this.title + ",, " 
                + this.altTitle + ",, ";
    }
	
		interface player {
		public void play();
		}
	
	
  
 }
		
		
		
		
		