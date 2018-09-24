from django.shortcuts import render
from .models import Pessoa
def home(request):
    return render(request, 'app/home.html', {})

def list(request):
    pessoas = Pessoa.objects.order_by('nome')
    return render(request, 'app/list.html', {'pessoas':pessoas})
    # return render(request, 'app/list.html', {})
