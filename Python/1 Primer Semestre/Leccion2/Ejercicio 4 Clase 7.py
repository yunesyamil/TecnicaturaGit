# Ejercicio 4 - Etapas de vida
edad = int(input('Indique su edad: '))
mensaje = None
if 0 <= edad < 10: #Sintaxis simplificada
    mensaje = 'La infancia es increíble y bella'
elif 10 <= edad < 20:
    mensaje = 'Tienes muchos cambios, mucho que estudiar'
elif 20 <= edad < 30:
    mensaje = 'Amor y comienza el trabajo'
elif 30 <= edad < 40:
    mensaje = 'Conseguimos un buen trabajo como programador'
elif 40 <= edad < 50:
    mensaje = 'Viajamos y conocemos muchos lugares'
elif 50 <= edad < 60:
    mensaje = 'Transmitimos enseñanzas y aprendemos de los mas jóvenes'
elif 60 <= edad < 70:
    mensaje = 'Una etapa donde no deberían haber problemas y de relax'
elif 70 <= edad < 80:
    mensaje = 'Nostalgia'
elif 80 <= edad < 90:
    mensaje = 'Han pasado 84 años *_*'
elif 90 <= edad < 100:
    mensaje = 'Con más olor a cajón que a manzanas ._.'

else: mensaje = 'Creo que ya no va a venir por mi'
print(f'Tu edad es: {edad}, {mensaje}')