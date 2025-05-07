# **Centro de Diagnóstico para Pets**
Um sistema de gerenciamento de diagnósticos veterinários desenvolvido em Java seguindo o padrão de arquitetura MVC (Model-View-Controller).
## 📋 **Descrição do Projeto**
O Centro de Diagnóstico para Pets é uma aplicação de console que permite o cadastro de animais e seus respectivos diagnósticos médicos. O sistema foi desenvolvido utilizando o padrão arquitetural MVC para garantir a separação de responsabilidades e facilitar a manutenção do código.

## 🎯 **Funcionalidades**

Cadastrar animais (nome, espécie, idade)
Registrar diagnósticos para animais cadastrados
Listar todos os diagnósticos registrados
Interface de usuário por linha de comando

## 🏗️ **Estrutura do Projeto**
```
src/
├── Main.java
├── Model/
│   ├── Animal.java
│   └── Diagnostico.java
├── View/
│   └── DiagnosticoView.java
└── Controller/
    └── DiagnosticoController.java
```

### Descrição dos Componentes

#### Main.java
Classe principal que inicializa o controlador e a view, e inicia a aplicação.

#### Model
- **Animal.java**: Representa um animal com nome, espécie e idade.
- **Diagnostico.java**: Representa um diagnóstico médico, contendo referência ao animal, descrição e data/hora.

#### View
- **DiagnosticoView.java**: Interface com o usuário via console, usando Scanner para entrada de dados.

#### Controller
- **DiagnosticoController.java**: Gerencia a lógica de negócios entre o modelo e a view.

## 🔧 **Requisitos Técnicos**
- Java JDK 17 ou superior

## 🚀 **Como Executar**

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/centro-diagnostico-pets.git
   cd centro-diagnostico-pets
   ```
2. Compile o projeto:
   ```bash
   javac Main.java Model/*.java View/*.java Controller/*.java -d out/
   ```
3. Execute a aplicação:
      ```bash
   java -cp out/ Main
   ```

## 📊 **Fluxo de Uso**

1. Ao iniciar a aplicação, um menu será exibido com as opções disponíveis.
2. Cadastre um ou mais animais escolhendo a opção 1.
3. Registre diagnósticos para os animais cadastrados escolhendo a opção 2.
4. Visualize todos os diagnósticos escolhendo a opção 3.
5. Para sair da aplicação, escolha a opção 0.

## 📝 **Padrão MVC**
O projeto implementa o padrão de arquitetura Model-View-Controller (MVC):

- **Model:** Representa os dados e a lógica de negócios.
- **View:** Responsável pela interface do usuário e apresentação dos dados.
- **Controller:** Faz a mediação entre o Model e a View, processando as entradas do usuário.

## 🎓 **Detalhes da Implementação**

- Uso de ArrayList para armazenar animais e diagnósticos
- Tratamento de exceções para entradas inválidas
- Relacionamento entre classes (Diagnóstico tem referência a um Animal)
- Entrada de dados via Scanner

## 👥 Autores

Renan Dias Utida - RM 558540
