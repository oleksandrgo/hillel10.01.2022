"use strict";
let name ="Аnna"
let re1 = /^[a-zA-Z0-9_-]{2,20}$/;
 let button1=document.querySelector('#submit')
submit.addEventListener("click",validateName)
function validateName(){
    if(!re1.test(name)){
        alert('Мы услышим вас');
        
    }else{
        alert('Мы вас не слышим');
        
    }
};
let email = "qwerty@gmail.com "
let re2 = /[a-zA-Z0-9._%+-]{6,12}.+@(gmail\.com | ukr\.net)/
let button2=document.querySelector('#submit')
submit.addEventListener("click",validateEmail)
function validateEmail(){
    if(!re2.test(email)){
       alert ('Мы услышим вас');
        
    }else{
      alert('Мы вас не слышим');
        
    }
};
let phone ="+380000000000"
let re3 =/^\+380\.+50|63|66|67|68|91|92|93|97|96\d{7}$/
let button3=document.querySelector('#submit')
submit.addEventListener("click",validatePhone)
function validatePhone(){
    if(!re3.test(phone)){
        alert('Мы услышим вас')
        
    }else{
        alert('Мы вас не слышим');
        
    }
};

let msg = "Поиск номеров заказов на покупку, сделанных вашей компанией. Такие номера могут быть представлены в разном формате, например:"
let re4 = /^(?:(?![\s\n]+$)[\s\S])+$/;
let button4=document.querySelector('#submit')
submit.addEventListener("click",validateMsg)
function validateMsg(){
    if(!re4.test(msg)){
        alert('Мы услышим вас')
        
    }else{
     alert('Мы вас не слышим');
        
    }
};



