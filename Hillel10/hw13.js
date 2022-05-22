var re_name = /^([A-Za-z]{2,20})/;
var re_mail = /^([A-Za-z]{6,12})+\@(gmail.com|ukr.net)/;
var re_phone = /(380-)?(50|63|66|67|68|91|92|93|97|96)\d{7}$/

function onClickFunction(){

	var name = document.querySelector("#name").value
	var phone = document.querySelector("#phone").value
	var email = document.querySelector("#email").value
	
	if (re_name.test(name) && re_phone.test(phone) && re_mail.test(email)) {
		alert("Мы вас слышим");
	}else{
		alert("Мы вас не слышим");
	}
}