function view_feedback()
{
	alert("feedback from customers are:");
	var oXmlHttp = zXmlHttp.createRequest();
	  oXmlHttp.open("Post", "viewfeedback", true);	 
	  oXmlHttp.onreadystatechange = function () {
	      if (oXmlHttp.readyState == 4) {
	          if (oXmlHttp.status == 200) {
	        	alert(oXmlHttp.responseText);
	          } else {
	        	 //Display11("An error occurred: " + oXmlHttp.statusText); //statusText is not always accurate
	          }
	      }            
	  };
	  oXmlHttp.send(null);
	}



