// JavaScript sincrono
alert("cohoret 23");
console.log("Hola, buen día");
alert("Día del gatito");
console.log("adios");

// setTimeout(
//     function (){
//         console.log("Hola mundo, con retraso");
//     }, 0    console.log("sorpresa");


const myCollback = () => console.log("Hola mundo con retraso");
setTimeout(myCollback, 0);

console.log("sorpresa");

