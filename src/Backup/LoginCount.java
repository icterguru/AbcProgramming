package Backup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LoginCount 
{
	// https://www.careercup.com/question?id=5717876079067136
public void countNumberOfLogs() throws Exception{
	//BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\Desktop\\username.txt"));
	BufferedReader br = new BufferedReader(new FileReader("/Users/Dr.Mokter/Utilities/username.txt"));
	Map<String, Integer> map = new HashMap<String, Integer>();
	String line;
	while((line = br.readLine()) != null){

		String[] str = line.split(",");

		for(int i=0;i<str.length;i++){
			if(map.containsKey(str[i])){

				map.put(str[i], map.get(str[i])+1);
			}
			else{
				map.put(str[i], 1);
			}


		}
	}
	System.out.println(map);


}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	LoginCount cu = new LoginCount();
	try {
		cu.countNumberOfLogs();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}