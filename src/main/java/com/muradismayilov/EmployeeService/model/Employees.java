package com.muradismayilov.EmployeeService.model;





import org.springframework.data.annotation.Id;

public class Employees {
	
	@Id
	private int id;
	private String name;
	private String surname;
	private String fatherName;
	private String userName;
	private String birthDate;
	private String gender;
	private String workOrnot;
	private String password;
	private String passwordDate;
	private String director;
	private String registrationDate;
	
	
public Employees( int id, String name, String surname, String fatherName, String userName, String birthDate, String gender, String workOrnot, String password, String passwordDate, String director, String registrationDate) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.fatherName=fatherName;
		this.userName=userName;
		this.birthDate=birthDate;
		this.gender=gender;
		this.workOrnot=workOrnot;
		this.password=password;
		this.passwordDate=passwordDate;
		this.director=director;
		this.registrationDate=registrationDate;
	}
	
	
        public int getId() {
	     return id;
              }
         public void setId(int id) {
	      this.id = id;
          }
         public String getName() {
	     return name;
         }
        public void setName(String name) {
	    this.name = name;
         }
        public String getSurname() {
	     return surname;
         }
        public void setSurname(String surname) {
	    this.surname = surname;
         }


	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWorkOrnot() {
		return workOrnot;
	}

	public void setWorkOrnot(String workOrnot) {
		this.workOrnot = workOrnot;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordDate() {
		return passwordDate;
	}

	public void setPasswordDate(String passwordDate) {
		this.passwordDate = passwordDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	
	
	
	

}
