import calculadora

def menu():
    escolha = int(input("Selecione uma das opções:\n1. Somar\n2. Subtrair\n"))
    if escolha == 1:
        a = int(input("Insira o primeiro número para a soma: "))
        b = int(input("Insira o segundo número para a soma: "))
        print(calculadora.somar(a, b))
    if escolha == 2:
        a = int(input("Insira o primeiro número para a subtração: "))
        b = int(input("Insira o segundo número para a subtração: "))
        print(calculadora.subtrair(a, b))