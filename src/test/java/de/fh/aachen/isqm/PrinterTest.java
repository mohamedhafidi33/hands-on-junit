package de.fh.aachen.isqm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PrinterTest {

	@Mock
	private Ink ink; // This will be mocked by Mockito

	@InjectMocks
	private Printer printer; // Mockito will inject the mock `Ink` here

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // Initialize mocks and inject them
	}

	@Test
    public void testPrint_WhenHasInk() {
        when(ink.hasInk()).thenReturn(true);

        String result = printer.print("Hello!");
        assertEquals("Printing: Hello!", result);
    }

	@Test
    public void testPrint_WhenNoInk() {
        when(ink.hasInk()).thenReturn(false);

        String result = printer.print("Hello!");
        assertEquals("Cannot print. No ink!", result);
    }
}
