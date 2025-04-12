package StudentsDemoMvc;

import java.util.ArrayList;
import java.util.List;

public class StudendModelIUtail {

    public  static List<StudentsModel> getstudent()
    {
        // create empty list
        List<StudentsModel> list = new ArrayList<StudentsModel>();
        // add sample data
        list.add(new StudentsModel("Mohamed","rashed","mmohamedanwer@gmial.com"));
        list.add(new StudentsModel("Ahmed","Kamle","ahmed@gmial.com"));
        list.add(new StudentsModel("Anwar","rashed","anwer@gmial.com"));

        return list;


    }
}
