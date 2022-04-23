'use strict'

//Задача 1. Остаток от деления


/*let a = 7;
let b = 2;
if ((a % b)===0) {
	console.log("Делится: " + (a/b));
} else if ((a%b) != 0) {
	console.log("Делится с остатком: " +(a % b));
}*/

//_______________________________________________

//Задача 2. Рисуем треугольник

//Первый способ

/*function drawTriangle(size,string){
size = 10;//здесь задаем кол-во строк
string = "";
for (let i = 1; i <= size; i++) {
  for (let j = 0; j < i; j++) {
    string = string + "+";//здесь задаем символ,которым рисуем треугольник
  }
  string = string + "\n";// "\n" - новая строка 
}
console.log(string);
}
drawTriangle()*/


//Второй способ

function showTriangle(size,string){
size = 5;//кол-во строк
string = "#";//символ,которым рисуем треугольник
 for (let i = 1; i <= size; i++){ 
 	let me = string.repeat(i)//повторяет строки,указаное кол-во раз
    console.log(me);}
}
showTriangle()

//______________________________________________

//Задача 3. Столбец нечетных чисел

 
/*for(let i = 0; i<100; i++){
 	if(i % 2 != 0){
 		console.log(i);
 	}
 }*/

//______________________________________________
 
//Задача 4. Количество итераций

 
/*let n = 100;
let i = 0;

 while (true){
 	n = n/2;
 	console.log(n);
 	i++
 	if (n <= 50){
 		break;
 	}
 }
console.log("Получилось число: " + n);
console.log("Количество итераций: " +i);*/







