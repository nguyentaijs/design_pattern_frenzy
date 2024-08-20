package io.github.nguyentaijs.singleton;

public class Singleton {
	// 1. Set instance thành static
	private static Singleton singletonInstance = new Singleton();

	// 2. Constructor set về private
	private Singleton() {
	}

	// 3. Getter set thành static method
	public static Singleton getSingletonInstance() {
		return singletonInstance;
	}

	// 4. Loại bỏ setter
	/*
	 * public void setSingletonInstance(Singleton singletonInstance) {
	 * this.singletonInstance = singletonInstance; }
	 */
}
