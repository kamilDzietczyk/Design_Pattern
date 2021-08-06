package FlightLeg;

public class flaightLeg {
    private String from;
    private String to;
    private Boolean delayed = false;
    private int price;

    private flaightLeg (flaightLegBuilder FlaightleghtBuilder)
    {

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Boolean getDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    public void setDelayed(Boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "flaightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }
    public static class flaightLegBuilder
    {
        private String from;
        private String to;
        private Boolean delayed = false;
        private int price;



        public flaightLeg build(){
            return new flaightLeg(from, to );
        }
    }
}
