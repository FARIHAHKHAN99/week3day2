package week3Assgns;

public class Students {


		public void getstudentinfo() {
			System.out.println("1st getStudentinfo");		
		}
		
		public int getstudentinfo(int a) {
			System.out.println("2nd getStudentinfo");
			 int id=a;
				
			 return id;
		}
		
		public void getstudentinfo(int a, String name) {
			System.out.println("3rd getStudentinfo");
			int id= a;
			String n= name;
			System.out.println("id is: " +id);
			System.out.println("name is: " +n);
		}
		
		public void getstudentinfo(String email, int num) {
			System.out.println("4th getStudentinfo");
			String emailid= email;
			int phn=num;
			System.out.println("email id is: " +emailid);
			System.out.println("phonenumber id is: " +phn);
		}
		

		public static void main(String[] args) {
		Students std= new Students();
	    std.getstudentinfo();
	    int stdid =std.getstudentinfo(6);
	    System.out.println("printing id from main(): " +stdid);
	    std.getstudentinfo(07,"farihah");
	    std.getstudentinfo("farha99@gmail.com", 1630206519);
			

		}

	}

