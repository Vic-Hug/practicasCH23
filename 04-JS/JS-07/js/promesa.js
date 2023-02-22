const myURL = document.URL.toString();
const promesa = fetch(myURL);
promesa.then(resultado => console.log(resultado), 
e => console.log(`error callback ${e}`));