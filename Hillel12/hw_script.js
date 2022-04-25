function hw_1(a, b) {

	if (a % b === 0){
		c = a / b
		console.log("Делится "+c)
	}
	else{
		c = a % b
		console.log("Делится с остатком "+c)
	}
}

function hw_2(a, b) {

	for (var i = 1; i <= a; i++){
		console.log(b.repeat(i))
	}

}

let a = prompt("Введите a")
let b = prompt("Введите b")

hw_1(a, b)

let h = prompt("Введите высоту треугольника")
let s = prompt("Знак рисования треугольника")

hw_2(h,s)

var hw_3;
	for (var i = 0; i <= 100; i++){
		if(i % 2 != 0){
			console.log(i)
		}
	}

var hw_4;
	
	let n = 1000
	let j = 0

	do{
		j = j + 1
		n = n / 2
	} while (n > 50)

	console.log("Количество итераций: "+j)
	console.log("Результат деления: "+n)