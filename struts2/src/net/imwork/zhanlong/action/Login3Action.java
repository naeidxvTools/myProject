package net.imwork.zhanlong.action;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.exception.PasswordException;
import net.imwork.zhanlong.exception.UsernameException;

public class Login3Action extends ActionSupport
{
    private String username;

    private String password;

    private int age;

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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String execute() throws Exception
    {
        if(!"zhanlong".equals(username))
        {
            throw new UsernameException("username invalid.");
        }

        if(!"m123".equals(password))
        {
            throw new PasswordException("password invalid.");
        }

        return this.SUCCESS;
    }

//    @Override
//    public void validate()
//    {
//        if(null == username || username.length() > 6 || username.length() < 4)
//        {
//            addActionError("用户名不合法");
//        }
//
//        if(null == password || password.length() < 4 || password.length() > 6)
//        {
//            addActionError("密码应该在4 ~ 6之间");
//        }
//
//        if(age < 18 || age > 50)
//        {
//            addActionError("年龄应该在18 ~ 50 之间");
//        }
//
//
//    }
}
