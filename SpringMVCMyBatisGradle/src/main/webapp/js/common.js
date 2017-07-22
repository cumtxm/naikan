function $(objStr){return document.getElementById(objStr);}  
window.onload = function(){  
    //����cookieֵ����ʾ�ϴεĵ�½��Ϣ  
    var usernameValue = getCookieValue("username");  
    $("username").value = usernameValue;  
    var passwordValue = getCookieValue("password");  
    $("password").value = passwordValue;      
    //д�����¼�  
    $("submit").onclick = function()  
    {  
        var usernameValue = $("username").value;  
        var passwordValue = $("password").value;  
        //��������֤��ģ�⣩      
        var isAdmin = usernameValue == "admin" && passwordValue =="123456";  
        var isUserA = usernameValue == "userA" && passwordValue =="userA";  
        var isMatched = isAdmin || isUserA;  
        if(isMatched){  
            if( $("saveCookie").checked){    
                setCookie("username",$("username").value,24,"/");  
                setCookie("password",$("password").value,24,"/");  
            }      
            alert("��½�ɹ�,��ӭ��," + usernameValue + "!");  
            self.location.replace("index.jsp");  
        }  
        else alert("�û���������������������룡");      
    }  
}  