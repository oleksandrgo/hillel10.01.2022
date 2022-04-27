'use strict';
/*let a = 15;
let b = 8;
let res = a % b;
if (res !=0) {
	console.log('Делится с остатком ' + res);
} else {
	console.log('Делится, результат деления: ' + (a / b));*/
/*var c = 0,
  d = 0;
var max = 9;
 var star = "*";
while (c < max) {
  star = "*";
  for (d = 0; d < 1 * c; d++) star += "*";
  console.log(star);
  c++;
} */
/* var f = 0;
while(f<100){
  f++;
  if(f%2) console.log(f);
}*/
/* var n = 1000;
 while ( n > 50) {
 	n = n / 2;
 	console.log ("n");
 };*/
 var button = document.getElementById("btn1")
 function firstEventFunction(){
 	var email = document.getElementById("1e").value;
 	var name = document.getElementById("1n").value;
 	var phone = document.getElementById("1p").value;
 	if (email.match(/(\w{6,12}@(gmail\.com)|(ukr\.net))/i)
 		&& phone.match(/^380+(50|63|66|67|68|91|92|93|96|97)\d{7}$/)
 		&& name.match(/^[a-zA-Z]{2,20}$/gm)){
 		alert("We will hear you");}
 	else {
 		alert ("We don't hear you");
 		}
 	}
 