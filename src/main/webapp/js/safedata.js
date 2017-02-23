/**
 * Created by Tehnic3 on 2/12/2017.
 */



function loadPolicyDescription(hostname){

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if(username==null || username=="") {

        alert("Input Username "+username);
        //location.href = window.location.href;
    }else if(password==null || password=="") {
        alert("Input Password "+password);
        //location.href = window.location.href;
    }else {




        if (typeof hostname == "undefined") {
            hostname = document.getElementById('hostname').value;
        }

        password = encodeURIComponent(password);
        //window.alert(password);
        $.ajax({
            url: 'safeServlet?server=' + hostname + '&username=' + username + '&password=' + password
        }).done(function (response) {
            listPolicyDescription(response.policyDescription, response.server)
        })
   }
}



function loadAllPolicyNames(){

    for(var i=0;i<20;i++){
        loadPolicyDescription("safedata"+i+".mxserver.ro");
        loadPolicyDescription("safedata"+i+".r1soft.ro");
    }
}


function listPolicyDescription(policyDescription,backupServer) {


    var list;
    var date = new Date();
    var listHtml ='<b>'+backupServer+'</b></br><i>Synced on '+date.toLocaleTimeString()+'</i></br>';


    for (var i = 0; i < policyDescription.length; i++) {
        var server = policyDescription[i];
        listHtml=listHtml+server+'</br>';
    }



    if ( !document.getElementById(backupServer)){
        listHtml = '<div id='+backupServer+'>'+listHtml;
        listHtml = listHtml+'</div><br>';
        list = document.getElementById('descriptionList');
        list.innerHTML += listHtml;
    }
    else{
        list = document.getElementById(backupServer);
        list.innerHTML = listHtml;
    }





}