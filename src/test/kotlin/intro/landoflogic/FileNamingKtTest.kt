package intro.landoflogic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FileNamingKtTest {


    @Test
    fun fileNaming1() {
        val input = mutableListOf("doc",
                "doc",
                "image",
                "doc(1)",
                "doc")
        val output = mutableListOf("doc",
                "doc(1)",
                "image",
                "doc(1)(1)",
                "doc(2)")
        assertEquals(output, fileNaming(input))
    }

    @Test
    fun fileNaming2() {
        val input = mutableListOf("a(1)",
                "a(6)",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a")
        val output = mutableListOf("a(1)",
                "a(6)",
                "a",
                "a(2)",
                "a(3)",
                "a(4)",
                "a(5)",
                "a(7)",
                "a(8)",
                "a(9)",
                "a(10)",
                "a(11)")
        assertEquals(output, fileNaming(input))
    }

    @Test
    fun fileNaming3() {
        val input = mutableListOf("dd",
                "dd(1)",
                "dd(2)",
                "dd",
                "dd(1)",
                "dd(1)(2)",
                "dd(1)(1)",
                "dd",
                "dd(1)")
        val output = mutableListOf("dd",
                "dd(1)",
                "dd(2)",
                "dd(3)",
                "dd(1)(1)",
                "dd(1)(2)",
                "dd(1)(1)(1)",
                "dd(4)",
                "dd(1)(3)")
        assertEquals(output, fileNaming(input))
    }

    @Test
    fun fileNaming4() {
        val input = mutableListOf("a",
                "b",
                "cd",
                "b ",
                "a(3)")
        val output = mutableListOf("a",
                "b",
                "cd",
                "b ",
                "a(3)")
        assertEquals(output, fileNaming(input))
    }
}