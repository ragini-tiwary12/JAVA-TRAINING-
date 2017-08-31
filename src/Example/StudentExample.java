
package Example;

public class StudentExample {

	public static void main(String[] args) {
		
    Student s1=new Student("PANKAJ","45617888");
    s1.setPhone(675498172);
    s1.setCity("Mississauga");
    s1.setState("Ontario");
    System.out.println("phone number : " + s1.getPhone());
    System.out.println("city : " + s1.getCity());
	System.out.println("state : " + s1.getState());
	s1.enroll(s1.getName());
	s1.pay(5000);
	s1.checkBalance();
	s1.ShowCourses("ICT","ECE");
	System.out.println(s1.toString());
	}
}
    
	class Student{

		String name;
	    String SSN ;
	    String email;
	    int phone;
	    String city;
	    String state;
	    public int balance;
	    String userID;
	   
	    
	    private static final int iD =1000;
	    int random = (int) (Math.random() * 10000);
	       
	      public void encapsulate(int phone,String city,String state)
	        {
	        	this.phone=phone;
	        	this.city=city;
	        	this.state=state;
	        }
	      public String getName() {
				return name;
			}

		  public int getPhone() {
				return phone;
			}

			public void setPhone(int phone) {
				this.phone = phone;
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
           public Student(String name,String SSN){
        	   email = name.substring(0,2) + "@test.com";
        	   userID = (iD + "" + random + SSN.substring(0,2));
 	    	   System.out.println("Name of the student: " +name);
 	    	   System.out.println("SSN: " + SSN);
 	    	   System.out.println("email id: " + email);
 	    	   System.out.println("userId: " + userID);
 	    	   this.name = name;
 			   this.SSN = SSN;
 	       }
 	        
			public void enroll(String name){
		     System.out.println( name + " has enrolled");
	        }
	        
	        public void pay(int amount){
		     System.out.println(name + " has paid tuition fees totalling  " + amount);
		     balance=amount;
	        }
	        
	        public void checkBalance(){
		     System.out.println("Balance is : " + balance);
	        }
	        
	        public String toString(){
				return  name + " " + phone ;
	        }
	        
	        public void ShowCourses(String Course1,String Course2){
		    System.out.println("Courses are : " + Course1 + " and " + Course2 );
	        }
	
    }