'use strict';

fetch(`/project1/GetPendingReimbursementRequestsServlet`)
.then((response) => {
    console.log(response);
    return response.json();
    })
.then((obj) => {
    console.log(obj);
    //here we have our object thanks to the prior response.json()
    //let's modify the DOM
    //loop through properties of our object:
    for(let x in obj) {
        // we'll produce a list item for each property
        let li = document.createElement("li");
        // add info to the li:
        li.innerText = `${x} : ${obj[x]}`;
        // to add elements to the DOM we must append them to existing
        // elements:
        info.appendChild(li);
    }
})
.catch((err) => {
    console.log(err);
});