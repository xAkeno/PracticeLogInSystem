
function toLogin(){
    console.log("hello");
    window.location.href = "index.html";
}
function toSignup(){
    window.location.href = "signup.html";
}
//used to process signup
function submitForm() {
    //input
    const username = document.querySelector('input[placeholder="Username"]').value;
    const email = document.querySelector('input[placeholder="Email"]').value;
    const password = document.querySelector('input[placeholder="Password"]').value;

    if(username == ""){
        alert("Please insert a username");
    }
    else if (email == ""){
        alert("Please insert a email");
    }
    else if(password == ""){
        alert("Please insert a password");
    }
    else{
        const data = {
            username: username,
            email: email,
            password: password
        };
        
        fetch("http://localhost:8080/api/create", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        })
        .then(response => response.json())
        .then(data => {alert("Successfull Created"),window.location.href = "index.html";})
        .catch(error => alert('Error: ' + error));
    }   
}
//used to process log in
function loginAcc(){
    //input
    const username = document.querySelector('input[placeholder="username"]').value;
    const password = document.querySelector('input[placeholder="password"]').value;
    
    const data = {
        username: username,
        password: password,
        email: ""
    }
    fetch("http://localhost:8080/api/login",{
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    }
    ).then(response => 
        {
            if(response.ok){
                alert("Log In Successfully")
            }
            else alert("Log in Failed");
        }
    )
    .then(data => {})
    .catch(error => alert('Log-in Failed: ' + error));
}


