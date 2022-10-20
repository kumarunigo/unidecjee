

function isUseridTaken(){
	var uid=document.getElementById("uid").value;
	if(uid=="john1234")
		alert("userid is taken");

}

function testClick(){
	// javascript accessing html element(userid text box)
	//var uid=document.getElementById("uid").value;
	
	// jquery accessing html element(userid text box)
	var uid=$("#uid").val(); // accessing by id attribute
	var pass=$(".pwd").val(); // accessing by class attribute
	// $("textarea") // accessing by element name
	
	if(uid=="")
	{
	// 1000 millisec = 1 sec
		alert("userid is mandatory");
		$("#loginButton").slideUp(5000);
		return false;
	}
	else if(pass=="")
	{
		alert("password is mandatory");
		$("#loginButton").slideUp(5000);
		return false;
	}
	else{
		$("#loginButton").slideDown(5000);
		return true;	
		}
}


// javascript addition method
function add( a, b   ){
	var sum=a+b;
	return sum;
}


test();
function test(){
	var a = 10;
	a="john";
	var cc='a';
	var b = false;
	var c = 10.0;
	var d = ["john", "jane","mike"];
	console.log( d[1] );
	var e = "hello";
	// javascript object(complex data type)
	var student = {
		name: "john",
		age: 10,
		address: {
			city: "ny",
			zip: 123
		}
	};
	
	console.log("students zip:"+student.address.zip);
	
	try {
		console.log("in exception handling");
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
	 
	var result=add(10,20);
	console.log("10 +20 :"+result);
	
}

function checkIfEmpty() {
	var useridTextbox=document.getElementById("uid").value;
	var passwordTextbox=document.getElementById("pwd").value;
	if(useridTextbox == "")
	{
		document.getElementById("uid").style="background:red";
	//	alert("userid is mandatory");
		return false;
	}	
	else if(passwordTextbox == ""){
		document.getElementById("pwd").style="background:red";
	//	alert("password is mandatory");
		return false;
	}
	return true;
}

function checkUser() {
	var ajaxJavascriptObject={
        url: '/checkUser',
        type: 'post',
        data: 'userid='+$("#uid").val(),
        context: this,
        success: function (data) {
               if(data=="unavailable")
		       alert("userid already taken");
        },
        error: function (data) {
                  console.log("failure");
        }
    };
    $.ajax(ajaxJavascriptObject);
}
/*
	$("input") = access by html element name
	$("#uid") = access by attribute id
	$(".classuid") = access by attribute class
*/
function readWriteJquery (){
	var cusTypedUserid=$("#uid").val();
	if(cusTypedUserid == "")
	{	
		$("#uid").css("background","red");
		$("#loginButton").fadeOut(10000);
		//$("#loginButton").hide();
	}
	else
		$("#loginButton").slideDown(10000);
		//$("#loginButton").show();
	
		//$("#uid").val("please type userid");
}
function checkUser (){
	
	var serverCommunicationObject={
	        url: '/checkUser',
	        type: 'post',
	        data: {
	                  userid:$("#uid").val()
			},
	        context: this,
	        success: function (data) {
	                  if(data == "unavailable")
				  		alert("userid already taken");
	        },
	        error: function (data) {
	                  console.log("failure");
	        }
	};
	
	$.ajax(serverCommunicationObject);	
	
	
}
// all event listener for html
// are tracked here
$(document).ready(function() {
	$("#uid").blur(checkUseridEntered);
});
function checkUseridEntered(){
// READ what customer typed in this text box
	var userid=$("#uid").val(); 
	if(userid==""){
		//WRITE message in text box
		$("#uid").val("userid is mandatory"); 
		$("#uid").css("background","red");
	}

} 