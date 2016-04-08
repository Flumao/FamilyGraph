package org.flumao.urlife.util;

import java.util.List;

import org.flumao.urlife.entity.User;
/**
 * Data Utility Class
 * @author Flumao
 *
 */
public class DataUtil {
	/**
	 * Remove duplicates elements 
	 * @param users
	 */
	public static void removeDuplicate(List<User> users) {
		if(users == null || users.size() == 0) return;
		for(int i = 1; i < users.size(); i++){
			if(users.get(i).getPersonId() == users.get(i-1).getPersonId()){
				users.remove(i);
				i--;
			}
		}
	}
}
