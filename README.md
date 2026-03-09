# Coordinate Analysis in Java

## Description

This project implements a Java program that analyzes a sequence of points in the Cartesian plane.

The program reads pairs of integer coordinates from the standard input until the pair `0 0` is entered. Each pair represents a point `(x, y)` in the Cartesian coordinate system.

After reading the input, the program performs several calculations related to the distance of each point from the origin `(0,0)`.

Points located in the **third quadrant** (where `x < 0` and `y < 0`) are ignored according to the problem requirements.

---

## Features

The program calculates and prints:

- The **closest point to the origin**
- The **furthest point from the origin**
- The **average distance to the origin** of all valid points
- A message indicating whether **any point lies on the coordinate axes**

A point lies on an axis when:

- `x = 0` (point on the Y-axis)
- `y = 0` (point on the X-axis)

---

## Distance Formula

The distance between a point `(x, y)` and the origin `(0,0)` is calculated using the formula:

distance = √(x² + y²)


In the implementation, this is calculated using:


Math.sqrt(x * x + y * y)


---

## Input

The program expects a sequence of integer pairs representing coordinates.

Input ends when the pair:


0 0


is entered.

### Example Input


63 65
1 1
5 5
2 3
20 20
0 0


---

## Output

The program prints:

- The closest point to the origin
- The furthest point from the origin
- The average distance to the origin
- Whether there are points located on the axes

### Example Output


Closest to origin: 1 1
Furthest to origin: 63 65
Average distance to origin: 26.179163951646263


---

## Technologies Used

- Java
- Standard input using `Scanner`
- Basic mathematical operations

---

## How to Run

1. Compile the program:


javac CoordinateAnalysis.java


2. Run the program:


java CoordinateAnalysis


3. Enter coordinate pairs from the keyboard.

---

## Author

Student contribution for a Java programming exercise.

This implementation demonstrates the use of loops, conditionals, mathematical calculations, and input processing in Java.