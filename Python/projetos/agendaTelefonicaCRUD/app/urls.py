from django.urls import path
from . import views 

urlpatterns = [
    path('', views.list, name='list.html'),
    # path('app/list', views.list, name='list'),
]
