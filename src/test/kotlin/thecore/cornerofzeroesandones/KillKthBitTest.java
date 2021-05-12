package thecore.cornerofzeroesandones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KillKthBitTest {
	KillKthBit kb = new KillKthBit();
	@Test
	void killKthBit1() {
		assertEquals(33, kb.killKthBit(37, 3));
	}
}