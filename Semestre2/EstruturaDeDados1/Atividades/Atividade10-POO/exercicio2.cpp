#include <iostream>
using namespace std;

class Triangulo {
    public:

        double a, b, c;

        void EntradaDados() {
            cout << "Digite os lados do triângulo: " << endl;
            cin >> a >> b >> c;
        }

        // Método que verifica se é triângulo
        bool eTriangulo (double a, double b, double c) {
            if (a == 0 || b == 0 || c == 0) {
                cout << "Não é um triângulo. Programa finalizado." << endl;
                exit(0);
                

            } else {
                cout << "É um triângulo. Seguimos com o programa..." << endl;
                return true;
            }
        }

            // Método que verifica qual tipo de triângulo é
            void tipoTriangulo (double a, double b, double c) {
                if (eTriangulo(a, b, c) == true){

                    if (a == b && b == c){
                        cout << "Triângulo equilátero." << endl;
                    } 
                    else if (a == b || a == c || b == c) {
                        cout << "Triângulo isósceles." << endl;
                    } 
                    else {
                        cout << "Triângulo escaleno." << endl;
                    }

                }
            }


};

int main () {

    Triangulo t;
    t.EntradaDados();
    t.tipoTriangulo(t.a, t.b, t.c);

}