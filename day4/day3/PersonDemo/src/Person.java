                                                         
public class Person 
	{
		//data members
		private int pid;
		private String pname;
		private String mobile;
		

		public Person() 
			{
			//default constructor
			//one parameter implicitly and it is this
				pid=0;
				pname=null;
				mobile=null;
			}

		
		public Person(int pid,String pname,String mob) 
			{
			//parametrized constructor
			//one parameter implicitly and it is this, 
			//and plus 3 more parameters will be there
				this.pid=pid;
				this.pname=pname;
				this.mobile=mob;
			}
		
		
		public void setPid(int pid) 
			{
			///setter function
				this.pid=pid;
			}
		public void setPname(String nm) 
			{
				this.pname=nm;
			}
		public void setMobile(String m) 
			{
				this.mobile=m;
			}
		public int getPid() 
			{
			///getter function
				return this.pid;
			}
		public String getPname() 
			{
				return pname;
			}
		public String getMobile() 
			{
				return mobile;
			}

		/*
		DisplayMember Method->
		
		public void displayPerson()
			{
			System.out.println("pid: "+this.pid);
			System.out.println("name: "+this.pname);
			System.out.println("mobile: "+mobile); 
			}
		*/
		
		public String toString() 
			{
				return " 1.pid: "+this.pid+"\n 2.Name: "+this.pname+"\n 3.Mobile: "+this.mobile+"\n";
			}

	}
