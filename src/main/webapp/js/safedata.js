/**
 * Created by Tehnic3 on 2/12/2017.
 */



function loadPolicyDescription(hostname){

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    password = encodeURIComponent(password);
    window.alert(password);
    $.ajax  ({
        url: 'safeServlet?server='+hostname+'&username='+username+'&password='+password
    }).done(function (response) {
        listPolicyDescription(response.policyDescription)
    })
}

function listPolicyDescription(policyDescription) {
    var list = document.getElementById('descriptionList');
    var listHtml = '';

    for (var i = 0; i < policyDescription.length; i++) {
        var server = policyDescription[i];
        listHtml=listHtml+server+'</br>';
    }
    list.innerHTML = listHtml;

}