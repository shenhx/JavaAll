package com.shenhx.javabasic.javaapi.collection;

import java.util.Map;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;


public class SimpleEntry<K, V> implements Map.Entry<K,V>,java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7946150863257591670L;

	private final K key;
	private V value;
	
	public SimpleEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public SimpleEntry(Map.Entry<? extends K, ? extends V> entry) {
		this.key = entry.getKey();
		this.value = entry.getValue();
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		V oldValueV = this.value;
		this.value = value;
		return oldValueV;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		// result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleEntry other = (SimpleEntry) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
//		if (value == null) {
//			if (other.value != null)
//				return false;
//		} else if (!value.equals(other.value))
//			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleEntry [key=" + key + ", value=" + value + "]";
	}

	
	
}
