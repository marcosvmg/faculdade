

#include <iostream>
#include <stack>
using namespace std;

int main () {

    //size() = retorna o tamanho da pilha.
    //top() = retorna o valor da última pilha à ser inserida.
    //emplace() = insere na pilha.
    //pop() = remove a última pilha à ser inserida

    stack <string> restaurante;
    //no restaurante ficará assim:
    restaurante.emplace("prato 1"); // 0 | "prato 4" // 3
    restaurante.emplace("prato 2"); // 1 | "prato 3" // 2
    restaurante.emplace("prato 3"); // 2 | "prato 2" // 1
    restaurante.emplace("prato 4"); // 3 | "prato 1" // 0

    cout << "Qtd pratos: " << restaurante.size() << endl;

    cout << "Retirando o " << restaurante.top() << endl; // 4
    restaurante.pop(); // -1

    cout << "Qtd pratos: " << restaurante.size() << endl;


    cout << "Retirando o " << restaurante.top() << endl; // 3
    restaurante.pop(); // -1

    cout << "Qtd pratos: " << restaurante.size() << endl;


    cout << "Retirando o " << restaurante.top() << endl; // 2
    restaurante.pop(); // -1

    cout << "Qtd pratos: " << restaurante.size() << endl;


    cout << "Retirando o " << restaurante.top() << endl; // 1
    restaurante.pop(); // -1

    cout << "Qtd pratos: " << restaurante.size() << endl;


    return 0;
}