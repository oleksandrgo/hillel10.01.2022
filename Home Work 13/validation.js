function validate() {

    var messages = [];

    var firstName = document.getElementById('first-name').value;
    if (!/[A-Za-z]{2,20}/.test(firstName)) {
        messages.push("Name is incorrect");
        
    }
    var phoneNumber = document.getElementById('phone-number').value;
    if (!/(380)(50|63|66|67|68|91|92|93|97|96)(\d{7})$/.test(phoneNumber)) {
    messages.push("Phone number is incorrect");
    
    }
    var email = document.getElementById('email').value;
    if (!/([a-zA-Z]{6,12}@)(gmail.com|ukr.net)/.test(email)) {
    messages.push("Email is incorrect");
   
    }
    if (messages.length > 0) {
        alert("Мы вас не слышим\n" + messages.join('\n'));
        return false;
    } else {
        alert("Мы услышим вас")
        return true;
    }
  }
