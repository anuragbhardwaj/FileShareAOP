package com.file;

public interface iFileService {
	
	void shareFile(String userid, String targetUserID, String filepath);
	void unshareFile(String userId, String targetUserID, String filePath);
	byte[] readFile(String userId, String filePath);
}
