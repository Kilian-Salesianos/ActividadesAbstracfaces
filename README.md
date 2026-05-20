# Actividades Abstract Faces

Proyecto realizado en Java que contiene:

- Interfaces
- Clases abstractas
- Herencia
- Sobreescritura de métodos
- Organización por paquetes
- Uso de `Scanner`
- Menús con `do while`

---

# Estructura del proyecto

```text
src
│
├── App.java
│
└── net
    └── salesianos
        ├── calculo
        │   └── Calculo.java
        │
        ├── rectangulo
        │   └── Rectangulo.java
        │
        ├── circulo
        │   └── Circulo.java
        │
        ├── vehiculo
        │   └── Vehiculo.java
        │
        └── coche
            └── Coche.java
```

---

# Actividad 1 - Figuras geométricas

## Interfaz `Calculo`

La interfaz `Calculo` define dos métodos:

```java
double calcularArea();
double calcularPerimetro();
```

Todas las figuras geométricas deben implementar estos métodos.

---

## Clase `Rectangulo`

La clase `Rectangulo`:

- Implementa la interfaz `Calculo`
- Tiene:
  - base
  - altura
- Calcula:
  - área
  - perímetro

### Fórmulas

```text
Área = base * altura
Perímetro = (base * 2) + (altura * 2)
```

---

## Clase `Circulo`

La clase `Circulo`:

- Implementa la interfaz `Calculo`
- Tiene:
  - radio
- Calcula:
  - área
  - perímetro

### Fórmulas

```text
Área = PI * radio²
Perímetro = 2 * PI * radio
```

---

# Actividad 2 - Vehículos

## Clase abstracta `Vehiculo`

La clase `Vehiculo` contiene:

### Atributos

- color
- número de puertas
- número de ruedas
- modelo
- matrícula

### Métodos abstractos

```java
arrancar();
pararMotor();
mover();
```

Al ser abstracta, no puede instanciarse directamente.

---

## Clase `Coche`

La clase `Coche` hereda de `Vehiculo`.

### Atributos propios

- `motorEnMarca`
- `litrosDelTanque`

### Funcionamiento

- Al arrancar:
  - consume 1 litro
  - enciende el motor
- Al mover:
  - consume 1 litro
  - solo puede moverse si el motor está encendido
- Al quedarse sin combustible:
  - el coche se detiene

---

# Clase `App`

La clase `App` contiene el programa principal.

## Menú principal

El programa utiliza un menú con `do while`:

```text
1 -> Actividad 
2 -> Actividad 
0 -> Salir
```

---

## Opción 1

Solicita datos al usuario para:

- Crear un rectángulo
- Crear un círculo

Después muestra:

- Datos introducidos
- Área
- Perímetro

---

## Opción 2

Realiza automáticamente:

- Crear un coche con 20 litros
- Intentar moverlo apagado
- Arrancarlo
- Moverlo varias veces
- Mostrar combustible restante
- Cambiar combustible a 2 litros
- Intentar moverlo 3 veces más
