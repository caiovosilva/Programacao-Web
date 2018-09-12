from datetime import datetime

class MusicStore:
    owner = "sem dono"
    openTime, closeTime = 9, 21
    def  displayHoursOfOperation(self):
        return "Diariamente das 9:00 AM - 21:00 PM"

    def setOwner(self,owner):
        self.owner=owner

    def isOpen(self):
        hora = datetime.now().hour.__int__()
        minuto = datetime.now().minute.
        if(datetime.now().hour)