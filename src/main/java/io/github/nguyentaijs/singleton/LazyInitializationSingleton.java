package io.github.nguyentaijs.singleton;

import java.util.Objects;

public class LazyInitializationSingleton {

	// Không khởi tạo instance ở đây
	private static LazyInitializationSingleton lazyInitializationSingletonInstance;

	private LazyInitializationSingleton() {
	}

	public static LazyInitializationSingleton getLazyInitializationSingleton() {
		if (Objects.isNull(lazyInitializationSingletonInstance)) { // Khởi tạo instance chỉ khi instance này được request lần
															// đầu
			lazyInitializationSingletonInstance = new LazyInitializationSingleton();
		}
		return lazyInitializationSingletonInstance;
	}
}
