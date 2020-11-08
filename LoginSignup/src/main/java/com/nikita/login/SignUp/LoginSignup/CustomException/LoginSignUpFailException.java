package com.nikita.login.SignUp.LoginSignup.CustomException;

public class LoginSignUpFailException extends RuntimeException{

   public LoginSignUpFailException(String message)
    {
         super(message);


    }
    public LoginSignUpFailException(Throwable cause)
    {
        super(cause);


    }




    public LoginSignUpFailException(String message, Throwable cause)
    {
     super(message,cause);


    }






}
