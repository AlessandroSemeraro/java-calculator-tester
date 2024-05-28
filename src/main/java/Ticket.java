public class Ticket {

    private double kilometers;
    private int age;
    private static double priceForKm = 0.21;

    public Ticket(double kilometers, int age) {
        this.kilometers = kilometers;
        this.age = age;
    }

    public double getTicketPrice(){
        double ticketPrice= kilometers * priceForKm;
        if (age < 18){
            ticketPrice -= ticketPrice * 0.2;
        } else if (age > 65){
            ticketPrice -= ticketPrice * 0.4;
        }
        return ticketPrice;
    }

}
