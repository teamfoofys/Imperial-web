function viewkm_manager()
{
	alert("kitchen managers are given below:");
	var oXmlHttp = zXmlHttp.createRequest();
	  oXmlHttp.open("Post", "viewkitchenmanager", true);	 
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



function addkm_manager()
{
var sid=document.getElementById('km_id').value;
var sname=document.getElementById('km_name').value;
var spwd=document.getElementById('km_pwd').value;
var saddr=document.getElementById('km_addr').value;
var semail=document.getElementById('km_email').value;
var scont=document.getElementById('km_contact').value;
	 var oXmlHttp = zXmlHttp.createRequest();
	  oXmlHttp.open("Post", "addkitchenmanager?km_id="+sid+"&km_name="+sname+"&km_pwd="+spwd+"&km_addr="+saddr+"&km_email="+semail+"&km_contact="+scont, true);	 
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