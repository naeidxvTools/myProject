package net.imwork.zhanlong.action;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.bean.User;

public class Login2Action extends ActionSupport
{
    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        return this.SUCCESS;
    }
}
