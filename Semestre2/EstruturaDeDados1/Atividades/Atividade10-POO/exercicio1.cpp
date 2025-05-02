#include <iostream>
using namespace std;

// Definindo a classe Matematica
class Matematica {

    public:
        // Método que soma dois números inteiros
        double soma(double a, double b) {
            return a + b;
        }
    
        double subtracao(double a, double b) {
            return a - b;
        }
    
        double multiplicacao(double a, double b) {
            return a * b;
        }
    
        double divisao(double a, double b) {
            if (b == 0) {
                cout << "Erro: Divisão por zero não é permitida." << endl;
            }
            return a / b;
        }
};

int main() {

    Matematica mat;

    double a, b;
    cout << "Digite dois números: ";
    cin >> a >> b;
    
    cout << "Divisão: " << mat.divisao(a, b) << endl;
    cout << "Soma: " << mat.soma(a, b) << endl;
    cout << "Subtração: " << mat.subtracao(a, b) << endl;
    cout << "Multiplicação: " << mat.multiplicacao(a, b) << endl;


    return 0;
}