package com.officemanagement.model;

public class Staff {
		private String id;
		private String name;
		private String email;
		private String department;
		private String contact;
		public Staff() {
			super();
		}
		public Staff(String id, String name, String email, String department, String contact) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.department = department;
			this.contact = contact;
		}
		public Staff(String name, String email, String department, String contact) {
			super();
			this.name = name;
			this.email = email;
			this.department = department;
			this.contact = contact;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}


}
