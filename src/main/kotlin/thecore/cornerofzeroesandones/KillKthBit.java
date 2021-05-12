package thecore.cornerofzeroesandones;

public class KillKthBit {
	public int killKthBit(int n, int k) {
		return n & (~(1 << (k-1)));
	}

}
