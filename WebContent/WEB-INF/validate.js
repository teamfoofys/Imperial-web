function fnLogin()
{
	   alert("Hi..");
	   
	    var return1;
	    return1=fnCheckUserID();
	 
	    if(return1==false)
	    {
	        /* If UserID is invalid then return false */  
	    	return false;
	    }
	    
}


function fnCheckUserID()
{
	/* USerID should not be NULL */
	if(document.actionForm.uname.value=="")
	{
	 	alert("User ID Cannot be Blank!");
	 	document.actionForm.uname.select();
	 	document.actionForm.uname.focus();
		return false;
	} 
	
	return true;
}
	
