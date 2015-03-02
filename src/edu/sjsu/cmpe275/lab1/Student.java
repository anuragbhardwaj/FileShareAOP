package edu.sjsu.cmpe275.lab1;

public class Student {

		   private Integer age;
		   private String name;
		   private String filePath;
		   private int userID;

		   public void setAge(Integer age) {
		      this.age = age;
		   }
		   public Integer getAge() {
			  System.out.println("Age : " + age );
		      return age;
		   }

		   public void setName(String name){
				this.name = name;
			}
			
			public String getName(){
				System.out.println("Name : " + name );
			    return name;
			}
			
			public void setFilePath(String filePath){
				this.filePath = filePath;
			}
			
			public String getFilePath(){
				System.out.println("File Path : " + filePath );
			      return filePath;
			}
			
			public void setUserID(int userID){
				this.userID = userID;
			}
			
			public int getUserID(){
				System.out.println("userID : " + userID );
			    return userID;
			}
		   
		   public void printThrowException(){
			   System.out.println("Exception raised");
		       throw new IllegalArgumentException();
		   }
}
