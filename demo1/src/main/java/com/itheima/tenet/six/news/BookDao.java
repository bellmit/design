package com.itheima.tenet.six.news;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.six.old.BookDao
 ****/
public class BookDao  {
    /*
    *  合成复用原则： 不推荐继承（增加耦合），抽象继承没有问题，推荐合成，把需要的数据作为属性依赖
    *
    *
    * */
    @Autowired
    private MySQLUtil mySQLUtil;

    //查询
    public ResultSet query() throws Exception{
        //获得数据库链接
        Connection conn = mySQLUtil.getConn();
        PreparedStatement ps = conn.prepareStatement("select * from table");
        return ps.executeQuery();
    }
}
