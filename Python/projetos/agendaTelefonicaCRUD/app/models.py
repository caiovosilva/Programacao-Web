from django.db import models

class Pessoa(models.Model):
    nome = models.CharField(max_length=200)
    tel = models.CharField(max_length=15)
    cel = models.CharField(max_length=15)

    def salvar(self):
        self.save()

    def __str__(self):
        return self.nome
