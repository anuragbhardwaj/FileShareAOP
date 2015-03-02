package edu.sjsu.cmpe275.lab1;

public interface iFileService {
	
	void shareFile(String userid, String targetUserID, String filepath);
	void unshareFile(String userId, String targetUserID, String filePath);
	byte[] readFile(String userId, String filePath);
}
