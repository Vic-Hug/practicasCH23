let miVariable = 5;


//let miArray = new Array();
console.log("miArray" + miArray[0]);
console.log("miArray" + miArray[1]);


console.log("miArray1 " + miArray1[0][1]);
console.log("miArray1 " + miArray1[0][2]);
console.log("miArray1 " + miArray1[2][1]);
console.log("miArray1 " + miArray1[1][2]);
console.log("miArray1 " + miArray1[1][0]);

console.log("todo el indice " + miArray1[0]);
console.log("todo el indice " + miArray1[1]);
console.log("todo el indice " + miArray1[2]);

/************************** Cilco For ************************************* */

let miArray = [2, 3, 4, 5, 6, 7];

for (let i = 0; i <= 5; i++) {
    console.log("imprimiendo miArray -> " + miArray);
}

let miArray1 = [ 
    [1, 2, 3],    
    [4, 5, 6],     
    [7, 8, 9]
];
let matrizR= [
    [],[],[]
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
    }
    
}
console.log("MatrizR->"+matrizR);

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("matrizR -> " + miArray1[i][j]);
    }
}
/************************ while *************************** */
/*
let varible inicio

while(condicion){

}



*/

let contador = 0;
while(contador < 10){
    console.log(contador);
    contador++;
}