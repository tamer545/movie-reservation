package com.m133.project.projecttimokai;

import javax.validation.constraints.*;

public class Movie {

	@NotNull
	@Size(min = 1, max = 16)
	private String name;

	@NotNull
	@Size(min = 1, max = 16)
	private String vorname;

	@Email
	@NotNull
	private String email;

	@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
	private String telNummer;

	@NotNull
	private String movieName;

	@NotNull
	@Min(1900)
	private int releaseYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNummer() {
		return telNummer;
	}

	public void setTelNummer(String telNummer) {
		this.telNummer = telNummer;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"name='" + name + '\'' +
				", vorname='" + vorname + '\'' +
				", email='" + email + '\'' +
				", telNummer='" + telNummer + '\'' +
				", movieName='" + movieName + '\'' +
				", releaseYear=" + releaseYear +
				'}';
	}
}
