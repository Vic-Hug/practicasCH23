let texto = "Hola Mundo";
let msj = "";
let anterior = "";

for (let index = 0; index < texto.length; index++) {
    if (msj != ""){
        anterior = texto [index-1];
        if (anterior != " " && texto [index]!= " ") {
            msj += ".";
        }
    }
msj += texto[index];
}
console.log(msj);



/*



if (texto.includes("L")) {
    console.log("---> L");
}else {
    console.log("Ese caracter no esta en texto");
}

let palabra = texto.split(" ");
console.log(palabra[0]+ " / "+ palabra[1]);

let palabra= texto.substring(5,7);
console.log(palabra);

let palabra = texto.substr(2);
console.log(palabra);

let mensaje = texto.toUpperCase();
console.log(mensaje);

for (let index = 0; index < texto.length; index++) {
    mensaje += texto[index] + " ";
    
}
mensaje = mensaje.trim()
console.log(mensaje);

let mensaje = "El texto tiene " + texto.length +" caracteres";
console.log(mensaje);
*/