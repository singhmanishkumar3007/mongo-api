package com.training.mongo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "employees")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyEmployee {

	@Id
	private Long employeeId;

	@Indexed(unique = true)
	private String userName;

	private String firstName;

	private String lastName;

	private String password;

}
