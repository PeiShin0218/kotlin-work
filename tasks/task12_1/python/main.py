# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from Point import Point

def main():
    p = Point(4.0, 3.0)
    print(p.x)
    print(p.y)
    
    origin = Point(0.0, 0.0)
    print(p.distanceTo(origin))
    print(p.distanceTo(Point(4.5, 7.0)))

if __name__ == "__main__":
    main()