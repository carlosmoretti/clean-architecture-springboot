package com.poc.cleanarch.infrastructure.data.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GreetingModel {
	private Long id;
	private String titulo;
	private Date date;
}
