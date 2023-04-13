import React from 'react'
const productos = [
    {titulo: 'Naranjas', esFruta:true, id: 3},
    {titulo: 'Motos', esFruta:false, id: 1},
    {titulo: 'Reloj', esFruta:false, id: 2},
    {titulo: 'pera', esFruta:true, id: 3},
    
];

function TercerComponente() {
    const lista = productos.map(producto=> <li key={producto.id}> {producto.titulo}</li>)
  return (
    <div>
    <h1> TercerComponente </h1>
    <h2> Jugando con map()</h2>
    <ol>
        {lista}
    </ol>
    </div>
  )
}

export default TercerComponente
