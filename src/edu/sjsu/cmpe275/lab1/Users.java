package edu.sjsu.cmpe275.lab1;

import java.util.HashMap;
import java.util.List;

public class Users {
	
	private String userID;
	private String userName;
	private String fileName;
	//private List<String> sharedFiles; 
	
	private HashMap<String, String> sharedList; //Key is the file path and value is the user jiske saath share hua
	public List<String> getFiles() {
		return files;
	}
	public void setFiles(List<String> files) {
		this.files = files;
	}

	private List<String> files; 
	private boolean isShared;
	private String filePath;
	
	public Users(String userID, String userName, String fileName,
			List<String> sharedFiles, List<String> files) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.fileName = fileName;
		//this.sharedFiles = sharedFiles;
		this.files = files;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/*public List<String> getSharedFiles() {
		return sharedFiles;
	}
	public void setSharedFiles(List<String> sharedFiles) {
		this.sharedFiles = sharedFiles;
	}*/
	public List<String> getNotSharedFiles() {
		return files;
	}
	public void setNotSharedFiles(List<String> files) {
		this.files = files;
	}
	public boolean isShared() {
		return isShared;
	}
	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}
	/*public String getFilePath() {
		return filePath;
	}*/
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFilePath(String fileName)
	{
		return "/home/" + this.userID + "/shared/" + fileName;
	}
	public HashMap<String, String> getSharedList() {
		return sharedList;
	}
	public void setSharedList(HashMap<String, String> sharedList) {
		this.sharedList = sharedList;
	}
	
	
	
	//Create a hashmap with filename and boolean to check if the file is being shared? or a list of shared files and non shared files.
	
}
