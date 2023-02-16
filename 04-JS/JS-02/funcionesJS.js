
/* let miNombre =" Alan Sandoval Villa" //declaracion global 
console.log(miNombre);

function  funcionMiNombre(){
    let nombre = "Alan";
    console.log(nombre);

}

funcionMiNombre();

function funcion1(){
    let valor = 2 //Declaracion local 
    valor = valor + 3
    return valor

}
console.log("El resultado es ", funcion1());

function funcion2(){
    let valor = 2
    valor = valor + 3
    console.log("El resultado de la funcion 2 es ", valor);

}
funcion2();

let variableGlobal = 8
function funcion3(){
    let variableLocal="El valor es: "
    console.log(variableLocal + variableGlobal);

}
funcion3()

function funcion4 (valor){
    let numero =6
    numero = numero * valor
    return numero
}
console.log(funcion4(8)); 
//Funciones aninimas
let miFuncion0 = function (parametro){
    parametro= parametro * 2
    return parametro
}
console.log("llamando la funcion anonima", miFuncion0(4));

let funcion01 = function(caracteres){
    return "hola " + caracteres
}("lunes")
console.log("El resultado es:", funcion01 );

let suma = (x,y) => {return x+y}
let resultado = suma(5,3)
console.log(resultado);

function calcularPrecioTotal1(precio,impuesto){
    let porcentajeImpuesto=1+(impuesto/100)
    let precioConImpuesto = precio*porcentajeImpuesto
    let gastosEnvio=10
    return precioConImpuesto+gastosEnvio
}
console.log(calcularPrecioTotal1(23.34,10));

let calcularPrecioTotal2= function(precio){
    let precioConImpuesto = precio*1.16
    let gastosEnvio=10
    return precioConImpuesto+gastosEnvio
}
console.log(calcularPrecioTotal2(23.34));

let calcularPrecioTotal3= (precio) =>{
    let precioConImpuesto = precio*1.16
    let gastosEnvio=10
    return precioConImpuesto+gastosEnvio
}
console.log(calcularPrecioTotal3(23.34)); */

//declaracion de objetos

let miObjeto={
    nombre: "Juan",
    edad: 20,
    datos: function(){
        let mensaje = "tu nombre es: "+ this.nombre;
        mensaje+= " tienes "+this.edad + " años";
        console.log(mensaje);   

    }
    
};
miObjeto.datos();

let constructor = function (){
    let objPersona ={
        nombre: "Juan",
        nss: 2235,
        datosPersona: function (){
            let msj= "eres" + this.nombre+ "el numero nss es "+ this.nss;
            console.log(msj);
        },
        otroMetodo: function (parametro){
            let numero=8;
            console.log("la suma es: "+ (numero+parametro));
        }
    };
    return objPersona
}
let varObjReg=constructor()// crear la variable objeto
varObjReg.datosPersona();
varObjReg.otroMetodo(20);