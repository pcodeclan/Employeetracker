package pcodeclan.com.github.employeetracker.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String email;

    @Column(name = "emp_Num")
    private int empNum;


    public Employee(String firstName, String lastName, String email, int empNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.empNum = empNum;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
}
