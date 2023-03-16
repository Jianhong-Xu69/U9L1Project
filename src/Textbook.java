public class Textbook extends Book{

    private int edition;

    public Textbook (String t, double p, int e){
        super(t,p);
        edition = e;
    }

    public int getEdition(){
        return edition;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor (Textbook alt){
        return (alt.getTitle().equals(super.getTitle()) && alt.getEdition()<=this.getEdition());
    }
}
