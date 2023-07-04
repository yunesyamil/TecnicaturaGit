print('Determinamos la solución lógica de la siguiente expresion')
# Creamos las variables
a = float(input('ingrese el valor de a: '))
b = float(input('ingrese el valor de b: '))

exp1 = (3+(5*8))<3
exp2 = (((-6/3)*4) + 2 < 2)
exp3 = (a < b)

print(f'Los valores ingresados son: a: {a} y b: {b}')
condicion = exp1 and exp2 or exp3
print(f'el resultado de la expresion es: {condicion}')

# vemos que pasa por partes
print(f'(3+(5*8))<3  es  {exp1}')
print(f'(((-6/3)*4) + 2 < 2)  es  {exp2}')
print(f'(a<b)  es  {exp3}')