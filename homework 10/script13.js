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

form.onsubmit = function () {
    let nameVal = inputName.value,
        emailVal = inputEmail.value,
        phoneVal = inputPhone.value,
        emptyInputs = Array.from(formInputs).filter(input => input.value === '');
    formInputs.forEach(function (input) {
        if (input.value === '') {
            input.classList.add('error');

        } else {
            input.classList.remove('error');
        }
    });

        
if (emptyInputs.length !== 0) {
        alert('Заповніть поля!');
        return false;}

    else if(!validateName(nameVal)) {
        inputName.style.borderColor = "red";
        alert('Ми Вас не чуємо!');
        return false;}    

    else if (!validatePhone(phoneVal)) {
        inputPhone.style.borderColor = "red";
        alert('Ми Вас не чуємо!');
        return false;}

    else if (!validateEmail(emailVal)) {
        inputEmail.style.borderColor = "red";
        alert('Ми Вас не чуємо!');
        return false;}
    
    else{alert ("Ми Вас чуємо!!!");
    inputName.style.borderColor = "green";
    inputPhone.style.borderColor = "green";
    inputEmail.style.borderColor = "green";
    return false;
}   
};
   