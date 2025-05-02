#include <iostream>
#include <string>
using namespace std;

// Definindo a classe Estacionamento
class Estacionamento {
    
    public:
        int dia;
        double horaEntrada;
        double horaSaida;

    double solicitarDados() {
        cout << "Digite o dia da semana (1-7): ";
        cin >> dia;
        cout << "Digite a hora de entrada (0-24): ";
        cin >> horaEntrada;
        cout << "Digite a hora de saída (0-24): ";
        cin >> horaSaida;

        return 0;
    };

    string diaSemana() {
        switch (dia) {
            case 1: return "Domingo";
            case 2: return "Segunda-feira";
            case 3: return "Terça-feira";
            case 4: return "Quarta-feira";
            case 5: return "Quinta-feira";
            case 6: return "Sexta-feira";
            case 7: return "Sábado";
            default: return "Dia inválido";
        }
    };

    double  calcularValor() {
        double valor = 0;
        double horas = horaSaida - horaEntrada;

        if (horas < 0) {
            cout << "Erro: Hora de saída deve ser maior que hora de entrada." << endl;
            return -1;
        }

        if (dia < 1 || dia > 7) {
            cout << "Erro: Dia inválido." << endl;
            return -1;
        } else {
            valor = horas * 5.0;
        }

        return valor;
    }
};

int main () {
    Estacionamento e;

    cout << "Bem-vindo ao sistema de estacionamento!" << endl
         << "Horas de funcionamento: 6h às 23h." << endl;

    e.solicitarDados();
    double valor = e.calcularValor();

    cout << "Dia da Semana: " << e.diaSemana() << endl 
         << "Valor a pagar: R$ " << valor << endl;
    cout << "Obrigado por utilizar nosso sistema!" << endl;

    return 0;
}