//prueba efectiva
//const indexTest = require ("../calculadora"); ecma5
import { indexTest } from "../calculadora"; //ecma6
test('test suma', () => {
  const r = indexTest.suma(3,2);
  expect (r).toBe(6);
});
test.todo('test resta');
test.todo('test mult');
test.todo('test divide');
