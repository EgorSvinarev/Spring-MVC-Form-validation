package com.svinarev.form_validation.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

	@NotNull
	@Size(min = 5, max = 20, message = "Hello world")
	private String name;
	
	@NotNull
	@Min(18)
	private int age;	
	
}
