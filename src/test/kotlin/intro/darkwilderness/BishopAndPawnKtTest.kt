package intro.darkwilderness

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BishopAndPawnKtTest {
    @Test
    fun bishopAndPawn1() {
        assertTrue(bishopAndPawn("a1", "c3"))
    }
}