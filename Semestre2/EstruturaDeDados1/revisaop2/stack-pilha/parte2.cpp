#include <iostream>
#include <stack>

using namespace std;

//empty() = retorna se a pilha está vazia ou não

class verificaLouca {
public:
    static void verificar(const stack <string>& restaurante) {
        if (restaurante.empty()) {
            cout << "Louça vazia" << endl;
        } else {
            cout << "Louça à lavar" << endl;
        }
    }
};

int main () {

    stack <string> restaurante;

    verificaLouca louca;

    louca.verificar(restaurante);

    for (int i = 0; restaurante.size() < 10;i++) {
        cout << "Empilhando " << restaurante.emplace("Prato " + to_string(i + 1)) << endl;
    }

    cout << "Pratos na louça: " << restaurante.size() << endl << endl;

    cout << "Lavando a louça.." << endl << endl;

    while (!restaurante.empty()) {

        cout << "Lavando " << restaurante.top() << endl;
        restaurante.pop();

    }

    cout  << endl << "Louça lavada!" << endl << endl;

    //assimilar com a tabela da professora na lousa:

    for (int i = 0; restaurante.size() < 10;i++) {
        cout << "Endereço: " << &restaurante.top() << restaurante.emplace(", Valor: Prato " + to_string(i + 1)) << endl;
    }


    return 0;
}