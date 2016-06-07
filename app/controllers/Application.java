package controllers;

import play.*;
import play.data.validation.Required;
import play.db.helper.JdbcHelper;
import play.mvc.*;

import java.sql.SQLException;
import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void add(@Required String name, @Required String pwd){

        if(name == null || name.length()==0){
            flash.error("请输入用户名！！！");
            index();
        }
        if(pwd == null || pwd.length()==0){
            flash.error("请输入密码！！！");
            index();
        }

    }
}