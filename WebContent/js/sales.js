function view_sales()
{
	alert("sales details are as follows:");
	var oXmlHttp = zXmlHttp.createRequest();
	  oXmlHttp.open("Post", "viewsales", true);	 
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



