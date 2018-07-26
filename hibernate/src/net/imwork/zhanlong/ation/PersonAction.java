package net.imwork.zhanlong.ation;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.model.Person;

public class PersonAction extends ActionSupport
{
    private String username;

    private String password;

    private Integer age;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String savaPerson() throws Exception
    {
        Person p = new Person();

        p.setUsername(username);
        p.setPassword(password);
        p.setAge(age);

        java.sql.Date registerDate = new java.sql.Date(new java.util.Date()
                .getTime());

        return SUCCESS;
    }
}
