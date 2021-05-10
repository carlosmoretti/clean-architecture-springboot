package com.poc.cleanarch.infrastructure.shared.service;

import java.util.List;

public interface SharedService<T, E> {
	List<T> getAll();
	T get(E id);
	void add(T obj);
	void update(T obj);
	void delete(T obj);
}
