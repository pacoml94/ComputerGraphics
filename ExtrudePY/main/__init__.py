#! /usr/bin/python3
from IOFunctions.IOClass import IOClass
from domain.Object import Object

read = IOClass()
v, f = read.readFile()

i = 0

while i < len(v):
    print("Vertex {0}: {1}".format(i,repr(v[i])))
    i+=1

j = 0

while j < len(f):
    print("Face {0}: {1}".format(j, repr(f[j])))
    j+=1


def extrusion():
    obj = Object("Figure.obj", len(v), len(f), v, f)
    print(repr(obj))

    return


extrusion()
