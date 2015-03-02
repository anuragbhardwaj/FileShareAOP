package edu.sjsu.cmpe275.lab1;

import java.util.HashMap;
import java.util.List;

import edu.sjsu.cmpe275.lab1.Users;


public class FileServiceImpl implements iFileService {
	
	private List<Users> users;
	

	public void shareFile(String userId, String targetUserID, String filePath) {
		// TODO Auto-generated method stub
		
		System.out.println("-----Preparing to Share File-------");
		//userID will be reserved for authentication by AOP
		
		for(Users user: users)
		{
			if(user.getUserID().equals(userId)) //For all the users in the system
			{
				System.out.println("UserID :" + userId + " found in the System!");
				List<String> files = user.getFiles();
				
				for(String fileName: files) //For all the files of the user
				{
					
					HashMap<String, String> tempSharedList = user.getSharedList();
					
					for(String tempFilePath : tempSharedList.keySet())
					{
						if(tempFilePath.equals(filePath))
						{
							//Check if the value has the target user id
							
						}
						else
						{
							tempSharedList.put(filePath, targetUserID); //Make an entry to the shared list
							System.out.println("File Successfully Shared with :" + targetUserID);
						}
					}
				}
				
			}
			else
			{
				System.out.println("UserID: " + userId + "NOT found in the System!");
			}
		}
		

	}

	public void unshareFile(String userId, String targetUserID, String filePath) {
		// TODO Auto-generated method stub
		
		System.out.println("-----Preparing to UNShare File-------");
		//userID will be reserved for authentication by AOP
		
		for(Users user: users)
		{
			if(user.getUserID().equals(userId)) //For all the users in the system
			{
				System.out.println("UserID :" + userId + " found in the System!");
				List<String> files = user.getFiles();
					
				HashMap<String, String> tempSharedList = user.getSharedList();
					
				for(String tempFilePath : tempSharedList.keySet())
				{
					if(tempFilePath.equals(filePath))
					{
						//Check the corresponding value for the target user id
						tempSharedList.remove(tempFilePath)	; //
						System.out.println("File Successfully UNShared!");
					}
					else
					{
						System.out.println("File Path " + filePath + " Not Found in the Shared List of the user!");
					}
				}
				
			}
			else
			{
				System.out.println("UserID: " + userId + "NOT found in the System!");
			}
		}
	}

	public byte[] readFile(String userId, String filePath) {
		// TODO Auto-generated method stub
		return null;
	}

}
