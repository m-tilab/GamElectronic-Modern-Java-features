package chap0.default_package;

import java.util.Calendar;
import java.util.Date;

public class Student implements Person {

    private String firstname;
    private Date birthday;

    @Override
    public Date getBirthday() {
        return this.birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
