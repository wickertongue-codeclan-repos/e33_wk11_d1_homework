import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void printer() {
        printer = new Printer(100, 80);
    }

    @Test
    public void get_paper_loaded(){
        assertEquals(100, printer.getPaperLoaded());
    }

    @Test
    public void printer_prints_when_it_has_enough_paper(){
        printer.print(2, 10);
        assertEquals(80, printer.getPaperLoaded());
    }

    @Test
    public void printer_does_not_print_when_it_does_not_have_enough_paper(){
        printer.print(10, 20);
        assertEquals(100, printer.getPaperLoaded());
    }

    @Test
    public void get_toner(){
        assertEquals(80, printer.getToner());
    }

    @Test
    public void printer_does_not_print_when_it_does_not_have_enough_toner(){
        printer.print(150, 200);
        assertEquals(80, printer.getToner());
        assertEquals(100, printer.getPaperLoaded());
    }

    @Test
    public void printer_prints_when_it_has_enough_toner_and_paper(){
        printer.print(80,1);
        assertEquals(20, printer.getPaperLoaded());
        assertEquals(0, printer.getToner());
    }
}
