from django.contrib import admin
from django.urls import path
from newapp import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.index,name = "hiiii"),
    path('about', views.about,name = "about"),
]
