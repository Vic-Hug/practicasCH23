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