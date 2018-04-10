import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 200);
    }

    @Test
    public void enoughPaper(){
        assertEquals(100, printer.getPaperCount());
    }

    @Test
    public void enoughToner() {
        assertEquals(200, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        printer.print(20, 4);
        assertEquals(20, printer.getPaperCount());
        assertEquals(120, printer.getTonerVolume());
    }

    @Test
    public void cannotPrintPaper(){
        printer.print(40, 5);
        assertEquals(100, printer.getPaperCount());
        assertEquals(200, printer.getTonerVolume());
    }
}