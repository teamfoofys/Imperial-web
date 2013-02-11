function check_authen()
{
	var usrname=document.getElementById('uname').value;
	var pwd=document.getElementById('pass').value;
	
	
	 var oXmlHttp = zXmlHttp.createRequest();
	 oXmlHttp.open("Post", "authentication?uname="+usrname+"&pass="+pwd, true);	 
	  oXmlHttp.onreadystatechange = function () {
	      if (oXmlHttp.readyState == 4) {
	          if (oXmlHttp.status == 200) {
	        	
	        	var res=oXmlHttp.responseText;
	        	
	        	alert(res == 1);
	        	if(res == 1)
	        		{}
	        	else
	        	{window.location="LoginSuccess.jsp";}
	          } else {
	        	 //Display11("An error occurred: " + oXmlHttp.statusText); //statusText is not always accurate

	          }
	      }            
	  };
	  oXmlHttp.send(null);
}
	      
	      