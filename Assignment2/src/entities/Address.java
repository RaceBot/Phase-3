package entities;

public class Address {

		private String street;
		private String city;
		private String state;
		private String zip;
		private String county;
		
		//getters and setters
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getCounty() {
			return county;
		}
		public void setCounty(String county) {
			this.county = county;
		}
		
		public Address(String street, String city, String state, String zip, String county) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.county = county;

			//save
		}
		
}
