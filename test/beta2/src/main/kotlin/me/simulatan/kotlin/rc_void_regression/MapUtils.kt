package me.simulatan.kotlin.rc_void_regression

fun <T> Map<Any, Any>.getOrDefault(key: Any, defaultValue: T): T = when {
	containsKey(key) -> get(key) as T
	else -> defaultValue
}

inline fun <reified T : Any> Map<Any, Any>.getKotlinDefaultJava(): T? = getOrDefault(T::class, null) ?: getOrDefault(T::class.java, null)
inline fun <reified T : Any> Map<Any, Any>.getKtOnly(): T? = getOrDefault(T::class, null)
inline fun <reified T : Any> Map<Any, Any>.getJavaOnly(): T? = getOrDefault(T::class.java, null)
