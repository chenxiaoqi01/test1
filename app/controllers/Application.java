package controllers;

import play.data.validation.Required;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void add(@Required String name, @Required String pwd){
        // valid
        if(name == null || name.length()==0){
            flash.error("请输入用户名！！！");
            index();
        }
        if(pwd == null || pwd.length()==0){
            flash.error("请输入密码！！！");
            index();
        }
        render(name);
    }
}