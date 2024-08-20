package io.github.nguyentaijs.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingletonInstance;

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getThreadSafeSingletonInstance() {
		// Chỉ lock khi instance chưa được khởi tạo
		synchronized (ThreadSafeSingleton.class) {
			if (Objects.isNull(threadSafeSingletonInstance)) {
				threadSafeSingletonInstance = new ThreadSafeSingleton();
			}
		}
		return threadSafeSingletonInstance;
	}
}
