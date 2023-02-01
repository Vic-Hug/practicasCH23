let miVarible = 34;

let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); // por instancia

let miArreglo02 = [31,32,33,34];
console.log("dato de miArreglo en el indice 0 - "+ miArreglo02[0]);
console.log("dato de miArreglo en el indice 1 - "+ miArreglo02[1]);
console.log("dato de miArreglo en el indice 2 - "+ miArreglo02[2]);
console.log("dato de miArreglo en el indice 3 - "+ miArreglo02[3]);
console.log("el tamaño o numero de elementos del arreglo02 es: " + miArreglo02.length);

let miArreglo03 = ["Hola","que", "tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log("El tamaño del miArreglo03 es : " + miArreglo03.length);

let miArreglo04 = [{nombre:"Hugo"},{apellido:"Fernandez"},{edad: "23"}];
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[0].nombre);
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[1].apellido);
console.log("Elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04[2].edad);
console.log("El tamaño de miArreglo04 es: " + miArreglo04.length)

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort(): " + nuevoArreglo00.sort());
console.log("Orden de mi arregloNuevo metodo pop(): " + nuevoArreglo00.pop());
console.log("Orden de mi arregloNuevo metodo push: " + nuevoArreglo00.push(10));
console.log("Orden de mi arregloNuevo metodo reverse(): " + nuevoArreglo00.reverse());

let otroArreglo = ["que ","hola", "tal", "como"];
console.log(" con sort(): " + otroArreglo.sort());
console.log(" metodo pop(): " + otroArreglo.pop());
console.log("metodo push: " + otroArreglo.push("estas","hola"));
console.log(" metodo reverse(): " + otroArreglo.reverse());

console.log("javascript"[2]);
console.log("javascript".length);

let matriz = [
              [1,2,3],
              [4,5,6],
              [7,8,9]
            ]
console.log("tamaño: " + matriz.length);
console.log(matriz[1][1]);
console.log(matriz[2][1]);
console.log(matriz[0][2]);