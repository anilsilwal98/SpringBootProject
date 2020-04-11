package com.security.model;


// Data Transfer Object - DTO 
// object to represent data or send data to the remote call


public class DeptEmployee {
	
		private String empDept;
		private String empName;
		private String empEmail;
		private String empAddress;
		private String empPhone;
		
		public DeptEmployee(String empDept, String empName, String empEmail, String empAddress, String empPhone) {
			this.empDept = empDept;
			this.empName = empName;
			this.empEmail = empEmail;
			this.empAddress = empAddress;
			this.empPhone = empPhone;
		}
		
		public String getEmpPhone() {
			return empPhone;
		}

		public void setEmpPhone(String empPhone) {
			this.empPhone = empPhone;
		}
		
		public String getEmpDept() {
			return empDept;
		}

		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpEmail() {
			return empEmail;
		}

		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}

		public String getEmpAddress() {
			return empAddress;
		}

		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}
		        
	}
