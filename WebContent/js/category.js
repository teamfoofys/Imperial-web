function submenu(id)
{ 	
var cat1=document.getElementById(id).innerHTML;	
alert(cat1);
var oXmlHttp = zXmlHttp.createRequest();

oXmlHttp.open("Get", "submenu?item="+cat1, true);	 
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

