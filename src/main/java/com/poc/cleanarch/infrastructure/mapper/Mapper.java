package com.poc.cleanarch.infrastructure.mapper;

public interface Mapper<T, E> {
	E toDto(T obj);
	T fromDto(E obj);
}
