var empInfo;
function addData()
{
    var clientname = document.getElementById("clientname").value
    var projectname = document.getElementById("projectname").value;
    var budget = document.getElementById("budget").value;
    var obj = sessionStorage.getItem("obj");
    let emp = {clientname:clientname,projectname:projectname,budget:budget};
    if(obj==null)
    {
        empInfo = new Array();
        empInfo.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(empInfo));
    }
    else 
    {
        obj = JSON.parse(obj);
        obj.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    document.getElementById("clientname").value=""
    document.getElementById("projectname").value=""
    document.getElementById("budget").value=""
    document.getElementById("out").innerHTML="Data Added.."
}