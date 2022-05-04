"use strict";

  
  const form = document.querySelector("form");
  const name = document.querySelector(".formName");
  const mail= document.querySelector(".formMail");
  const phone= document.querySelector(".formPhone");
  const msg= document.querySelector(".formMsg");
  const check = document.querySelector(".form-check-input");
  let isSubmit = false;

  const regExpName = /^[a-zA-Z0-9_-]{2,20}$/;
const regExpEmeil = /[A-Z0-9._%+-]+(@gmail.com|ukr.net)[A-Z0-9-]+.+.[A-Z]{6,12}/;
const regExpPhone = /^\+?\d{1,9}?[- .]?\(?(?:\d{2,3})\)?[- .]?\d\d\d[- .]?\d\d\d\d$/;
const regExpMsg = /^(?:(?![\s\n]+$)[\s\S])+$/;

  const submit = () => {
    alert("Мы услышим вас");

    for (let elem of form.elements) {
      if (
        !elem.classList.contains("btn") &&
        !elem.classList.contains("form-check-input")
      ) {
        elem.value = "" ;
      }

      if (elem.classList.contains("form-check-input")) {
        elem.checked = false;
      }
    }
  };

  const validate = (elem) => {
    if (elem.name === "username") {
      if (!regExpName.test(elem.value) && elem.value !== "" ) {
        elem.nextElementSibling.textContent =
          "Введите  имя пользователя";
      } else {
        elem.nextElementSibling.textContent == "";
      }
    }

    if (elem.email === "user_email") {
      if (!regExpEmail.test(elem.value) && elem.value !== "") {
        elem.nextElementSibling.textContent = "Введите корректный email";
      } else {
        elem.nextElementSibling.textContent = "";
      }
    }

    if (elem.phone === "phone") {
      if (!regExpPhone.test(elem.value) && elem.value !== "") {
        elem.nextElementSibling.textContent = "Пожалуйста, заполните свой номер телефона +380 или 0";
      } else {
        elem.nextElementSibling.textContent = "";
      }
    }

    if (elem.msg === "user_message") {
      if (!regExpPhone.test(elem.value) && elem.value !== "") {
        elem.nextElementSibling.textContent = "Введите сообщение";
      } else {
        elem.nextElementSibling.textContent = "";
      }
    }
  };
  for (let elem of form.elements) {
    if (
      !elem.classList.contains("btn") &&
      !elem.classList.contains("form-check-input")
    ) {
      elem.addEventListener("blur", () => {
        validate(elem);
      });
    }
  }

  form.addEventListener("submit", function (event) {
    event.preventDefault();
    for (let container of form.elements) {
      if (
        !container.classList.contains("btn") &&
        !container.classList.contains("form-check-input")
      ) {
        if (container.value === ("")) {
          container.nextElementSibling.textContent =("Данные не введены");
          isSubmit = false;
        } else {
          isSubmit = true;
        }
      }
    }

    if (isSubmit) {
      if (check.checked) {
        submit();
      } else {
        alert("Подтвердите согласие с условиями");
      }
    }
  });
