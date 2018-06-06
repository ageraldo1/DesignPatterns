package com.itktechnologies.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

	public UserDTOBuilder withFirstName(String fname);
	
	public UserDTOBuilder withLastName(String lname);
	
	public UserDTOBuilder withBirthday(LocalDate date);
	
	public UserDTOBuilder withAddress(Address address);
	
	public UserDTO build();
	
	public UserDTO getUserDTO();
}
