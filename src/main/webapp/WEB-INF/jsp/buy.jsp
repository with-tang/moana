<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
  <head>
    <title>电影票抢购</title>
<%@include file="common/head.jsp"%>  
<script src="../../resources/script/jquery/js/jquery.min.js"></script>
<script src="../../resources/script/bootstrap/js/bootstrap.min.js"></script>
<script src="../../resources/script/cookie/js/cookie.js"></script>
<script src="../../resources/script/jquery/js/jquery.countdown.js"></script>
<script type="text/javascript" src="../../resources/moana.js"></script>

<script type="text/javascript">
//jquery判断是否登录，如果否，弹出注册页面
    $(function (){
        moana.detail.init({
            movieId :${movie_list.secKillId};           
        });
    });
</script>
  </head>
  <body>
   <div class="container">
	   	<div class="panel panel-default">
		   	<div class="panel panel-heading text-center">
		   		<h2>电影列表</h2>
		   	</div>
		   	<div class="panle panel-body">
		   		<table class="table table-hover">
		   		<thead>
		   			<tr>
		   				<th>电影名称</th>
		   				<th>剩余张数</th>
		   				<th>上映时间</th>
		   				<th>电影时长</th>		   						   				
		   				<th>点击抢购</th>		   				
		   			</tr>
		   		</thead>
		   		<tbody>
			   		<c:forEach var="movie_list" items="${buy}">
			   		<tr>
			   			<td><b>${movie_list.movieName}</b></td>
			   			<td>${movie_list.movieCount}</td>
			   			<td> 
			   			<fmt:formatDate value="${movie_list.movieStartTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>		
						<td>${movie_list.movieMin}min</td>	   			
			   			<td>
			   			 <button type="button" id="snapBtn" class="btn btn-success">
                	    <span class="glyphicon glyphicon-phone"></span>
                    	立即抢购
              		  </button>
			   			</td>
			   		</tr>
			   		</c:forEach>
		   		</tbody>
		   		</table>
		   	</div>
	   	</div>
   
   </div>
  </body>

</html>