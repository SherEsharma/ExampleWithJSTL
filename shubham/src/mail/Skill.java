package mail;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Skill {
	public static void main(String[] args) throws SQLException {
		List<animalBean> beans = DAO.selectListAnimal();
		
	/*	System.out.println(beans.size());*/
		animalBean bean= new animalBean();
		
			
		for(int i=0;i<beans.size();i++){
			System.out.println(beans.get(i));
		}
		
		
	}

}
