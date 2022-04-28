'use strict';

let form = document.querySelector('.js-form'),
    formInputs = document.querySelectorAll('.js-input'),
    inputName = document.querySelector('.js-input'),
    inputEmail = document.querySelector('.js-input-email'),
    inputPhone = document.querySelector('.js-input-phone');


function validateName(name){
    let a = /[A-Za-z]{2,20}$/;
    return a.test(String(name));
}

function validatePhone(phone) {
    let a = /380(50|63|66|67|68|91|92|93|97|96)\d{7}$/;
    return a.test(String(phone));
}

function validateEmail(email) {
    let a = /[A-Za-z]{6,12}\@(gmail.com|ukr.net)$/;
    return a.test(String(email));
}

let btn = document.querySelector('.btn');
btn.addEventListener('click', checkForm);
function checkForm () {
    let emailVal = inputEmail.value,
        phoneVal = inputPhone.value,
        nameVal = inputName.value;

    if(!validateName(nameVal)) {
        alert('Ми Вас не чуємо!');
  }    

    else if (!validatePhone(phoneVal)) {
        alert('Ми Вас не чуємо!');
}

    else if (!validateEmail(emailVal)) {
        alert('Ми Вас не чуємо!');
}
    
    else{alert ("Ми Вас чуємо!!!");
}
};