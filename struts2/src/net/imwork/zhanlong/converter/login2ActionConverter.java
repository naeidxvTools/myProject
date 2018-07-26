package net.imwork.zhanlong.converter;

import net.imwork.zhanlong.bean.User;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

public class login2ActionConverter extends StrutsTypeConverter
{
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass)
    {
        String str = strings[0];
        StringTokenizer st = new StringTokenizer(str, ";");
        String username = st.nextToken();
        String password = st.nextToken();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return  user;
    }

    @Override
    public String convertToString(Map map, Object o)
    {
        User user = (User)o;
        String username = user.getUsername();
        String password = user.getPassword();

        return username + ", " + password;
    }
}
