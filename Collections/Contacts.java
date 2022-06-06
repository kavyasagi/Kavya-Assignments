package Collections;
enum Gender{
	Male,Female;
	}
public class Contacts<T> {
	
		private T[] arr;
		long phonenumber;
		String name;
		String Email;
		Object Gender;
		Contacts(){}
		public Contacts(String name, String email,Object Gender) {
			super();
			this.phonenumber = this.phonenumber;
			this.name = name;
			this.Gender=Gender;
			this.Email = email;
		} 
		public String toString() {
			return "["+name+", "+Email+", "+Gender+"]";
			 		
		}
	}


