let calcularPrecio = {
  porcentajeImpuestos: 16,
  gastosDeEnvio: 10,
  calcularTotal: function (precio) {
    let total = (1 + this.porcentajeImpuestos / 100) * precio;
    return total + this.gastosDeEnvio;
  },
};

console.log("El precio total es: "+calcularPrecio.calcularTotal(23.34));
