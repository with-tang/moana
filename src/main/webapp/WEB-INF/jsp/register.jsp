<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录(注册)</title>
<link rel="stylesheet" type="text/css" href="resources/styles/clicki.web.css?V=20120501" media="screen" />
<link rel="stylesheet" type="text/css" href="resources/styles/clicki.loginandreg.css?V=20120501" media="screen" />
<link rel="stylesheet" type="text/css" href="resources/styles/clicki.webkitanimation.css?V=20120501" media="screen" />
  <style>
.theCenterBox{width:670px;}
</style>
</head>
<body>
<div class="theCenterBox" style="">
  <div class="theLoginBox" style="width:657px">
    <div class="loginTxt">注册账号</div>
    <form id="leftForm" action="reg.html" method="post">
      <div class="theLoginArea" id="loginBox">
       <p style="position: relative;">
          <label for="LoginForm_username">用户名 ：</label>
          <input  name="LoginForm[username]" id="LoginForm_username" type="text" maxlength="16" />
          <span>请输入您的用户名</span> </p>
       	<p style="position: relative;">
          <label for="LoginForm_password">密码：</label>
          <input  name="LoginForm[password]" id="LoginForm_password" type="password" maxlength="16" />
          <span>请输入您的密码</span> </p>
              <p style="position: relative;">
          <label for="LoginForm_email">邮箱：</label>
          <input  name="LoginForm[email]" id="LoginForm_email" type="text" maxlength="255" />
          <span>请输入您的邮箱</span> </p>
    	  <p style="position: relative;">
          <label for="LoginForm_username">QQ ：</label>
          <input  name="LoginForm[qq]" id="LoginForm_qq" type="text" maxlength="16" />
          <span>qq</span> </p>
        <div class="loginSubmitBnt">
          <div class="reg_submit">
            <input name="userSubmit" class="theSubmitButton" value="" type="submit" />
          </div>
        </div>
      </div>   
    </form>
  </div>
</div>
</body>
</html>