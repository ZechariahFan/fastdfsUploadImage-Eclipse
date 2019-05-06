<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all">
</head>
<body>
<button type="button" class="layui-btn" id="test1" name="upload">
  		<i class="layui-icon">&#xe67c;</i>上传图片
</button>
<div id="img" style="width: 500px;height: 80px;border: solid 1px;"></div>
<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<script>
layui.use(['layer','upload'], function(){
  var upload = layui.upload,
  			$ = layui.jquery;
   
  //执行实例
  var uploadInst = upload.render({
    elem: '#test1' //绑定元素
    ,url: '${pageContext.request.contextPath}/upload' //上传接口
    ,done: function(res){
      //上传完毕回调
      if(res.code==0){
    	  var imgs="<img src="+res.data.src+"></img>";
    	  $("#img").html(imgs);
      }
      else{
    	  alert("图片不存在");
      }
    }
    ,error: function(){
      //请求异常回调
    	alert("5655");
    },
    accept: 'images'
  }
  );
});
</script>
</body>
</html>