    package com.zh.advice;

    import org.springframework.security.access.AccessDeniedException;
    import org.springframework.web.bind.annotation.ControllerAdvice;
    import org.springframework.web.bind.annotation.ExceptionHandler;

    @ControllerAdvice
    public class HandleControllerException {

        @ExceptionHandler(RuntimeException.class)
        public String exceptionHandler(RuntimeException e){
            if(e instanceof AccessDeniedException){
                return "redirect:/403.jsp";
            }
            //其余的异常都到500页面！
            return "redirect:/500.jsp";
        }
    }
