class Object:
    def __init__(self, name, nVertex, nFaces, vertexList, facesList):
        self.name = name
        self.nVertex = nVertex
        self.nFaces = nFaces
        self.vertexList = vertexList
        self.facesList = facesList

    def getName(self):
        return self.name
    def getnVertex(self):
        return self.nVertex
    def getnFaces(self):
        return self.nFaces
    def getVertexList(self):
        return self.vertexList
    def getFacesList(self):
        return self.facesList

    def __repr__(self):
        index = 1
        string = "Name: "+self.name+"\nNº vertex: "+str(self.nVertex)+"\nNº faces: "+str(self.nFaces)+"\n"
        for i in self.vertexList:
            string += "V{0}: {1}\n".format(index, i)
            index += 1

        index = 1

        for j in self.facesList:
            string += "F{0}: {1}\n".format(index, j)
            index += 1

        return string
