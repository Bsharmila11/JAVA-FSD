function retrieveData()
{
   var obj = sessionStorage.getItem("obj");
    if(obj==null)
    {
        document.getElementById("out").innerHTML="Record not present"
    }
    else 
    {
        let empData = JSON.parse(obj);
        for(let i =0;i<empData.length;i++)
        {
            let tableTag = document.createElement("p");
            let tableTagValue = document.createTextNode(`Client Name : ${empData[i].clientname} Project Name is : ${empData[i].projectname}Budget is : ${empData[i].budget}`);
            tableTag.appendChild(tableTagValue);
            document.getElementById("result").appendChild(tableTag);
        }

    }
    
  
    
}