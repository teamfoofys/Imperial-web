function add_steward()
{
var sid=document.getElementById('ste_id').value;
var sname=document.getElementById('ste_name').value;
var spwd=document.getElementById('ste_pwd').value;
var saddr=document.getElementById('ste_addr').value;
var semail=document.getElementById('ste_email').value;
var scont=document.getElementById('ste_contact').value;
alert(scont);
	 var oXmlHttp = zXmlHttp.createRequest();
	  oXmlHttp.open("Post", "Addsteward?ste_id="+sid+"&ste_name="+sname+"&ste_pwd="+spwd+"&ste_addr="+saddr+"&ste_email="+semail+"&ste_contact="+scont, true);	 
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