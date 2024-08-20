package io.github.nguyentaijs.adapter.EnumerateToIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	public Enumeration<E> _enum;

	private EnumerationIterator() {
	}

	public EnumerationIterator(Enumeration<E> _enum) {
		this._enum = _enum;
	}

	@Override
	public boolean hasNext() {
		return _enum.hasMoreElements();
	}

	@Override
	public E next() {
		return _enum.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
