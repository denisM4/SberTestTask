package by.kvach.sber.task1.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public abstract class AbstractProduct {

	private String name;
	private double balance;
	private String currency;
}
