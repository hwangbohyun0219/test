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
<!--	<div>
		
		<input  id= @click="fnGetList()" placeholder="1~15 입력(PK값)">
		<button>검색</button>
		<button @click="fnRemove()">삭제</button>
	</div>-->
	
		
	
		
		
		
		
		
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
					url:"/stu.dox",
					dataType:"json",	
					type : "POST", 
					data : nparmap,
					success : function(data) { 
						console.log(data);
						
						
						
					}
				});
            }
        },
		fnRemove(num){
			var self = this;
			var nparmap = {
				productNo:num
			};
			$.ajax({
				url:"test.dox",
				dataType:"json",	
				type : "POST", 
				data : nparmap,
				success : function(data) { 
					console.log(data);
					self.fnGetList();
				}
			});
			
			
			
		},
		
		
		
        mounted() {
			//-----
		
        }
    });
    app.mount('#app');
</script>
​