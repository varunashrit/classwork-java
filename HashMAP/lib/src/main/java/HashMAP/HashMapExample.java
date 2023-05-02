package HashMAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 

public class HashMapExample {

 
public static void main(String[] args) {
	//List of names of the employees
    List<String> listOfNames = new ArrayList<>();
    listOfNames.add("Xavier");
    listOfNames.add("Karthick");
    listOfNames.add("Anirudh");
    listOfNames.add("Shashank");
    listOfNames.add("Sonu");
    listOfNames.add("Abinash");

    //above of list of employees will belong to certain department
    Map<String,List<String>> departmentWiseEmployeesName = new HashMap<String, List<String>>();
    departmentWiseEmployeesName.put("IT", listOfNames);
    departmentWiseEmployeesName.put("Finance", null);

    List<Integer> listOfAdhaarNo = new ArrayList<>();
    listOfAdhaarNo.add(1242422);
    listOfAdhaarNo.add(1542421);
    listOfAdhaarNo.add(1262420);
    listOfAdhaarNo.add(1233426);
    listOfAdhaarNo.add(1333329);

    List<Integer> listOfAdhaarNoOfMarketingDept = new ArrayList<>();
    listOfAdhaarNoOfMarketingDept.add(1272422);
    listOfAdhaarNoOfMarketingDept.add(1572421);
    listOfAdhaarNoOfMarketingDept.add(1272420);
    listOfAdhaarNoOfMarketingDept.add(1273426);
    listOfAdhaarNoOfMarketingDept.add(1373329);

    Map<String,List<Integer>> departmentWiseEmployeesAdhaarNo = new HashMap<String, List<Integer>>();

    departmentWiseEmployeesAdhaarNo.put("IT",listOfAdhaarNo);
    departmentWiseEmployeesAdhaarNo.put("Marketing", listOfAdhaarNoOfMarketingDept);



    
    System.out.println(departmentWiseEmployeesAdhaarNo.get("Marketing"));
    System.out.println(departmentWiseEmployeesName.get("Marketing"));
    System.out.println(departmentWiseEmployeesName.get("IT"));
}
 

}