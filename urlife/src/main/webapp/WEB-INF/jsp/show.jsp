<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>List</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/list.css" />
<script language="JavaScript" type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script language="JavaScript" type="text/javascript" src="<%=request.getContextPath()%>/resources/js/arbor.js"></script>
<script language="JavaScript" type="text/javascript" src="<%=request.getContextPath()%>/resources/js/graphics.js"></script>
<script language="JavaScript" type="text/javascript" src="<%=request.getContextPath()%>/resources/js/renderer.js"></script>
<script language="JavaScript" type="text/javascript" >
$(function (){ 
	$("#viewport").dblclick(function (e){
	   var pos = $(this).offset();
	    var p = {x:e.pageX-pos.left, y:e.pageY-pos.top};
	    selected = nearest  = sys.nearest(p);
			var name = selected.node.data.label||"";
	    sys.pruneNode(name);
	}); 
	}); 
</script>
</head>

<body>
	<sf:form class="form-wrapper cf" method="post" action="/search">
		<input type="text" name="name" placeholder="Search here..." required>
		<input type="submit" id="submit" / value="Go">
	</sf:form>
	<canvas id="viewport" width="1600px"; height="800px"></canvas> 
		<script language="javascript" type="text/javascript">
			var sys = arbor.ParticleSystem(100, 400,1);
			sys.parameters({gravity:false});
			sys.renderer = Renderer("#viewport");
			<c:forEach var="item" items="${adjacencyList}">
			setTimeout(function(){
				var postLoadData = {
				   nodes:{
					   "${item.personName}" : {
						   'color': "${item.color}",
						   'shape': "${item.shape}",
						   'label': "${item.personName}"
					   },
					   "${item.kinName}" : {
						   'color': "${item.color}",
						   'shape': "${item.shape}",
						   'label': "${item.kinName}"
					   },
				   }, 
				   edges:{
						  "${item.personName}" : {
						 		"${item.kinName}":{
						 			'label':"${item.kinship}",
						 			'directed':'1',
						 			'color':'SlateGray'
						 		},
						 	}
				   }
				 };
				 sys.graft(postLoadData);
			},1);
			</c:forEach>
		</script>
</body>
</html>
