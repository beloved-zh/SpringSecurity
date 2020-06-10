package com.zh.advice;

//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class HandlerControllerException implements HandlerExceptionResolver {
//
//    /**
//     *
//     * @param httpServletRequest
//     * @param httpServletResponse
//     * @param o 出现的异常对象
//     * @param e 出现的异常信息
//     * @return ModelAndView
//     */
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        ModelAndView mv = new ModelAndView();
//        //将异常信息放入Request域中，基本不用
//        mv.addObject("errorMsg",e.getMessage());
//        //指定不同的异常跳转的页面
//        if (e instanceof AccessDeniedException){
//            mv.setViewName("redirect:/403.jsp");
//        }else {
//            mv.setViewName("redirect:/500.jsp");
//        }
//        return mv;
//    }
//}
