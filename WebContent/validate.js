function fnLogin()
{
		document.getElementById('error1').innerHTML='';
		document.getElementById('error2').innerHTML='';
	    var return1,return2;
	    
	    return1=fnCheckUserID();
	    if(return1==false)
	    {
	       return false;
	    }
	    
	    return2=fnCheckPassword();
	    if(return2==false)
	    {
	       return false;
	    }
	    return true;
}


function fnCheckUserID()
{	
	if(document.actionForm.uname.value=="")
	{
	 	document.getElementById('error1').innerHTML='*Username cannot be blank!!';//UserName cannot be blank!!
	 	document.actionForm.uname.select();
	 	document.actionForm.uname.focus();
		return false;
	} 
	
	return true;
}

function fnCheckPassword()
{	
	if(document.actionForm.password.value=="")
	{
		document.getElementById('error2').innerHTML="*Password cannot be blank!!";//Password Cannot be Blank!!	 	
	 	document.actionForm.password.select();
	 	document.actionForm.password.focus();
		return false;
	} 
	
	return true;
}


	
	
