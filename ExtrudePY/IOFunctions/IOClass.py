from decimal import Decimal

from domain.Vertex import Vertex
from domain.Face import Face


class IOClass:
    def readFile(self):
        faceList = list()
        vertexList = list()
        with open("/home/francisco/PycharmProjects/ComputerGraphics/ExtrudePY/IOFunctions/TEXTO.obj", "r") as fichero:
            for i in fichero:
                if i[0] == 'v':
                    i = i.split(" ")
                    vertexList.append(Vertex(Decimal(i[1]), Decimal(i[2]), Decimal(i[3])))
                if i[0] == 'f':
                    i = i.split(" ")
                    faceList.append(Face(int(i[1]), int(i[2]), int(i[3])))

        return vertexList, faceList

