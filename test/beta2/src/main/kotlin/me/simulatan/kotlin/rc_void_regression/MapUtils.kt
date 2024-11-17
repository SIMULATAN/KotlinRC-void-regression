package me.simulatan.kotlin.rc_void_regression

fun <T> Map<Any, Any>.getOrDefault(key: Any, defaultValue: T): T = get(key) as T
fun <T> Map<Any, Any>.getWithoutDefault(key: Any): T = get(key) as T

inline fun <reified T : Any> Map<Any, Any>.getKotlinDefaultJava(): T? = getOrDefault(T::class, null) ?: getOrDefault(T::class.java, null)
inline fun <reified T : Any> Map<Any, Any>.getKtOnly(): T? = getOrDefault(T::class, null)
inline fun <reified T : Any> Map<Any, Any>.getJavaOnly(): T? = getOrDefault(T::class.java, null)

inline fun <reified T : Any> Map<Any, Any>.getKotlinDefaultJavaWithoutDefault(): T? = getWithoutDefault(T::class) ?: getWithoutDefault(T::class.java)
inline fun <reified T : Any> Map<Any, Any>.getKtOnlyWithoutDefault(): T? = getWithoutDefault(T::class)
inline fun <reified T : Any> Map<Any, Any>.getJavaOnlyWithoutDefault(): T? = getWithoutDefault(T::class.java)
