<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<jsp:include page="/layout/menu.jsp"></jsp:include>
	<title>테스트 샘플 파일</title>
</head>
<style>
</style>
<body>
	<div id="app">
		
	</div>
</body>
</html>
<script>
	
    const app = Vue.createApp({
        data() {
            return {
				
				
            };
        },
        methods: {
			//-----
            fnGetList(){
				var self = this;
				var nparmap = {
					
				};
				$.ajax({
					url:"/.dox",
					dataType:"json",	
					type : "POST", 
					data : nparmap,
					success : function(data) { 
						console.log(data);
						
					}
				});
            }
        },

		
		
        mounted() {
			//-----
			
        }
    });
    app.mount('#app');
</script>
​