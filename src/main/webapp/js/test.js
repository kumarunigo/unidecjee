function displayInlineHide(){
	document.getElementById("reviews").style="display:none";
}

function displayInlineShow(){
	document.getElementById("reviews").style="display:inline";
	
}

test();
/*
addition method in java
public int add(int a, int b){
	int sum=a+b;
	return sum;
}
method call in java
int result=add(20,30);
*/
// addition function in javascript 
function add( a , b){
	var sum=a+b;
	return sum;
} 
function checkLoginForm(){
	var customerEnterdUid=document.getElementById("uid").value;
	var customerEnteredPwd=document.getElementById("pwd").value;
	/*
	if(customerEnterdUid.indexOf("@") == -1)
	{
		alert("invalid email id");
		return false;
	}	
	*/
	
	if(customerEnterdUid == "")
	{
		document.getElementById("uid").style="background:red";
		alert("userid is mandatory");
		return false;
	}	
	else if(customerEnteredPwd == "")
	{
		alert("password is mandatory");
		return false;
	}	
	return true;
}

function test(){
	
	var result=add(20,30);
	console.log("result");
	var a = 10;
	var b = false;
	var c = 10.0;
	var d = ["john","jane","mike","andy"];
	console.log(d[2]);
	
	var e = "hello";
	
	// object data type
	var student = {
		name: "john",
		age: 10,
		address: {
			city: "ny",
			zip: 123
		}
	};
	
	console.log("student city:" + student.address.city   );
	
	try {
		console.log("entering exception handling")
		var i = 0;
		console.log(abcd);
		console.log("1");
	} 
	catch (error){
		console.log("2");
	} 
	finally {
		console.log("3");
	}
	
	
	for (var j = 0; j < 5; j++) {
		console.log("hi:" + j);
	}
	

	var i = 0;
	if (i == 0) {
		console.log("i is zero");
	} else {
		console.log("i is non zero");
	}

	while (i < 2) {
		console.log("hello:" + i);
		i++;
	}
	 	

}

function checkIfEmpty() {
	var emailElement=document.getElementById("emailTextBox");
	//var emailElement=$("table").val();
	if (emailElement.value == "") {
		alert("empty email id")
		document.getElementById("logo").style = "background:red";
		//$("#logo").css("background", "white");
	}
	else if (emailElement.value.indexOf("@") == -1) {
		alert("invalid email id")
	}
}

function checkUser() {
	
	var xmlData="<address>";
	xmlData+="<streetNumber>2131</streetNumber>";
	xmlData+="<streetName>dsfsdf</streetName>";
	xmlData+="<city>sfdsf sdf</city>";
	xmlData+="<state>dsf</state>";
	xmlData+="<zip>sd333423</zip>";
	xmlData+="<country>234sf</country>";
	xmlData+="</address>";
	
	var jsonObject={
		"streetNumber" : 2131,
		"streetName": "dsfsdf",
		"city":"sfdsf sdf",
		"state":"dsf",
		"zip":"sd333423",
		"country":"234sf"
	};
	
	
	
	
	var checkUserAjaxObj = {
		url: '/IsUserAvailable',
		type: 'get',
		data: "uid="+ $("#uid").val(),
		context: this,
		success: function(data) {
			if (data == "unavailable")
				alert("userid already taken");
		},
		error: function(data) {
			console.log("failure");
		}
	};
	$.ajax(checkUserAjaxObj);

}
function taclicked(){
	alert("someone clicked on text area");
}
function checkUid(){
	// read value from uid text box
	var customerTypedUid=$("#uid").val();
	if(customerTypedUid=="")
		// writing into the uid text box
		$("#uid").val("please type userid");
}
function hideLogin(){
	$("#login").slideUp(8000);
	$("#uid").css("background","red");
}
function showLogin(){
	$("#login").slideDown(8000);
}
$(document).ready(function() {
	//$("#uid").blur(checkUser);
	//$("#pwd").click(hideLogin);
	//$("#pwd").blur(showLogin);
	//$("#reviews").click(taclicked);
	 
});
