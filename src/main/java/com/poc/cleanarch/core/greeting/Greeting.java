package com.poc.cleanarch.core.greeting;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
	private Long id;
	private String title;
	private Date date;
}
