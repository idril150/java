""" 
clase - modelo donde se redactan las caracteristicas comunes de un grupo
de objetos

Intancia - objeto perteneciente a una clase

modularización - permite reutilizar pedazos de codigo de un programa en otro

"""

""" class Coche():
    largoChasis=250
    anchoChasis=125         #4 prpiedades
    ruedas=4
    marcha=False
    
    def arrancar(self):
        self.marcha=True
        
    def estado(self):
        if(self.marcha):
            return "el coche a arrancado"       #2 comportamientos
        else:
            return "el coche era parado"

ferrari = Coche()

print(f"el coche mide {ferrari.largoChasis}cm de largo y {ferrari.anchoChasis}cm de ancho\nademas posee {ferrari.ruedas} ruedas")

print(ferrari.estado())
ferrari.arrancar()
print(ferrari.estado()) """


class Coche():
    def __init__(self):
        self.__largoChasis=250         #estado inicial
        self.__anchoChasis=125         #4 prpiedades
        self.__ruedas=4
        self.__marcha=False
    
    def arrancar(self, llave):
        if llave:
            self.__marcha=True
            return "el coche esta en marcha"
        else:
            self.__marcha=False
            return "el coche esta parado"
    
    def estado(self):
        print(f"el coche tiene {self.__ruedas} ruedas, un ancho de {self.__anchoChasis}cm\nun largo de {self.__largoChasis}cm")
        

carro = Coche()
carro.estado()
print(carro.arrancar(True)) 
x
#segundo objeto
print("\n\nsegundo objeto")
carro2=Coche()
carro2.__ruedas=2
carro2.estado()
print(carro2.arrancar(False)) 