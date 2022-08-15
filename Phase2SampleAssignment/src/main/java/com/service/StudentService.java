package com.service;
import java.util.List;
import com.bean.Students;
import com.Dao.StudentsDao;
public class StudentService {
StudentsDao sd = new StudentsDao();
    
    public String storeStudentDetails(Students student) {
        if(sd.storeStudent(student)>0) {
            return "Student details stored successfully";
        }else {
            return "Student details didn't store";
        }
        
    }
    public List<Students> findAllStudent() {
        return sd.findAllStudent();
    }
}
