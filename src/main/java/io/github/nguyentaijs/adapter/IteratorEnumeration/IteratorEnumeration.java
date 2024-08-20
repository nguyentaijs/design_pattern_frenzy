package io.github.nguyentaijs.adapter.IteratorEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<E> implements Enumeration<E> {

	private Iterator<E> _iter;

	private IteratorEnumeration() {

	}

	public IteratorEnumeration(Iterator<E> iter) {
		_iter = iter;
	}

	@Override
	public boolean hasMoreElements() {
		return _iter.hasNext();
	}

	@Override
	public E nextElement() {
		return _iter.next();
	}
}
