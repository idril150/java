""" def sum_n_nums(numbers):
    a=0
    print(type(numbers))
    for item in numbers:
        a+=item
    return a 

print(sum_n_nums([1,2,3,4,5,6,7,8,9,10]))
print(sum_n_nums([1,2,3,4,5])) """

""" lista=["hola","juan","pedro","pepe"]
lista.extend([32])
print(lista)
print(lista.index("pedro"))
print(lista[2]) """

""" tupla=("hola",32,"juan",True,"juan")
print(tupla)
print("juan" in tupla)
print(tupla.count("juan"))
print(len(tupla)) """

""" diccionari={"chiapas":"tuxtla","coahuila":"saltillo","mexico":"cdmx"}
print(diccionari["mexico"])
print(diccionari)
diccionari["tabasco"]="viyahermosa"
print(diccionari)
diccionari["tabasco"]="villa hermosa"
print(diccionari)
del diccionari["tabasco"]
print(diccionari) """

""" def sis (a):
    if a<5:
      print("a es menor que 5")
    elif(a==5):
        print("a es igual a 5")
    else:
        print("a es mayor que 5")
    
sis(5) """

""" for i in range(5, 51, 5):
    print(f"vuelta numero {i}")
 """
 
""" def hacer_si(a):
    while a<=10:
        print(a)
        a+=a        

hacer_si(1) """

""" def fibonacci_pyramid(levels):
    a, b = 0, 1
    index = 0
    for i in range(1, levels + 1):
        for j in range(i):
            print(a, end=" ")
            a, b = b, a + b
            index += 1
        print()
fibonacci_pyramid(6) """

""" a,b=0,1
for i in range(1,10,1):
    for j in range(i):
       print(a,b)
       a,b=b,a+b   
    print() """
    
import mysql.connector

config ={
    'user':'root',
    'password':'',
    'host':'localhost',
    'database':'db1'
}

cnx=mysql.connector.connect(**config)
cursor = cnx.cursor()
query = ("SELECT nombre FROM empleado")
cursor.execute(query)
for name in cursor:
    print(name)
    
def actualizar_empleado(id_empleado, nuevo_nombre, nuevo_bonop):
    try:
        # Conectar a la base de datos
        cnx = mysql.connector.connect(**config)
        cursor = cnx.cursor()

        # Consulta para actualizar los valores del empleado
        query = """
        UPDATE empleado 
        SET nombre = %s, bonop = %s 
        WHERE id = %s
        """
        data = (nuevo_nombre, nuevo_bonop, id_empleado)

        # Ejecutar la consulta
        cursor.execute(query, data)

        # Confirmar los cambios
        cnx.commit()

        print(f"Empleado con ID {id_empleado} ha sido actualizado.")

    except mysql.connector.Error as err:
        print(f"Error: {err}")
    finally:
        # Cerrar el cursor y la conexión
        if cursor:
            cursor.close()
        if cnx:
            cnx.close()

actualizar_empleado(2, "Gustabo", 500.0)
cnx.close
