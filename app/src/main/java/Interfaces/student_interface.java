package Interfaces;

import Models.Student;

public interface student_interface {
    public void addStudent(Student student,String id);
    public void addMobile(String id,String mobile);
    public void addWeb(String id,String web);
    public void addExpYears(String id,String expYears);
    public void addWorkedBefore(String id,String workedBefore);
    public void addCompanySize(String id,String companySize);
    public void addEnglishLevel(String id,String englishLevel);
    public void addAnotherLang(String id,String anotherLang);
    public void addCommLevel(String id,String commLevel);
    public void addOvertime(String id,String overtime);
    public void addUniEnroll(String id,String uniEnroll);
    public void addDegLevel(String id,String degLevel);

}
