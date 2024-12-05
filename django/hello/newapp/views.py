from django.shortcuts import render , HttpResponse

def index(request):
    # return HttpResponse("this is me")
    context = {
        "variable":"this is a variable added via views.py"
    }
    return render(request , 'file_1.html',context)
def about(request):
    return HttpResponse("this is about  page")


# Create your views here.
