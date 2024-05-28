import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testGetTicketPrice() {
        Ticket ticket = new Ticket(100, 19);
        assertEquals(21, ticket.getTicketPrice());
        Ticket ticket2 = new Ticket(100, 17);
        assertEquals(16.8, ticket2.getTicketPrice());
        Ticket ticket3 = new Ticket(100, 66);
        assertEquals(12.6, ticket3.getTicketPrice());
    }
}