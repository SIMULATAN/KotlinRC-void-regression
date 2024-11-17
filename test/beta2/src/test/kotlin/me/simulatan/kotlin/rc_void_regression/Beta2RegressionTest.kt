package me.simulatan.kotlin.rc_void_regression

import org.junit.jupiter.api.Test

class Beta2RegressionTest {
	val map: Map<Any, Any> = mapOf(
		String::class to "Hello, World!"
	)

	@Test
	fun `kotlin defaulting to java`() {
		val result = map.getKotlinDefaultJava<String>()
		println(result)
	}

	@Test
	fun `kotlin only`() {
		val result = map.getKtOnly<String>()
		println(result)
	}

	@Test
	fun `java only`() {
		val result = map.getJavaOnly<String>()
		println(result)
	}
}
