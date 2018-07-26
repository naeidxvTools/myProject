package net.imwork.zhanlong.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import net.imwork.zhanlong.bean.User;
import net.imwork.zhanlong.service.LoginService;
import net.imwork.zhanlong.service.impl.LoginServiceImpl;

public class LoginAction extends ActionSupport implements ModelDriven<User>
{
    private String username;

    private String password;

    private int age;

    @Override
    public User getModel()
    {
        return null;
    }

    private LoginService loginService = new LoginServiceImpl();

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

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

    @Override
    public String execute() throws Exception
    {
        if(loginService.isLogin(username,password))
        {
            return SUCCESS;
        }

        return INPUT;
    }
}
