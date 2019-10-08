public class Printer {
    private int availablepaper;
    private int tonervolume;

    public Printer(int paper, int toner){
        this.availablepaper = paper;
        this.tonervolume = toner;
    }

    public int getPaperLoaded(){
        return this.availablepaper;
    }

    public void print(int copies, int pages){
        int totalpagestoprint = (copies * pages);
        if (this.availablepaper >= totalpagestoprint && this.tonervolume >= totalpagestoprint) {
            this.availablepaper -= totalpagestoprint;
            this.tonervolume -= totalpagestoprint;
        }
    }

    public int getToner(){
        return this.tonervolume;
    }
}
