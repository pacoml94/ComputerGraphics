class Vertex:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def getZ(self):
        return self.z

    def __repr__(self):
        return "[X: "+str(self.x)+", Y: "+str(self.y)+", Z: "+str(self.z)+"]"
