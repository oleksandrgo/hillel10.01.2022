First Task
const a = 10;
const b = 5;

if ((a%b)===0){
    console.log("Divide")
}else{
    console.log("Not Divide")
};


//Second Task
function Drawtriangle(height,symbol) {
    let triangle = '';
for (i=0; i<height; i++){
    triangle +=symbol;
    console.log(triangle);
}}

//Third task
let a = 100;
for (i=0; i<=a; i++){
    if (i%2!==0){
        console.log(i)
    }
}

///Fourth Task
let counter = 0;
let a = 1000;
for (i=50;i<=a; i++){
    a = a/2; 
    counter++;
    console.log(a);
}
console.log(counter)