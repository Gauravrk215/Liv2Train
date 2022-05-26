package com.live2train.models;

import java.security.Timestamp;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;


@Entity
@Table(name="Training_Centers")
public class Models {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private AddressModels Address;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]{1,40}",message="CentreName should be less than 40 characters and only text !!")
	@Size(max =40, message="CentreName should be less than 40 characters !!")
	private String CenterName;
	
	 @NotNull
	 @Pattern(regexp = "^[a-zA-Z0-9]{12,12}",message="length must be 12 and alphanumeric only !!")
	private String CenterCode;
	
	
	
	
	 @NotNull(message = "Must be filled !!")
	private int Student_Capacity;
	
     @NotNull(message = "Must be filled !!")
     private String course_offered;
	
	@NotNull
	@NotBlank
	@Email(message="your email address is not valid !! ")
	private String ContactEmail;
	
	@NotEmpty	
	 @Pattern(regexp = "^[0-9]{10,10}" , message = "Must be filled !!")
	private String ContactPhone;
	
	
	@Column(name = "Created_On")
	@Temporal(TemporalType.TIMESTAMP)
    private Date CreatedOn=new Date(System.currentTimeMillis());


	
//	Getter and Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public AddressModels getAddress() {
		return Address;
	}


	public void setAddress(AddressModels address) {
		Address = address;
	}


	public String getCenterName() {
		return CenterName;
	}


	public void setCenterName(String centerName) {
		CenterName = centerName;
	}


	public String getCenterCode() {
		return CenterCode;
	}


	public void setCenterCode(String centerCode) {
		CenterCode = centerCode;
	}


	public int getStudent_Capacity() {
		return Student_Capacity;
	}


	public void setStudent_Capacity(int student_Capacity) {
		Student_Capacity = student_Capacity;
	}


	public String getCourse_offered() {
		return course_offered;
	}


	public void setCourse_offered(String course_offered) {
		this.course_offered = course_offered;
	}


	public String getContactEmail() {
		return ContactEmail;
	}


	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}


	public String getContactPhone() {
		return ContactPhone;
	}


	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}


	public Date getCreatedOn() {
		return CreatedOn;
	}


	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}


	public Models(int id, AddressModels address,
			@NotNull @NotBlank @Pattern(regexp = "^[a-zA-Z]{1,40}", message = "CentreName should be less than 40 characters and only text !!") @Size(max = 40, message = "CentreName should be less than 40 characters !!") String centerName,
			@NotNull @Pattern(regexp = "^[a-zA-Z0-9]{12,12}", message = "length must be 12 and alphanumeric only !!") String centerCode,
			@NotNull(message = "Must be filled !!") int student_Capacity,
			@NotNull(message = "Must be filled !!") String course_offered,
			@NotNull @NotBlank @Email(message = "your email address is not valid !! ") String contactEmail,
			@NotEmpty @Pattern(regexp = "^[0-9]{10,10}", message = "Must be filled !!") String contactPhone,
			Date createdOn) {
		super();
		this.id = id;
		Address = address;
		CenterName = centerName;
		CenterCode = centerCode;
		Student_Capacity = student_Capacity;
		this.course_offered = course_offered;
		ContactEmail = contactEmail;
		ContactPhone = contactPhone;
		CreatedOn = createdOn;
	}


	public Models() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	

}
