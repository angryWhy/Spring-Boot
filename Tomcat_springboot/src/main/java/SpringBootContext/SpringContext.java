package SpringBootContext;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringContext {
    public static void run(){
        Tomcat tomcat = new Tomcat();
        //设置9090
        tomcat.setPort(9090);
        //启动
        try {
            tomcat.start();
            //等待请求结束
            System.out.println("等待请求接入！");
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
        //
    }
}