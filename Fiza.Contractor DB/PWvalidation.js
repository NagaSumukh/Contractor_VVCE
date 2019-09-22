function validatepsw()
{
	var psw=document.getElementById("pass");
	var rpsw=document.getElementById("pass1");
	if(psw.value!=rpsw.value)
	{
		rpsw.setCustomValidity("Passwords doesn't match");
		return false;
	}
	else
	{
		rpsw.setCustomValidity("");
		return true;
	}
}