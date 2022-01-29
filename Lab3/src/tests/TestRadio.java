package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import facade.Radio;

class TestRadio {

	@Test
	void test() {
		Radio radio = new Radio("Radio", "Kiss FM");
		radio.setStation("Q101");
		assertEquals(radio.getStation(), "Q101");
	}
}
