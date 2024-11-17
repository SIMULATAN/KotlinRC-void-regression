package me.simulatan.kotlin.rc_void_regression

fun <T> Map<Any, Any>.getOrDefault(key: Any, defaultValue: T): T {
	if (!containsKey(key)) {
		return defaultValue
	}
	return get(key) as T
}

inline fun <reified T : Any> Map<Any, Any>.getKotlinDefaultJava(): T? = getOrDefault(T::class, null) ?: getOrDefault(T::class.java, null)
inline fun <reified T : Any> Map<Any, Any>.getKtOnly(): T? = getOrDefault(T::class, null)
inline fun <reified T : Any> Map<Any, Any>.getJavaOnly(): T? = getOrDefault(T::class.java, null)
