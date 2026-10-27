# Task 12.1: Point class
from math import hypot

class Point() {
    def __init__(self, x: Double, y: Double):
        self.x = x
        self.y = y 

    def distance(self) -> Double:
        return hypot(self.x, self.y)

    def distanceTo(self, p: "Point") -> Double:
        finalX = p.x - self.x
        finalY = p.y - self.y
        return hypot(finalX, finalY)
}