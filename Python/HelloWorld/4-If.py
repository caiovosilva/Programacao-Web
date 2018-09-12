quente = 40
frio = 10
atual = int(input("Qual a temperatura atual?"))
if(atual==quente):
    print("QUENTE")
elif(atual==frio):
    print("FRIO")
elif(quente>atual and atual>frio):
    print("NORMAL")
else:
    print("EXTREMA")