document.addEventListener("DOMContentLoaded",()=> {
'use strict';
alert("Добро пожаловать на мой первый сайт!")

let form = document.querySelector('.js-form'),
    formInputs = document.querySelectorAll('.js-input'),
    inputEmail = document.querySelector('.js-input-email'),
    inputPhone = document.querySelector('.js-input-phone'),
    inputName = document.querySelector('.js-input');

function validateName(name){
	let re = /^[A-Za-z]{2,20}$/;
	return re.test(String(name));
}

function validatePhone(phone) {
    let re = /^380(50|63|66|67|68|91|92|93|97|96)\d{7}$/;
    return re.test(String(phone));
}

function validateEmail(email) {
    let re = /^[A-Za-z0-9_.-]{6,12}\@(gmail.com|ukr.net)$/;
    return re.test(String(email));
}

let btn = document.querySelector('.btn');
btn.addEventListener('click', checkForm);
function checkForm () {
    let emailVal = inputEmail.value,
        phoneVal = inputPhone.value,
        nameVal = inputName.value,
    	emptyInputs = Array.from(formInputs).filter(input => input.value === '');
    
    formInputs.forEach(function (input) {
        if (input.value === '') {
            input.classList.add('error');

        } else {
            input.classList.remove('error');
        }
       
    });

    if (emptyInputs.length !== 0) {
        alert('Заполните все поля!');
        return false;}

    if(!validateName(nameVal)) {
        inputName.style.borderColor = "red";
        alert('Мы Вас не слышим!');
        return false;}    

	else if(!validatePhone(phoneVal)) {
        inputPhone.style.borderColor = "red";
        alert('Мы Вас не слышим!');
        return false;}    

    else if(!validateEmail(emailVal)) {
        inputEmail.style.borderColor = "red";
        alert('Мы Вас не слышим!');
    	return false;}

    else{alert ("Мы Вас слышим!");
    	inputName.style.borderColor = "green";
    	inputPhone.style.borderColor = "green";
    	inputEmail.style.borderColor = "green";
    	return false;
}	
};
});
