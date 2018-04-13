package com.mytest.controller;/**
 * Created by gunlei1701 on 2018/4/12.
 */
import org.apache.log4j.spi.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @create 2018-04-12 14:47
 * syx_1900
 **/
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
//    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(HttpServletRequest request){
        //输出日志文件
//        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        request.setAttribute("path",path);
        request.setAttribute("basePath",basePath);
        request.setAttribute("request",request);
        return "index";
    }
}
