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
	table, tr, th, td {
		padding : 5px 5px;
		border : 1px solid black;
		border-collapse : collapse;
	}
</style>
<body>
	<div id="app">
		<table>
			<tr>
				<th>도서번호</th>
				<th>도서이름</th>
				<th>출판사</th>
				<th>가격</th>
				<th></th>
			</tr>
			<tr v-for = "item in list">
				<td>{{item.bookId}}</td>				
				<td>{{item.bookName}}</td>				
				<td>{{item.publisher}}</td>				
				<td>{{item.price}}</td>
				<td><button @click="fnRemove(item.bookId)">삭제</button></td>				
			</tr>
		</table>
	</div>
</body>
</html>
<script>
	
    const app = Vue.createApp({
        data() {
            return {
				
				list : []
            };
        },
        methods: {
			//-----
            fnGetList(){
				var self = this;
				var nparmap = {
					
				};
				$.ajax({
					url:"/real.dox",
					dataType:"json",	
					type : "POST", 
					data : nparmap,
					success : function(data) { 
						console.log(data);
						self.list = data.list;
					}
				});
            },
       
		fnRemove(num){
			var self = this;
			var nparmap = {
				bookId : num
			};
			$.ajax({
				url:"/remove2.dox",
				dataType:"json",	
				type : "POST", 
				data : nparmap,
				success : function(data) { 
					console.log(data);
					alert("삭제?");
					self.fnGetList();
				}
			});
		}

		// 혼나야겠지? 너무많네 걍 이따 혼나죠
		
        },
		mounted() {
			//-----
			var self = this;
			self.fnGetList();
        }
    });
    app.mount('#app');
</script>
​