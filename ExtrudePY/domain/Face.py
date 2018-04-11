class Face:
    def __init__(self, v1, v2, v3):
        self.v1 = v1
        self.v2 = v2
        self.v3 = v3

    def __repr__(self):
        return "[V1: "+str(self.v1)+", V2: "+str(self.v2)+", V3: "+str(self.v3)+"]"
