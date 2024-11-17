package me.simulatan.kotlin.rc_void_regression

import org.junit.jupiter.api.Test

class RCRegressionTest {
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

	@Test
	fun `kotlin defaulting to java without default param`() {
		val result = map.getKotlinDefaultJavaWithoutDefault<String>()
		println(result)
	}

	@Test
	fun `kotlin only without default param`() {
		val result = map.getKtOnlyWithoutDefault<String>()
		println(result)
	}

	@Test
	fun `java only without default param`() {
		val result = map.getJavaOnlyWithoutDefault<String>()
		println(result)
	}
}
