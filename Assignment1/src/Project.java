import java.io.*;
import java.util.*;
class Project
{
  String name;
  String role;
  String [] responsibilities;

 Project(String name, String role )
    {
        this.name=name;
        this.role=role;
        
   }
   public void setName(String name) 
   {   
      this.name=name;
   }
   public String getName()
   {
   	return name;
   }
    public void setRole(String role) 
   {   
      this.role=role;
   }
   public String getRole()
   {
   	return role;
   }
    public void displayProject()
     {
        System.out.println("The project Name of the student is\n"+ "name =" + name +"Role =" + role );
    }
	
}