package com.mjc813.petap.pet.dto;

import java.time.LocalDate;

public interface IPet { //인터페이스를 만들어서 자동

	Integer getId();

	String getName();

	String getSpecies();

	String getBreed();

	String getGender();

	LocalDate getBirth();

	String getImgFile();

	void setId(final Integer id);

	void setName(final String name);

	void setSpecies(final String species);

	void setBreed(final String breed);

	void setGender(final String gender);

	void setBirth(final LocalDate birth);

	void setImgFile(final String imgFile);

	default void copyMemberValue(final IPet src) { //setName(dto.getName()) 같은 코드를 필드 객수만큼 쓰지 않고 데이터만 골라서 쓰라는 것 메소드 하나로 끈낸것ㅇ다
		if( src == null) {
			return;
		}
		if ( src.getId() != null) {
			this.setId(src.getId());
		}
		if ( src.getName() != null) {
			this.setName(src.getName());
		}
		if ( src.getBirth() != null) {
			this.setBirth(src.getBirth());
		}
		if ( src.getBreed() != null) {
			this.setBreed(src.getBreed());
		}
		if ( src.getGender() != null) {
			this.setGender(src.getGender());
		}
		if ( src.getSpecies() != null) {
			this.setSpecies(src.getSpecies());
		}
		if ( src.getImgFile() != null) {
			this.setImgFile(src.getImgFile());
		}
	}
}
