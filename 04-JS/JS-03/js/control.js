// if (condition) {
//     Bloque código
// } else{}

let edad = parseInt(prompt("Escribe tu edad"));

if (edad <= 17) {
    document.write("<h2> Tas chiqitin </h2>");
} else if (edad === 18) {
    document.write("Eres mayor de edad");
} else if (edad > 18) {
    document.write("<h2>Tas ruco</h2>");
} else {
    document.write("<h2>este no es un numero valido</h2>");
}


//(5 == "5") true
//(5 === "5") falso



